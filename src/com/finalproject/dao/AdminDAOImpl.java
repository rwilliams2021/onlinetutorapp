package com.finalproject.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.finalproject.dao.AdminDAO;
import com.finalproject.domain.Admin;

@Repository
public class AdminDAOImpl implements AdminDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public boolean check(Admin admin) {
		Object params[] = { admin.getUsername(), admin.getPassword() };
		int n = jdbcTemplate.queryForObject("select count(*) from admin where username=? and password=?" 
				, Integer.class, params);
		if (n == 0)
			return false;
		else
		return true;
	}
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}


}
