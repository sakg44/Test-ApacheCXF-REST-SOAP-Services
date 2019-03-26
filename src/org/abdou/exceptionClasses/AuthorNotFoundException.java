package org.abdou.exceptionClasses;

public class AuthorNotFoundException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8147455302591334263L;
	
	private Long id;
    private String author;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
    
    

}
