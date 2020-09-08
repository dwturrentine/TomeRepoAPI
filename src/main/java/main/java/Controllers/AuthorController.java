package main.java.Controllers;

import main.java.Services.AuthorService;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import main.java.Models.Author;

public class AuthorController {
	
	public static AuthorService as = new AuthorService();
	public static Gson gson = new Gson();
	
	public static void getAuthor(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		//1) Handling the request:
	
		int id = Integer.parseInt(request.getParameter("id"));
		System.out.println("ID: " + id);
		
		//2) Using the services:
		
		Author a = as.getAuthor(id);
		
		//3) Generating a response:

		response.getWriter().append(gson.toJson(a));
	}
	
	public static void addAuthor(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		Author a = gson.fromJson(request.getReader(), Author.class);
		
		//Adding the Author:
		
		as.addAuthor(a);
		
		//Generating a response:
		
		response.getWriter().append(gson.toJson(a));
		
	}
	
	public static void updateAuthor(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		//Processing the request:
		
		Author change = gson.fromJson(request.getReader(), Author.class);
		
		//Calling a service:
		
		as.updateAuthor(change);
		
		//Generating a response:
		
		response.getWriter().append(gson.toJson(change));
	}
	
	public static void deleteAuthor(HttpServletRequest request, HttpServletResponse response) 
	throws IOException {

		Map<String, String[]> paramMap = request.getParameterMap();
		if(paramMap.containsKey("id")) {
			int id = Integer.parseInt(request.getParameter("id"));
			boolean worked = as.deleteAuthor(id);
			response.getWriter().append(Boolean.toString(worked));
		} else {
			response.getWriter().append(Boolean.toString(false));
		}
}

	public static void getAllAuthor(HttpServletRequest request, HttpServletResponse response) 
			throws IOException {
	
		List<Author> authors = as.getAllAuthor();
		
		response.getWriter().append(gson.toJson(authors));
	}
}
