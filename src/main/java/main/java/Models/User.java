package main.java.Models;

public class User {
	
	private String username;
	private String password;
	int id;

	public User(int i, String string, String string2, String string3, 
			boolean b, String string4, String string5, boolean c, 
			boolean d, boolean e, boolean f) {
		
		super();
	}

	public User(String username, String password, int id) {
		
		super();
		
		this.username = username;
		this.password = password;
		this.id = id;
	}

	public User(int int1, String string, String string2, 
			boolean boolean1, boolean boolean2, boolean b) {
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setValidUsername(String password) {
		
		if(username.matches("[a-z0-9]{8,8}")) {
			
			System.out.println("Dope name, Man!");
			
			setPassword(username);
			
		} else {
			
			System.out.println("No one calls you that, bro.");
		}
	}
		
	public void setValidPassword(String password) {
		
		if(password.matches("[a-zA-Z0-9]{8,8}")) {
			
			System.out.println("Open Sesame Chicken!");
			
			setPassword(password);
			
		} else {
			
			System.out.println("I can't do that, Dave...");
		}
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", id=" + id + "]";
	}
}
