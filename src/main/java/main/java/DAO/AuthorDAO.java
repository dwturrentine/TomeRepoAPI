package main.java.DAO;

import java.util.List;

import main.java.Models.Author;

public interface AuthorDAO {

	//CRUD Operations
	//CREATE, READ, UPDATE, and DELETE
	
	public Author getAuthor(int id);
	public Author getAuthorFN(String firstName);
	public Author getAuthorLN(String lastName);
	public Author getAuthorBY(int birthYear);
	public Author getAuthorDY(int deathYear);
	public List<Author> getAllAuthor();
	public boolean addAuthor(Author a);
	public boolean updateAuthor(Author change);
	public boolean deleteAuthor(int id);
}
