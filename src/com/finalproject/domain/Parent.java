package com.finalproject.domain;

public class Parent {
	private int id;
	private String name;
	private String email;
	private String password;
	private int cellno;
		
	public Parent() {

	}

	public Parent(int id, String name, String email, String password, int cellno) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.cellno = cellno;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getCellno() {
		return cellno;
	}

	public void setCellno(int cellno) {
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

	
}
