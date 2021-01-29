package com.finalproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finalproject.dao.AdminDAO;
import com.finalproject.domain.Admin;
import com.finalproject.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	private AdminDAO adminDAO;

	@Override
	public boolean check(Admin admin) {
		
		return adminDAO.check(admin);
	}
	
	public void setAdmin(AdminDAO adminDAO)
	{
		this.adminDAO = adminDAO;
	}

}