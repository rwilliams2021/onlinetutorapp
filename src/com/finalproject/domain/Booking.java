package com.finalproject.domain;

public class Booking {
	private int id;
	private int parentid;
	private int tutorid;	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getParentid() {
		return parentid;
	}

	public void setParentid(int parentid) {
		this.parentid = parentid;
	}

	public int getTutorid() {
		return tutorid;
	}

	public void setTutorid(int tutorid) {
		this.tutorid = tutorid;
	}

	@Override
	public String toString() {
		return "Booking [id=" + id + ", parentid=" + parentid + ", tutorid=" + tutorid + "]";
	}
	
}
