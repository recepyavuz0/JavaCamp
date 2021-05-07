package entities;

import abstracts.Entity;

public class Member implements Entity {
	private int id;
	private String userName;
	private String nationalityId;
	private String firstName;
	private String lastName;
	private int birthYear;
	private String email;
	private String password;
	
	public Member(int id, String userName, String nationalityId, String firstName, String lastName, int birthYear,
			String email, String password) {
		this.id = id;
		this.userName = userName;
		this.nationalityId = nationalityId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthYear = birthYear;
		this.email = email;
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public String getNationalityId() {
		return nationalityId;
	}

	public int getBirthYear() {
		return birthYear;
	}
	
	
}
