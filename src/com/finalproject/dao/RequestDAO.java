package com.finalproject.dao;

import java.util.List;

import com.finalproject.domain.Request;

public interface RequestDAO {
	public int add(Request request);
	
	public List<Request> findAll();
	
	public int update(Request request);
}
