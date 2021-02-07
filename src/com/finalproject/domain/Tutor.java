package com.finalproject.domain;


public class Tutor {
	private int id; 
	private String name; 
	private String email; 
	private String password;
	private String cell_number;
	private String location;
	private int rating;
	
	

	@Override
	public String toString() {
		return "Tutor [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", cell_number="
				+ cell_number + ", location=" + location + ", rating=" + rating + "]";
	}


	public int getRating() {
		return rating;
	}


	public void setRating(int rating) {
		this.rating = rating;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public String getCell_number() {
		return cell_number;
	}


	public void setCell_number(String cell_number) {
		this.cell_number = cell_number;
	}


	public Tutor() {
		// TODO Auto-generated constructor stub
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


	
	

}