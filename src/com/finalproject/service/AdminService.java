package com.finalproject.service;

import java.util.List;

import com.finalproject.domain.Admin;

public interface AdminService {
	public List<Admin> getAll();
	public Admin getByIdl(int id);
	public int getByUsername(String username);
	public int add(Admin admin);
	public int remove(int id);
	public boolean check(Admin admin);

}
