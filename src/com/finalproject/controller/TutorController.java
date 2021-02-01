package com.finalproject.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.finalproject.domain.Tutor;
import com.finalproject.service.TutorService;



@Controller
public class TutorController {
	
	
	private List<Tutor> tutor = new ArrayList<Tutor>();

	@Autowired
	private TutorService tutorService;
	
	@RequestMapping(value = "/tutor",method = RequestMethod.GET)
	public String getTutors(Model model) {
		
		List<Tutor> tutor =  tutorService.getAll();
		model.addAttribute("tutor", tutor);
		return "showtutors";
		
	}

	public void setTutorService(TutorService tutorService) {
		this.tutorService = tutorService;
	}

	

/*	@RequestMapping(value = "/tutor", method = RequestMethod.POST)
	public String add() {
		return "redirect:/addtutors"; */
	
	
	
		@RequestMapping(value = "/addtutors", method = RequestMethod.POST)
			public String add(Tutor tutor) {
			return "addtutors";
		}
			
			@RequestMapping(value = "/addtutors", method = RequestMethod.GET)
			public String add() {
			return "addtutorsresult"; 
			
			
		}
	
	
	}
			


