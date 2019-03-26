package org.abdou.ws.contrat;

import java.util.Date;
import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebService;

import org.abdou.exceptionClasses.AuthorNotFoundException;
import org.abdou.models.Author;
import org.abdou.models.Book;

@WebService(name="AuthorService", serviceName="AuthorService")
public interface IAuthorService {
	
	List<Book> getBooksFromAuthor(@WebParam(name="authorFirstName")String authorFirstName, @WebParam(name="authorLastName") String authorLastName) throws AuthorNotFoundException;

	Author getAuthor(@WebParam(name="id")Long id) throws AuthorNotFoundException;

	List<Author> getAuthorsByName(@WebParam(name="firstName")String firstName,@WebParam(name="lastName")String lastName) throws AuthorNotFoundException;

	Long createAuthor(@WebParam(name="firstName")String firstName, @WebParam(name="lastName")String lastName,@WebParam(name="nationality") String nationality, @WebParam(name="dateOfBirth")Date dateOfBirth,@WebParam(name="dateOfDeath")Date dateOfDeath);

}
