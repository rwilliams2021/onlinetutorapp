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
import com.finalproject.domain.Request;
import com.finalproject.domain.Tutor;
import com.finalproject.service.ParentService;
import com.finalproject.service.RequestService;
import com.finalproject.service.TutorService;

@Controller
public class RequestController {
	
	@Autowired
	private RequestService requestService;
	@Autowired
	private TutorService tutorService;
	@Autowired
	private ParentService parentService;
	
	@RequestMapping(value = "/addrequest", method = RequestMethod.GET)
	public String add() {
		return "showtutors";
	}

	@RequestMapping(value = "/addrequest", method = RequestMethod.POST)
	public String add(int tutorid, HttpSession session, Model model) {

		Request r = new Request();
		r.setParentid((Integer) session.getAttribute("id"));
		r.setTutorid(tutorid);
		requestService.add(r);
		return "redirect:/tutorsrequested";
	}
	@RequestMapping(value = "/tutorsrequested", method = RequestMethod.GET)
	public String requestlist(HttpSession session, Model model) {
		
		//Get all bookings for the logged in parent
		List<Request> requests = requestService.findById((Integer)session.getAttribute("id")); 
				
		List<Tutor> tutor = new ArrayList<Tutor>();
		for(Request r : requests) {
			int tutorid = r.getTutorid();
			List<Tutor> tlist = tutorService.getByIdl(tutorid); //return the tutor from tutor table with the tutorid
			//Access the tutor from tlist and add it to the tutor list
			for(Tutor t : tlist) {
				tutor.add(t);
			}
		}
		model.addAttribute("tutor", tutor);
		return "requestedtutorslist";	
	}
	@RequestMapping(value = "/parentsrequested", method = RequestMethod.GET)
	public String requestlist2(HttpSession session, Model model) {
		
		//Get all bookings for the logged in parent
		List<Request> requests = requestService.findByTutorId((Integer)session.getAttribute("id")); 
				
		List<Parent> parents = new ArrayList<Parent>();
		for(Request r : requests) {
			int parentid = r.getParentid();
			List<Parent> plist = parentService.getByIdl(parentid); //return the parent from parent table with the parentid
			//Access the parent from plist and add it to the parent list
			for(Parent p : plist) {
				parents.add(p);
			}
		}
		model.addAttribute("parents", parents);
		return "requestedparentslist";	
	}


}
