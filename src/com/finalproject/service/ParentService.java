package com.finalproject.service;

import java.util.List;

import com.finalproject.domain.Parent;


public interface ParentService {
	public List<Parent> getAll();
	public Parent getByIdl(int id);
	public int add(Parent parent);
	public int remove(int id);
	public boolean check(Parent parent);

}
