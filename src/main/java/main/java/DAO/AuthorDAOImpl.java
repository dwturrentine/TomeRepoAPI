package main.java.DAO;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import main.java.JDBCConnection.JDBCConnection;
import main.java.Models.Author;

public class AuthorDAOImpl implements AuthorDAO {
	
	public static Connection conn = JDBCConnection.getConnection();

	public Author getAuthor(int id) {
		
		try {
			
			String sql = "SELECT * FROM authors WHERE id = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, Integer.toString(id));
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				
				return new Author(rs.getInt("ID"), 
						rs.getString("FIRSTNAME"), 
						rs.getString("LASTNAME"),
						rs.getInt("BIRTHYEAR"),
						rs.getInt("DEATHYEAR"),
						rs.getBoolean("A"),
						rs.getBoolean("CHANGE"),
						rs.getBoolean("ID"));
							}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}		return null;
	}

	public Author getAuthorFN(String firstName) {
		
		try {
			
			String sql = "SELECT * FROM authors WHERE firstName = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, firstName);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				
				return new Author(rs.getInt("ID"), 
						rs.getString("FIRSTNAME"), 
						rs.getString("LASTNAME"),
						rs.getInt("BIRTHYEAR"),
						rs.getInt("DEATHYEAR"),
						rs.getBoolean("A"),
						rs.getBoolean("CHANGE"),
						rs.getBoolean("ID"));
							}
	
		} catch (SQLException e) {
			e.printStackTrace();
		}		return null;
	}

	public Author getAuthorLN(String lastName) {
		
		try {
			
			String sql = "SELECT * FROM authors WHERE lastName = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, lastName);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				
				return new Author(rs.getInt("ID"), 
						rs.getString("FIRSTNAME"), 
						rs.getString("LASTNAME"),
						rs.getInt("BIRTHYEAR"),
						rs.getInt("DEATHYEAR"),
						rs.getBoolean("A"),
						rs.getBoolean("CHANGE"),
						rs.getBoolean("ID"));
							}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}		return null;
	}

	public Author getAuthorBY(int birthYear) {
		
		try {
			
			String sql = "SELECT * FROM authors WHERE birthYear = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, Integer.toString(birthYear));
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				
				return new Author(rs.getInt("ID"), 
						rs.getString("FIRSTNAME"), 
						rs.getString("LASTNAME"),
						rs.getInt("BIRTHYEAR"),
						rs.getInt("DEATHYEAR"),
						rs.getBoolean("A"),
						rs.getBoolean("CHANGE"),
						rs.getBoolean("ID"));
							}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}		return null;
	}

	public Author getAuthorDY(int deathYear) {
		
		try {
			
			String sql = "SELECT * FROM authors WHERE deathYear = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, Integer.toString(deathYear));
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				return new Author(rs.getInt("ID"), 
						rs.getString("FIRSTNAME"), 
						rs.getString("LASTNAME"),
						rs.getInt("BIRTHYEAR"),
						rs.getInt("DEATHYEAR"),
						rs.getBoolean("A"),
						rs.getBoolean("CHANGE"),
						rs.getBoolean("ID"));
							}
				
		} catch (SQLException e) {
			e.printStackTrace();
		}		return null;
	}

	public List<Author> getAllAuthor() {
		
		try {
			
			String sql = "SELECT * FROM authors";
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery();
			List<Author> userList = new ArrayList<Author>();
			
			while(rs.next()) {
				userList.add(new Author(rs.getInt("ID"), 
						rs.getString("FIRSTNAME"), 
						rs.getString("LASTNAME"),
						rs.getInt("BIRTHYEAR"),
						rs.getInt("DEATHYEAR"),
						rs.getBoolean("A"),
						rs.getBoolean("CHANGE"),
						rs.getBoolean("ID")));
								}
			
			return userList;

		} catch (SQLException e) {
			e.printStackTrace();
		}		return null;
	}

	public boolean addAuthor(Author a) {
		
		try {
			
			String sql = "CALL addAuthor(?,?,?,?)";
			CallableStatement cs = conn.prepareCall(sql);
			
			cs.setString(1, a.getFirstName());
			cs.setString(2, a.getLastName());
			cs.setInt(3, a.getBirthYear());
			cs.setInt(4, a.getDeathYear());
			
			cs.execute();
			return true;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}		return false;
	}

	public boolean updateAuthor(Author change) {
		
		try {
			
		String sql = "CALL updateAuthor(?,?,?,?)";
		CallableStatement cs = conn.prepareCall(sql);
		
		cs.setString(1, change.getFirstName());
		cs.setString(2, change.getLastName());
		cs.setInt(3, change.getBirthYear());
		cs.setInt(4, change.getDeathYear());

		cs.execute();
		return true;

		} catch (SQLException e) {
		e.printStackTrace();
		}	return false;
	}

	public boolean deleteAuthor(int id) {
		try {
			
			String sql = "DELETE author WHERE id = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, Integer.toString(id));
			
			ps.executeQuery();
			return true;

		} catch (SQLException e) {
			e.printStackTrace();
		}		return false;
	}
}
