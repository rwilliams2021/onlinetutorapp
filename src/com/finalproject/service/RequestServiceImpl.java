package com.finalproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finalproject.dao.RequestDAO;
import com.finalproject.domain.Request;

@Service
public class RequestServiceImpl implements RequestService{

	@Autowired
	private RequestDAO requestDAO;
	
	@Override
	public int add(Request request) {
		int n = requestDAO.add(request);
		return n;
	}

	@Override
	public List<Request> getAll() {
		return requestDAO.findAll();
	}

	@Override
	public int update(Request request) {
		int n = requestDAO.update(request);
		return n;
	}

}
