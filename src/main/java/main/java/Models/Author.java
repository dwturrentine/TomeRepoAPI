package main.java.Models;

public class Author {
	
	String firstName;
	String lastName;
	int birthYear;
	int deathYear;
	int id;
	
	public Author() {
		super();
		
	}
	
	public Author(String firstName, String lastName,
			
			int birthYear, int deathYear, int id) {
		
		super();
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthYear = birthYear;
		this.deathYear = deathYear;
		this.id = id;
	}

	public Author(int int1, String string, String string2, int int2, int int3, boolean boolean1, boolean boolean2,
			boolean b) {
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

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	public int getDeathYear() {
		return deathYear;
	}

	public void setDeathYear(int deathYear) {
		this.deathYear = deathYear;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Author [firstName=" + firstName + ", lastName=" + lastName + ", birthYear=" + birthYear + ", deathYear="
				+ deathYear + ", id=" + id + "]";
	}
}
