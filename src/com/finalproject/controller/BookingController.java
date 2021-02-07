package com.finalproject.controller;

import java.util.ArrayList;
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
		b.setParentid((Integer) session.getAttribute("id"));
		b.setTutorid(tutorid);
		bookingService.add(b);
		return "redirect:/tutorsbooked";
	}

	@RequestMapping(value = "/tutorsbooked", method = RequestMethod.GET)
	public String bookingslist(HttpSession session, Model model) {
		
		//Get all bookings for the logged in parent
		List<Booking> bookings = bookingService.findById((Integer)session.getAttribute("id")); 
				
		List<Tutor> tutor = new ArrayList<Tutor>();
		for(Booking b : bookings) {
			int tutorid = b.getTutorid();
			List<Tutor> tlist = tutorService.getByIdl(tutorid); //return the tutor from tutor table with the tutorid
			//Access the tutor from tlist and add it to the tutor list
			for(Tutor t : tlist) {
				tutor.add(t);
			}
		}
		model.addAttribute("tutor", tutor);
		return "bookedtutorslist";	
	}

	@RequestMapping(value = "/updatebooking", method = RequestMethod.GET)
	public String updateBooking(Model model) {
		return "updatebooking";
	}

}
