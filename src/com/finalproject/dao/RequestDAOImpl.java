package com.finalproject.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.finalproject.domain.Booking;
import com.finalproject.domain.Request;

@Repository
public class RequestDAOImpl implements RequestDAO{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int add(Request request) {
		String sql = "insert into requests(parentid,tutorid) values (?,?)";
		Object params[] = {request.getParentid(),request.getTutorid()};
		int n = jdbcTemplate.update(sql,params);
		return n;
	}

	@Override
	public List<Request> findAll() {
		String sql = "select * from requests";
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<Request>(Request.class));
	}

	@Override
	public int update(Request request) {
		String sql = "update requests set subject=?, duration_in_hours=?, times_per_week=?, email=?, cell_number=? where id=?";
		Object params[] = {};
		int n = jdbcTemplate.update(sql,params);
		return n;
	}

	@Override
	public List<Request> findById(int id) {
		String sql = "select tutorid from requests where parentid = ?";
		Object params[] = { id };
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<Request>(Request.class), params);
	}

	@Override
	public List<Request> findByTutorid(int id) {
		String sql = "select parentid from requests where tutorid = ?";
		Object params[] = { id };
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<Request>(Request.class), params);
	}

}
