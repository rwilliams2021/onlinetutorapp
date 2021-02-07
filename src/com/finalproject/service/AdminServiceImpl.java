package com.finalproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finalproject.dao.AdminDAO;
import com.finalproject.dao.ParentDAO;
import com.finalproject.domain.Admin;
import com.finalproject.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	private AdminDAO adminDAO;
	
	public void setAdminDAO(AdminDAO adminDAO) {
		this.adminDAO = adminDAO;
	}

	@Override
	public List<Admin> getAll() {
		return adminDAO.findAll();
	}

	@Override
	public Admin getByIdl(int id) {
		return adminDAO.findById(id);
	}

	@Override
	public int getByUsername(String username) {
		return adminDAO.findByUsername(username);
	}

	@Override
	public int add(Admin admin) {
		int n = adminDAO.save(admin);
		return n;
	}

	@Override
	public int remove(int id) {
		int n = adminDAO.delete(id);
		return n;
	}

	@Override
	public boolean check(Admin admin) {
		return adminDAO.checkLogin(admin);
	}

}