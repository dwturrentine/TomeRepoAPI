package main.java.DAO;

import java.util.List;

import main.java.Models.User;

public interface UserDAO {
	
	public User getUser(int id);
	public User getUserU(String username);
	public User getUserP(String password);
	public List<User> getAllUser();
	public boolean addUser(User u);
	public boolean updateUser(User change);
	public boolean deleteUser(int id);
}
