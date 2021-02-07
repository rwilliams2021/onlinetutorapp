package com.finalproject.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LogoutController {
	@RequestMapping(value = "/logout",method = RequestMethod.GET)
	public String doLogout(HttpSession session) {
		session.setAttribute("id", null);
		return "index";
	}
}
