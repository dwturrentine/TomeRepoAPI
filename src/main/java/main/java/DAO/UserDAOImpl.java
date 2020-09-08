package main.java.DAO;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import main.java.JDBCConnection.JDBCConnection;
import main.java.Models.User;

public class UserDAOImpl implements UserDAO {
	
	public static Connection conn = JDBCConnection.getConnection();

	public User getUser(int id) {
		
		try {
			String sql = "SELECT * FROM users WHERE id = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, Integer.toString(id));
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				return new User(rs.getInt("ID"), 
						rs.getString("USERNAME"), 
						rs.getString("PASSWORD"), 
						rs.getBoolean("U"),
						rs.getBoolean("CHANGE"),
						rs.getBoolean("ID"));
							}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
			return null;
	}

	public User getUserU(String username) {
		
		try {
			
			String sql = "SELECT * FROM users WHERE username = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, username);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				return new User(rs.getInt("ID"), 
						rs.getString("USERNAME"), 
						rs.getString("PASSWORD"), 
						rs.getBoolean("U"),
						rs.getBoolean("CHANGE"),
						rs.getBoolean("ID"));
							}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}		return null;
	}

	public User getUserP(String password) {
		
		try {
			
			String sql = "SELECT * FROM users WHERE password = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, password);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				return new User(rs.getInt("ID"), 
						rs.getString("USERNAME"), 
						rs.getString("PASSWORD"), 
						rs.getBoolean("U"),
						rs.getBoolean("CHANGE"),
						rs.getBoolean("ID"));
							} 
			
		} catch (SQLException e) {
			e.printStackTrace();
		}		return null;
	}

	public List<User> getAllUser() {
		
		try {
			
			String sql = "SELECT * FROM users";
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery();
			List<User> userList = new ArrayList<User>();
			
			while(rs.next()) {
				userList.add(new User(rs.getInt("ID"), 
						rs.getString("USERNAME"), 
						rs.getString("PASSWORD"), 
						rs.getBoolean("U"),
						rs.getBoolean("CHANGE"),
						rs.getBoolean("ID")));
								}
			
			return userList;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}		return null;
	}

	public boolean addUser(User u) {
		
		try {
			
			String sql = "CALL addUser(?,?,?,?)";
			CallableStatement cs = conn.prepareCall(sql);
			
			cs.setString(1, u.getUsername());
			cs.setString(2, u.getPassword());
			
			cs.execute();
			return true;
			

		} catch (SQLException e) {
			e.printStackTrace();
		}		return false;
	}

	public boolean updateUser(User change) {
		
		try {
			
			String sql = "UPDATE users SET username = ?, password = ?, WHERE id = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, change.getUsername());
			ps.setString(2, change.getPassword());
			ps.setString(3, Integer.toString(change.getId()));
			
			ps.executeQuery();
			return true;

		} catch (SQLException e) {
			e.printStackTrace();
		}		return false;
	}

	public boolean deleteUser(int id) {
		
		try {
			
			String sql = "DELETE users WHERE id = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, Integer.toString(id));
			
			ps.executeQuery();
			return true;

		} catch (SQLException e) {
			e.printStackTrace();
		}		return false;
	}
}
