package com.finalproject.service;

import java.util.List;

import com.finalproject.domain.Book;



public interface BookService {
	
	public int add(Book book);
	public List<Book> getAll();
}
