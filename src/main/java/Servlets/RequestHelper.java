package main.java.Servlets;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import main.java.Controllers.AuthorController;

public class RequestHelper {
	public static void process(HttpServletRequest request, HttpServletResponse response) 
			throws IOException {
			
			//This method will delegate to other methods on the controller layer of the
			//application to process this request.
		
			//response.getWriter().append("Handling your request");
		
		StringBuffer url = request.getRequestURL();
		String uri = request.getRequestURI();
		
			//response.getWriter().append("\nURL: " + url + "\nURI: " + uri + "\n");
		
		System.out.println("URL: " + url + "\nURI: " + uri);
		
			//The switch handles the requests.
	
		switch (uri) {

		case "/TomeRepo/test.do": {
			response.getWriter().append("Test");
			response.setStatus(200);
			break;
		}
		
		case "/TomeRepo/getAuthor.do": {
			AuthorController.getAuthor(request, response);
			break;
		}
		
		case "/TomeRepo/addAuthor.do": {
			AuthorController.addAuthor(request, response);
			break;
		}
		
		case "/TomeRepo/updateAuthor.do": {
			AuthorController.updateAuthor(request, response);
			break;
		}
		
		case "/TomeRepo/deleteAuthor.do": {
			AuthorController.deleteAuthor(request, response);
			break;
		}
		
		default: {
			response.sendError(451, "Nooooop.");
			break;
		}

		}
	}
}



