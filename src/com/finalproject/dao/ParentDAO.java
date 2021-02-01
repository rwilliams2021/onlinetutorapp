package com.finalproject.dao;

import java.util.List;

import com.finalproject.domain.Parent;

public interface ParentDAO {
	public List<Parent> findAll();
	public Parent findById(int id);
	public int save(Parent parent);
	public int delete(int id);
	public boolean checkLogin(Parent parent);
}
