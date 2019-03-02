package com.prestashop.beans;

// beans --> used to represent a certain type of object
// pojo --> plain old java object, used to represent a certain type of object
// model --> used to represent a certain type of object

public class User {
	
	private String firstName;
	private String lastName;
	private String address;
	private String company;
	private String city;
	private String email;
	
	public User(String firstName, String lastName, String address, String company, String city, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.company = company;
		this.city = city;
		this.email = email;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getAddress() {
		return address;
	}

	public String getCompany() {
		return company;
	}

	public String getCity() {
		return city;
	}
	
	public String getEmail() {
		return email;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}


	
	
	
	
	
	
	
}
