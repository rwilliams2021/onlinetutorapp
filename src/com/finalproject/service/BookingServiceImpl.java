package com.finalproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finalproject.dao.BookingDAO;
import com.finalproject.domain.Booking;


@Service
public class BookingServiceImpl implements BookingService  {
	
	@Autowired
	private BookingDAO bookingDAO;

	@Override
	public int add(Booking booking) {
		int n = bookingDAO.add(booking);
		return n;
	}
	

	@Override
	public List<Booking> getAll() {
		return bookingDAO.findAll();
	}
	
	public void setBooking(BookingDAO bookingDAO) {
		this.bookingDAO = bookingDAO;
	}


	@Override
	public int update(Booking booking) {
		int n = bookingDAO.update(booking);
		return n;
	}


	@Override
	public List<Booking> findById(int id) {
		return bookingDAO.findById(id);
	}

}
