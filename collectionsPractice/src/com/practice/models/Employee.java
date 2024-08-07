package com.practice.models;

import java.util.Date;

public class Employee {
	
	private long id;
	private String firstName;
	private String lastName;
	private Date joiningDate;
	
	
	public Employee() {
		
	}
	
	public Employee(long id, String firstName, String lastName, Date joiningDate) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.joiningDate = joiningDate;
	}


	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
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
	public Date getJoiningDate() {
		return joiningDate;
	}
	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", joiningDate="
				+ joiningDate + "]";
	}
	
	
	
	

}
