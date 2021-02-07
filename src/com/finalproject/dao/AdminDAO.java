package com.finalproject.dao;

import java.util.List;

import com.finalproject.domain.Admin;
import com.finalproject.domain.Parent;

public interface AdminDAO {
	
	public List<Admin> findAll();
	public Admin findById(int id);
	public int findByUsername(String username);
	public int save(Admin admin);
	public int delete(int id);
	public boolean checkLogin(Admin admin);
}
