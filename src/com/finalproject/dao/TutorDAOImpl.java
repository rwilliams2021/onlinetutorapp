package com.finalproject.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.finalproject.domain.Parent;
import com.finalproject.domain.Tutor;

@Repository
public class TutorDAOImpl implements TutorDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int add(Tutor tutor) {
		String sql = "insert into tutors(name,email, password,cell_number) values (?,?,?,?)";
		Object params[] = { tutor.getName(), tutor.getEmail(), tutor.getPassword(), tutor.getCell_number() };
		int n = jdbcTemplate.update(sql, params);
		return n;
	}

	@Override
	public List<Tutor> findAll() {
		String sql = "select * from tutors";
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<Tutor>(Tutor.class));
	}

	@Override
	public int update(Tutor tutor) {
		String sql = "update tutors set name=?, email=?, cell_number=? where id=?";
		Object params[] = { tutor.getName(), tutor.getEmail(), tutor.getCell_number(), tutor.getId() };
		int n = jdbcTemplate.update(sql, params);
		return n;
	}

	@Override
	public int delete(int id) {
		String sql = "delete from tutors where id=?";
		Object params[] = { id };
		int n = jdbcTemplate.update(sql, params);
		return n;
	}

	@Override
	public boolean checkLogin(Tutor tutor) {
		Object params[] = { tutor.getEmail(), tutor.getPassword() };
		int n = jdbcTemplate.queryForObject("select count(*) from tutors where email = ? and password=?  ",
				Integer.class, params);
		if (n == 0)
			return false;
		else
			return true;
	}

	@Override
	public List<Tutor> findById(int id) {
		String sql = "select * from tutors where id = ?";
		Object params[] = { id };

		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<Tutor>(Tutor.class), params);
	}

	@Override
	public int findByEmail(String email) {
		Object params[] = { email };
		return jdbcTemplate.queryForObject("select id from tutors where email = ?",
				Integer.class, params);
	}

}
