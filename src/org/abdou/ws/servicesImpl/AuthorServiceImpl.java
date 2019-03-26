package org.abdou.ws.servicesImpl;

import java.util.Date;
import java.util.List;

import javax.jws.WebService;

import org.abdou.exceptionClasses.AuthorNotFoundException;
import org.abdou.models.Author;
import org.abdou.models.Book;
import org.abdou.ws.contrat.IAuthorService;

//@WebService(endpointInterface="org.abdou.ws.contrat.IAuthorService")
public class AuthorServiceImpl implements IAuthorService {

	public List<Book> getBooksFromAuthor(String authorFirstName, String authorLastName) throws AuthorNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	public Author getAuthor(Long id) throws AuthorNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Author> getAuthorsByName(String firstName, String lastName) throws AuthorNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	public Long createAuthor(String firstName, String lastName, String nationality, Date dateOfBirth,
			Date dateOfDeath) {
		// TODO Auto-generated method stub
		return (long) 1;
	}

}
