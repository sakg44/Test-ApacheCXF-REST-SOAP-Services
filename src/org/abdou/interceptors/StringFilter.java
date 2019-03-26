package org.abdou.interceptors;

import java.io.IOException;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import org.apache.cxf.jaxrs.ext.MessageContext;



public class StringFilter implements ContainerResponseFilter {
	private @Context MessageContext jaxrsContext;

	@Override
	public void filter(ContainerRequestContext requestContext, ContainerResponseContext responseContext)
			throws IOException {


	


		if(responseContext.hasEntity()) {
			if(responseContext.getEntityType().toString().equals(String.class.toString()))
			{
				if(!responseContext.getEntity().toString().startsWith("<") && !responseContext.getEntity().toString().startsWith("{"))
				{
					String mediatype=jaxrsContext.getHttpServletRequest().getRequestURI();

					int 	uriLength =mediatype.split("/").length;	

					if(mediatype.split("/")[uriLength-1].contains(".xml"))
						responseContext.setEntity(stringToXML(responseContext.getEntity().toString(), "MSG"), null,MediaType.APPLICATION_XML_TYPE);
					else
						responseContext.setEntity(stringToJSON(responseContext.getEntity().toString(), "MSG"), null,MediaType.APPLICATION_JSON_TYPE);

				}
			}

		}


	}

	private String stringToJSON (String str, String key) {

		return "{\""+key+"\":\""+str+"\"}";
	}

	private String stringToXML (String str, String node) {

		return "<"+node+">"+str+"</"+node+">";
	}



}


