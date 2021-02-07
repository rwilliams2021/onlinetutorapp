package com.finalproject.service;

import java.util.List;

import com.finalproject.domain.Request;

public interface RequestService {
	public int add(Request request);
	public List<Request> getAll();
	public int update(Request request);
	public List<Request> findById(int id);
	public List<Request> findByTutorId(int id);

}
