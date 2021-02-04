package com.finalproject.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.finalproject.domain.Book;



@Repository
public class BookDAOImpl implements BookDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int add(Book book) {
		String sql = "insert into books(name,subject,price) values (?,?,?)";
		Object params[] = {book.getName(),book.getSubject(),book.getPrice()};
		int n = jdbcTemplate.update(sql,params);
		return n;
	}

	@Override
	public List<Book> findAll() {
		String sql = "select * from books";
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<Book>(Book.class));
	}




}
