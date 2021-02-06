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
		return "bookedtutorslist";
	}

	@RequestMapping(value = "/tutorsbooked", method = RequestMethod.GET)
	public String bookingslist(HttpSession session, Model model) {
		List<Booking> bookings = bookingService.getAll();
		List<Tutor> tutor = new ArrayList<Tutor>();
		for (Booking b : bookings) {
			if (b.getParentid() == (Integer) session.getAttribute("id")) {
				Tutor t = new Tutor();
				t.setId(b.getTutorid());
				tutor.add(t);
			}

		}
		List<Tutor> tutorList = new ArrayList<Tutor>();
		for (Tutor t : tutor) {
			int id = t.getId();
			System.out.println("id" + id);
			tutorList = tutorService.getByIdl(id);
//			for(Tutor t : tutorList) {
//				
//			}
		}
		model.addAttribute("tutor", tutor);
		return "bookedtutorslist";	}

	@RequestMapping(value = "/updatebooking", method = RequestMethod.GET)
	public String updateBooking(Model model) {
		return "updatebooking";
	}

}
