package com.finalproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finalproject.dao.ParentDAO;
import com.finalproject.domain.Parent;

@Service
public class ParentServiceImpl implements ParentService{
	
	@Autowired
	private ParentDAO parentDAO;

	@Override
	public List<Parent> getAll() {
		return parentDAO.findAll();
	}
	
	public void setParentDAO(ParentDAO parentDAO) {
		this.parentDAO = parentDAO;
	}

	@Override
	public Parent getByIdl(int id) {
		return parentDAO.findById(id);
	}

	@Override
	public int add(Parent parent) {
		int n = parentDAO.save(parent);
		return n;
	}

	@Override
	public int remove(int id) {
		int n = parentDAO.delete(id);
		return n;
	}

	@Override
	public boolean check(Parent parent) {
		return parentDAO.checkLogin(parent);
	}

}
