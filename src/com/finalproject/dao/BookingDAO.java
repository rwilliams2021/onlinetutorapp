package com.finalproject.dao;

import java.util.List;

import com.finalproject.domain.Booking;
import com.finalproject.domain.Tutor;

public interface BookingDAO {
	
	public int add(Booking booking);
	
	public List<Booking> findAll();
	
	public int update(Booking booking);
	public List<Booking> findById(int id);
	public List<Booking> findByTutorid(int id);
}
