package com.finalproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomePageController {
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String goIndexHome() {
		return "index";
	}
	@RequestMapping(value = "/adminhome", method = RequestMethod.GET)
	public String goAdminHome() {
		return "adminhome";
	}
	@RequestMapping(value = "/tutorhome", method = RequestMethod.GET)
	public String goTutorHome() {
		return "tutorhome";
	}
	@RequestMapping(value = "/parenthome", method = RequestMethod.GET)
	public String goParentHome() {
		return "parenthome";
	}
}
