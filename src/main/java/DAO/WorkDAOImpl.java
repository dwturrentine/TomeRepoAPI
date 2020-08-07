package main.java.DAO;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import main.java.JDBCConnection.JDBCConnection;
import main.java.Models.Work;


public class WorkDAOImpl implements WorkDAO {
	
	public static Connection conn = JDBCConnection.getConnection();

	public Work getWork(int id) {
		
		try {
			String sql = "SELECT * FROM work WHERE id = ?";
			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setString(1, Integer.toString(id));
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				return new Work(rs.getInt("ID"), 
						rs.getString("TITLE"), 
						rs.getString("FIRSTNAME"),
						rs.getString("LASTNAME"),
						rs.getBoolean("PUBYEAR"),
						rs.getString("GENRE"),
						rs.getString("FILETYPE"),
						rs.getBoolean("RATING"),
						rs.getBoolean("W"),
						rs.getBoolean("CHANGE"),
						rs.getBoolean("ID"));
							}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}		return null;
	}

	public Work getWorkTitle(String title) {
		
		try {
			String sql = "SELECT * FROM work WHERE title = ?";
			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setString(1, title);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				return new Work(rs.getInt("ID"), 
						rs.getString("TITLE"), 
						rs.getString("FIRSTNAME"),
						rs.getString("LASTNAME"),
						rs.getBoolean("PUBYEAR"),
						rs.getString("GENRE"),
						rs.getString("FILETYPE"),
						rs.getBoolean("RATING"),
						rs.getBoolean("W"),
						rs.getBoolean("CHANGE"),
						rs.getBoolean("ID"));
							}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}		return null;
	}

	public Work getWorkFirstName(String firstName) {
		
		try {
			String sql = "SELECT * FROM work WHERE firstName = ?";
			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setString(1, firstName);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				return new Work(rs.getInt("ID"), 
						rs.getString("TITLE"), 
						rs.getString("FIRSTNAME"),
						rs.getString("LASTNAME"),
						rs.getBoolean("PUBYEAR"),
						rs.getString("GENRE"),
						rs.getString("FILETYPE"),
						rs.getBoolean("RATING"),
						rs.getBoolean("W"),
						rs.getBoolean("CHANGE"),
						rs.getBoolean("ID"));
							}	
			
		} catch (SQLException e) {
			e.printStackTrace();
		}		return null;
	}

	public Work getWorkLastName(String lastName) {
		
		try {
			String sql = "SELECT * FROM work WHERE lastName = ?";
			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setString(1, lastName);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				return new Work(rs.getInt("ID"), 
						rs.getString("TITLE"), 
						rs.getString("FIRSTNAME"),
						rs.getString("LASTNAME"),
						rs.getBoolean("PUBYEAR"),
						rs.getString("GENRE"),
						rs.getString("FILETYPE"),
						rs.getBoolean("RATING"),
						rs.getBoolean("W"),
						rs.getBoolean("CHANGE"),
						rs.getBoolean("ID"));
							}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}		return null;
	}

	public Work getWorkPubYear(int pubYear) {
		
		try {
			String sql = "SELECT * FROM work WHERE pubYear = ?";
			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setString(1, Integer.toString(pubYear));
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				return new Work(rs.getInt("ID"), 
						rs.getString("TITLE"), 
						rs.getString("FIRSTNAME"),
						rs.getString("LASTNAME"),
						rs.getBoolean("PUBYEAR"),
						rs.getString("GENRE"),
						rs.getString("FILETYPE"),
						rs.getBoolean("RATING"),
						rs.getBoolean("W"),
						rs.getBoolean("CHANGE"),
						rs.getBoolean("ID"));
							}	
			
		} catch (SQLException e) {
			e.printStackTrace();
		}		return null;
	}

	public Work getWorkGenre(String genre) {
		
		try {
			String sql = "SELECT * FROM work WHERE genre = ?";
			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setString(1, genre);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				return new Work(rs.getInt("ID"), 
						rs.getString("TITLE"), 
						rs.getString("FIRSTNAME"),
						rs.getString("LASTNAME"),
						rs.getBoolean("PUBYEAR"),
						rs.getString("GENRE"),
						rs.getString("FILETYPE"),
						rs.getBoolean("RATING"),
						rs.getBoolean("W"),
						rs.getBoolean("CHANGE"),
						rs.getBoolean("ID"));
							}
								
		} catch (SQLException e) {
			e.printStackTrace();
		}		return null;
	}

	public Work getWorkFileType(String fileType) {
		
		try {
			String sql = "SELECT * FROM work WHERE fileType = ?";
			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setString(1, fileType);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				return new Work(rs.getInt("ID"), 
						rs.getString("TITLE"), 
						rs.getString("FIRSTNAME"),
						rs.getString("LASTNAME"),
						rs.getBoolean("PUBYEAR"),
						rs.getString("GENRE"),
						rs.getString("FILETYPE"),
						rs.getBoolean("RATING"),
						rs.getBoolean("W"),
						rs.getBoolean("CHANGE"),
						rs.getBoolean("ID"));
							}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}		return null;
	}

	public boolean getWorkRating(Boolean rating) {
		
		try {
			String sql = "SELECT * FROM work WHERE rating = ?";
			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setBoolean(1, (rating));
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				return new Work(rs.getInt("ID"), 
						rs.getString("TITLE"), 
						rs.getString("FIRSTNAME"),
						rs.getString("LASTNAME"),
						rs.getBoolean("PUBYEAR"),
						rs.getString("GENRE"),
						rs.getString("FILETYPE"),
						rs.getBoolean("RATING"),
						rs.getBoolean("W"),
						rs.getBoolean("CHANGE"),
						rs.getBoolean("ID")) != null;
							}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}		return false;
	}

	public List<Work> getAllWork() {
		
		try {
			
			String sql = "SELECT * FROM work";
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery();
			List<Work> userList = new ArrayList<Work>();
			
			while(rs.next()) {
				userList.add(new Work(rs.getInt("ID"), 
						rs.getString("TITLE"), 
						rs.getString("FIRSTNAME"),
						rs.getString("LASTNAME"),
						rs.getBoolean("PUBYEAR"),
						rs.getString("GENRE"),
						rs.getString("FILETYPE"),
						rs.getBoolean("RATING"),
						rs.getBoolean("W"),
						rs.getBoolean("CHANGE"),
						rs.getBoolean("ID")));
							}
			
			return userList;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}		return null;
	}

	public boolean addWork(Work w) {
		
		try {
			
			String sql = "CALL addWork(?,?,?,?)";
			CallableStatement cs = conn.prepareCall(sql);
			
			cs.setString(1, w.getTitle());
			cs.setString(2, w.getFirstName());
			cs.setString(3, w.getLastName());
			cs.setInt(4, w.getPubYear());
			cs.setString(5, w.getGenre());
			cs.setString(6, w.getFileType());
			cs.setBoolean(7, w.isRating());

			cs.execute();
			return true;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}		return false;
	}

	public boolean updateWork(Work change) {
		
		try {
			
			String sql = "CALL updateWork(?,?,?,?)";
			CallableStatement cs = conn.prepareCall(sql);
			
			cs.setString(1, change.getTitle());
			cs.setString(2, change.getFirstName());
			cs.setString(3, change.getLastName());
			cs.setInt(4, change.getPubYear());
			cs.setString(5, change.getGenre());
			cs.setString(6, change.getFileType());
			cs.setBoolean(7, change.isRating());
			
			cs.execute();
			return true;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}		return false;
	}

	public boolean deleteWork(int id) {
		
		try {
			
			String sql = "DELETE work WHERE id = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, Integer.toString(id));
			
			ps.executeQuery();
			return true;

		} catch (SQLException e) {
			e.printStackTrace();
		}		return false;
	}
}
