package com.finalproject.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



import com.finalproject.domain.Booking;
import com.finalproject.domain.Parent;
import com.finalproject.domain.Tutor;
import com.finalproject.service.BookingService;
import com.finalproject.service.ParentService;
import com.finalproject.service.TutorService;

@Controller
public class BookingController {
	
	@Autowired
	private BookingService bookingService;
	@Autowired
	private TutorService tutorService;
	
	public void setBookingService(BookingService bookingService) {
		this.bookingService = bookingService;
	}
	
	
	@RequestMapping(value = "/addbooking", method = RequestMethod.GET)
	public String add() {	
	return "showtutors";
}
	
	
	@RequestMapping(value = "/addbooking", method = RequestMethod.POST)
	public String add(int tutorid, HttpSession session, Model model) {
	
		Booking b = new Booking();
		b.setParentid((Integer)session.getAttribute("id"));
		b.setTutorid(tutorid);
		bookingService.add(b);
		return "bookedtutorslist";
	}
	

		@RequestMapping(value = "/tutorsbooked", method = RequestMethod.POST)
		public String bookingslist(int tutorid, HttpSession session, Model model) {
		List<Booking> bookings = bookingService.findById((Integer)session.getAttribute("id"));
			return "bookedtutorslist";
				
		
		
		/*
		 * if( n > 0)
		 * 
		 * model.addAttribute("msg", "Subject: " + subject + " ," +
		 * "Duration In Hours: " + duration_in_hours + " ," + "Sessions Per Week: " +
		 * times_per_week + " ," + "Name: " + name + " ," + "Email Address: " + email +
		 * " ," + "Cell Number" + cell_number);
		
	
	}
	
	
	@RequestMapping(value = "/bookings",method = RequestMethod.GET)
	public String getBooking(Model model) {
		
		List<Booking> booking =  bookingService.getAll();
		model.addAttribute("booking", booking);
		return "showbookings";
		
	}
	
	@RequestMapping(value = "/updatebooking",method = RequestMethod.POST)
	public String update(int id, Model model) {
		Booking b = new Booking();
		b.setId(Integer.valueOf(id));
	
		int n = bookingService.add(b);
		
		/*
		 * if( n > 0)
		 * 
		 * model.addAttribute("msg", "Tutor Id: " + idz + " ," + "Subject: " + subject +
		 * " ," + "Duration In Hours: " + duration_in_hours + " ," +
		 * "Sessions Per Week: " + times_per_week + " ," + "Name: " + name + " ," +
		 * "Email Address: " + email + " ," + "Cell Number" + cell_number);
		 */
		//return "updatebookingresults";
	
	}
	
	@RequestMapping(value = "/updatebooking", method = RequestMethod.GET)
	public String updateBooking(Model model) {
	return "updatebooking";
	}
	
	
	

}
