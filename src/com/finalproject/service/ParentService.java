package com.finalproject.service;

import java.util.List;

import com.finalproject.domain.Parent;


public interface ParentService {
	public List<Parent> getAll();
	public List<Parent> getByIdl(int id);
	public int getByEmail(String email);
	public int add(Parent parent);
	public int remove(int id);
	public boolean check(Parent parent);

}
