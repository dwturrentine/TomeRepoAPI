package main.java.Services;

import main.java.DAO.UserDAO;
import main.java.DAO.UserDAOImpl;
import main.java.Models.User;

public class LoginService {

//Basic CRUD and any other business logic.
	
	public static UserDAO ud = new UserDAOImpl();
	
	public static boolean login(User u) {
		
		User currentUser = ud.getUserU(u.getUsername());
		
		if(currentUser == null) {
			return false;
			
		} else if(currentUser.getPassword().equals(u.getPassword())) {
			return true;
			
		} else {
			return false;
		}		
	}
}
		