package com.practice.streams;

import java.util.Date;

public class Employee {
	
	private int id;
	private String name;
	private Date birthDate;
	private String category;
	
	public Employee(int id, String name, Date birthDate, String category) {
		super();
		this.id = id;
		this.name = name;
		this.birthDate = birthDate;
		this.category=category;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	

}
