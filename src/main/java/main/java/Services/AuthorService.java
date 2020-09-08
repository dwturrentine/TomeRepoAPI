package main.java.Services;

import java.util.List;

import main.java.DAO.AuthorDAO;
import main.java.DAO.AuthorDAOImpl;
import main.java.Models.Author;

public class AuthorService {
	
	AuthorDAO ad = new AuthorDAOImpl();
	
	//CRUD operation calls and any business logic.

	public boolean addAuthor(Author a) {
		return ad.addAuthor(a);
	}
	
	public Author getAuthor(int id) {
		return ad.getAuthor(id);
	}
	
	public List<Author> getAllAuthor() {
		return ad.getAllAuthor();
	}
	
	public boolean updateAuthor(Author change) {
		return ad.updateAuthor(change);
	}
	
	public boolean deleteAuthor(int id) {
		return ad.deleteAuthor(id);
	}
}
