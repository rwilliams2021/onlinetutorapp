package com.finalproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finalproject.dao.BookDAO;
import com.finalproject.domain.Book;


@Service

public class BookServiceImpl implements BookService {

	@Autowired
	private BookDAO bookDAO;
	
	public void setBookDAO(BookDAO bookDAO) {
		this.bookDAO = bookDAO;
	}
	@Override
	public int add(Book book) {
		int n = bookDAO.add(book);
		return n;
	}
	@Override
	public List<Book> getAll() {
		return bookDAO.findAll();
	}
}
