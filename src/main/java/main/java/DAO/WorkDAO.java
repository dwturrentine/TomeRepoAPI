package main.java.DAO;

import java.util.List;

import main.java.Models.Work;

public interface WorkDAO {

	public Work getWork(int id);
	public Work getWorkTitle(String title);
	public Work getWorkFirstName(String firstName);
	public Work getWorkLastName(String lastName);
	public Work getWorkPubYear(int pubYear);
	public Work getWorkGenre(String genre);
	public Work getWorkFileType(String fileType);
	public boolean getWorkRating(Boolean rating);
	public List<Work> getAllWork();
	public boolean addWork(Work w);
	public boolean updateWork(Work change);
	public boolean deleteWork(int id);
}
