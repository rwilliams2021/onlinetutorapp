package com.finalproject.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.finalproject.dao.AdminDAO;
import com.finalproject.domain.Admin;
import com.finalproject.domain.Parent;

@Repository
public class AdminDAOImpl implements AdminDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Admin> findAll() {
		String sql = "select * from admins";
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<Admin>(Admin.class));
	}

	@Override
	public Admin findById(int id) {
		String sql = "select * from admins where id = ?";
		Object params[] = { id };		
		
		return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Admin>(Admin.class), params);	
	}

	@Override
	public int save(Admin admin) {
		String sql = "insert into admins(username,password) values (?,?)";
		Object params[] = {admin.getUsername(),admin.getPassword()};
		int n = jdbcTemplate.update(sql,params);
		return n;
	}

	@Override
	public int delete(int id) {
		String sql = "delete from admins where id=?";
		Object params[] = {id};
		int n = jdbcTemplate.update(sql, params);
		return n;	
	}

	
	@Override
	public boolean checkLogin(Admin admin) {
		Object params[] = { admin.getUsername(), admin.getPassword() };
		int n = jdbcTemplate.queryForObject("select count(*) from admins where username=? and password=?" 
				, Integer.class, params);
		if (n == 0)
			return false;
		else
		return true;
	}
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	@Override
	public int findByUsername(String username) {
		Object params[] = { username };
		return jdbcTemplate.queryForObject("select id from admins where username = ?",
				Integer.class, params);
	}
}
