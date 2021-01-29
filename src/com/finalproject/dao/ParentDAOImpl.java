package com.finalproject.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.finalproject.domain.Parent;

@Repository
public class ParentDAOImpl implements ParentDAO{
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Parent> findAll() {
		String sql = "select * from parents";
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<Parent>(Parent.class));
	}

	@Override
	public Parent findById(int id) {
		String sql = "select * from parents where id = ?";
		Object params[] = { id };		
		
		return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Parent>(Parent.class), params);	
	}

	@Override
	public int save(Parent parent) {
		String sql = "insert into parents(name,email) values (?,?)";
		Object params[] = {parent.getName(),parent.getEmail()};
		int n = jdbcTemplate.update(sql,params);
		return n;
	}

	@Override
	public int delete(int id) {
		String sql = "delete from parents where id=?";
		Object params[] = {id};
		int n = jdbcTemplate.update(sql, params);
		return n;	
	}

	@Override
	public boolean check(Parent parent) {
		Object params[] = { parent.getEmail(), parent.getPassword() };
		int n = jdbcTemplate.queryForObject("select count(*) from parents where email = ? and password=?  ",
				Integer.class, params);
		if (n == 0)
			return false;
		else
			return true;
	}
	
	
}
