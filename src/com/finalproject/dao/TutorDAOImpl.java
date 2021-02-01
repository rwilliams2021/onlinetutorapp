package com.finalproject.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


import com.finalproject.domain.Tutor;



@Repository
public class TutorDAOImpl implements TutorDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	

	@Override
	public int add(Tutor tutor) {
		String sql = "insert into tutors(id,name,email,cell_number) values (?,?,?,?)";
		Object params[] = {tutor.getId(),tutor.getName(),tutor.getEmail(),tutor.getCell_number()};
		int n = jdbcTemplate.update(sql,params);
		return n;
	}


	@Override
	public List<Tutor> findAll() {
		String sql = "select * from tutors";
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<Tutor>(Tutor.class));
	}


	
}
	
	
	
	

