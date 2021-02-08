package com.finalproject.service;

import java.util.List;

import com.finalproject.domain.Booking;

public interface BookingService {
	
	public int add(Booking booking);
	public List<Booking> getAll();
	public int update(Booking booking);
	public List<Booking> findById(int id);
	public List<Booking> findByTutorId(int id);
}
