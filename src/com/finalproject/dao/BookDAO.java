package com.finalproject.dao;

import java.util.List;

import com.finalproject.domain.Book;


public interface BookDAO {
	
	public int add(Book book);
	public List<Book> findAll();
}
