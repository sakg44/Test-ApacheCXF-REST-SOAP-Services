package org.abdou.ws.contrat;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.xml.ws.WebServiceContext;

import org.abdou.exceptionClasses.BookNotFoundException;
import org.abdou.models.Author;
import org.abdou.models.Book;
import org.abdou.models.BookType;
import org.apache.cxf.jaxrs.ext.MessageContext;

@WebService(name="BookService", serviceName="BookService")

public interface IBookService {
	
	

    // Generate either XML OR JSON for JAX-RS [REST] services - Rendered by
    // JAXB!
 
	String getBookName(@WebParam(name="name") String name);
	
	Book getBook( @WebParam(name="id")Long id) throws BookNotFoundException;

    List<Book> getBooksByTitle(@WebParam(name="title")String title);

    List<Author> getAuthorsFromBook(@WebParam(name="bookTitle") String bookTitle) throws BookNotFoundException;

    Long createBook(@WebParam(name="title")String title,@WebParam(name="bookType") BookType type, @WebParam(name="year") int year, @WebParam(name="authorsId") Long... authorsId);
}
