package com.finalproject.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.finalproject.domain.Admin;
import com.finalproject.service.AdminService;

@Controller
public class LoginController {
	 
	@Autowired
	private AdminService adminService;
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String doLogin() {
		return "loginpage";
	}
	
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String doCheck(String username, String password, HttpSession session, Model model) 
	{
		Admin a = new Admin();
		a.setUsername(username);
		a.setPassword(password);
		
		if(adminService.check(a))
		{
			session.setAttribute("username", username);
			return "adminhome";
		}
		else 
		{
			model.addAttribute("msg", "Invalid Credentials");
			return "loginpage";
		}
	
	}
	
	public void setAdminService(AdminService adminService) 
	{
		this.adminService = adminService;
	}

}

