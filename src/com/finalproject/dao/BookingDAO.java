package com.finalproject.dao;

import java.util.List;

import com.finalproject.domain.Booking;

public interface BookingDAO {
	
	public int add(Booking booking);
	
	public List<Booking> findAll();
	
	public int update(Booking booking);

}
