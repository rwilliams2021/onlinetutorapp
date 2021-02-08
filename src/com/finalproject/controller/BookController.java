package com.finalproject.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.finalproject.domain.Book;

import com.finalproject.service.BookService;


@Controller
public class BookController {
	
	private List<Book> book = new ArrayList<Book>();

	@Autowired
	private BookService bookService;
	
	@RequestMapping(value = "/book",method = RequestMethod.GET)
	public String getBooks(Model model) {
		List<Book> book =  bookService.getAll();
		model.addAttribute("book", book);
		return "showbooks";
		
	}

	public void setBookService(BookService bookService) {
		this.bookService = bookService;
	}

	

	@RequestMapping(value = "/addbooks", method = RequestMethod.GET)
	public String add() {
	return "addbooksnew"; 
	}

	@RequestMapping(value = "/addbooks",method = RequestMethod.POST)
	public String doAdd(String name, String subject, String price, Model model) {
		Book b = new Book();
		b.setName(name);
		b.setSubject(subject);
		b.setPrice(Integer.parseInt(price));
		int n = bookService.add(b);
		if(n>0)
			model.addAttribute("msg", "Name: " + name +  "  ,  "  + "Subject: "  + subject +  "  ,  "  + "Price: " + price);
			return "addbooksresult";
		
	}
	@RequestMapping(value = "/ebooksparents",method = RequestMethod.GET)
	public String getBooks1(Model model) {
		List<Book> book =  bookService.getAll();
		model.addAttribute("book", book);
		return "ebooksparents";
		
	}
}