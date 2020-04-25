package org.studyeasy.spring.model;

public class User {

	private int user_id;
	private String name;
	private String email;

	public User() {
	}

	public User(int user_id, String name, String email) {
		this.user_id = user_id;
		this.name = name;
		this.email = email;
	}
 
	 
	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", name=" + name + ", email=" + email + "]";
	}
	

}
