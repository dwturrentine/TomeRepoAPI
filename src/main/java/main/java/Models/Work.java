package main.java.Models;

public class Work {

	String title;
	String firstName;
	String lastName;
	int pubYear;
	String genre;
	String fileType;
	boolean rating;
	int id;
	
	public Work(String title, String firstName, String lastName, int pubYear, 
			String genre, String fileType, boolean rating, int id) {
		
		super();
		
		this.title = title;
		this.firstName = firstName;
		this.lastName = lastName;
		this.pubYear = pubYear;
		this.genre = genre;
		this.fileType = fileType;
		this.rating = rating;
		this.id = id;
	}

	public Work(int int1, String string, String string2, String string3, 
			boolean boolean1, String string4, String string5, boolean boolean2, 
			boolean boolean3, boolean boolean4, boolean boolean5) {
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getPubYear() {
		return pubYear;
	}

	public void setPubYear(int pubYear) {
		this.pubYear = pubYear;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public boolean isRating() {
		return rating;
	}

	public void setRating(boolean rating) {
		this.rating = rating;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Work [title=" + title + ", firstName=" + firstName + ", lastName=" + 
				lastName + ", pubYear=" + pubYear + ", genre=" + genre + ", fileType=" + 
				fileType + ", rating=" + rating + ", id=" + id + "]";
	}
}
	