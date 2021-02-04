package com.finalproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomePageController {

	//the logout button in each of the navigation menus returns user to the home/index jsp.
	@RequestMapping(value = "/logout",method = RequestMethod.GET)
	public String goHome() {

		return "index";
	}
}
