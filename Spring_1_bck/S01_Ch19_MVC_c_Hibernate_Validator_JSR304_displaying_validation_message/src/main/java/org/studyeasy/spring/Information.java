package org.studyeasy.spring;

import javax.validation.constraints.Size;

public class Information {
	
	@Size(min = 2, max = 20)
	private String firstName;
	
	@Size(min = 2, max = 20, message="Please enter last Name (Min 2 chars, Max 20 chars)")
	private String lastName;
	private String gender;
	private String country;
	private String message;
	private String[] visitedCountries;
	
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
 
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String[] getVisitedCountries() {
		return visitedCountries;
	}

	public void setVisitedCountries(String[] visitedCountries) {
		this.visitedCountries = visitedCountries;
	}
	
	

}
