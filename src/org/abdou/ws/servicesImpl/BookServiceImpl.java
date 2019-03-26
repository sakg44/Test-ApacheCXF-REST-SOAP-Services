package org.abdou.ws.servicesImpl;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.ws.WebServiceContext;

import org.abdou.exceptionClasses.BookNotFoundException;
import org.abdou.models.Author;
import org.abdou.models.Book;
import org.abdou.models.BookType;
import org.abdou.ws.contrat.IBookService;
import org.apache.catalina.core.ApplicationContext;
import org.apache.cxf.binding.xml.XMLBinding;
import org.apache.cxf.jaxrs.ext.MessageContext;
import org.apache.cxf.jaxrs.provider.xmlbeans.XMLBeansJSONProvider;
import org.apache.cxf.jaxws.context.WebServiceContextImpl;
import org.apache.jasper.xmlparser.XMLString;
import org.codehaus.jackson.JsonFactory;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.map.util.JSONPObject;
import org.eclipse.jetty.util.ajax.JSONObjectConvertor;

import com.sun.xml.xsom.parser.XMLParser;

//@WebService(endpointInterface="org.abdou.ws.contrat.IBookService")
@Path("BookServices")
public class BookServiceImpl implements IBookService{

	//	@Context WebServiceContext jaxwsContext;
	@Context MessageContext jaxrsContext;


	@WebMethod
	@GET
	@Path("/getBookById/{id}")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Book getBook(@PathParam("id")Long id) throws BookNotFoundException {

		Book myBook=new Book();
		myBook.setType(BookType.ROMAN_HISTORIQUE);
		myBook.setTitle("Madame Bovary");
		myBook.setId(id);
		return myBook;
	}

	public List<Book> getBooksByTitle(String title) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Author> getAuthorsFromBook(String bookTitle) throws BookNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	public Long createBook(String title, BookType type, int year, Long... authorsId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@WebMethod
	@GET
	@Path("/getName/{name}")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public String getBookName(@PathParam("name")String name) {
		// TODO Auto-generated method stub
	/*	if(jaxrsContext.getSecurityContext()!=null)
		{
			String myuri=jaxrsContext.getUriInfo().getPath();

		String mediatype=jaxrsContext.getHttpServletRequest().getRequestURI();
		
	   int 	uriLength =mediatype.split("/").length;	
			
			if(mediatype.split("/")[uriLength-1].contains(".json"))
				 
			
			return "{\"MSG\":\""+name+"\"}";
			else
				return "<return>"+name+"</return>";

		}
		else
		{
			return name+ " Soap implementation";
			
		}*/
	
		return name;



	}
}
