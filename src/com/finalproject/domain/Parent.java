package com.finalproject.domain;

import java.util.List;

public class Parent {
	private int id;
	private String name;
	private String email;
	private String password;
	private String cellno;

		
	public Parent() {

	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCellno() {
		return cellno;
	}

	public void setCellno(String cellno) {
		this.cellno = cellno;
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

	@Override
	public String toString() {
		return "Parent [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", cellno="
				+ cellno + "]";
	}

	
}
