package com.finalproject.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.finalproject.domain.Admin;
import com.finalproject.domain.Parent;
import com.finalproject.service.AdminService;

@Controller
public class AdminController {
	 
	@Autowired
	private AdminService adminService;
	
	@RequestMapping(value = "/admins",method = RequestMethod.GET)
	public String getAdmins(Model model) {
		
		List<Admin> admins =  adminService.getAll();
		model.addAttribute("admins", admins);
		return "showadmins";
	}
	@RequestMapping(value = "/deleteadmin", method = RequestMethod.POST)
	public String deleteadmin(int pid, Model model) {
		int n = adminService.remove(pid);
		
		List<Admin> admins =  adminService.getAll();
		model.addAttribute("admins", admins);
		if(n>0) {
			return "showadmins";
		}
		else {
			model.addAttribute("msg", "Failed to delete admin");
			return "showadmins";
		}
	}
	@RequestMapping(value = "/addadmin", method = RequestMethod.GET)
	public String registerParents() {
		return "addingadmin";
	}
	@RequestMapping(value = "/addadmin", method = RequestMethod.POST)
	public String doRegister(String username, String password, Model model) {

		if ((username != "") && (password != "")) {
			Admin a = new Admin();
			a.setUsername(username);
			a.setPassword(password);
			try {
				int n = adminService.add(a);
				if (n > 0)
					return "redirect:/admins";
				else
					return "addadmins";
			} catch (Exception e) {
				model.addAttribute("msg", "Email already exists");
				return "addadmins";			}

		} else {
			model.addAttribute("msg", "Please fill in all fields");
			return "addadmins";
		}
	}
	
	@RequestMapping(value = "/loginadmins", method = RequestMethod.GET)
	public String doLogin() {
		return "loginpage";
	}
	
	
	@RequestMapping(value = "/loginadmins", method = RequestMethod.POST)
	public String doLogin2(String username, String password, HttpSession session, Model model) 
	{
		Admin a = new Admin();
		a.setUsername(username);
		a.setPassword(password);
		
		if(adminService.check(a))
		{
			int id = adminService.getByUsername(username);
			session.setAttribute("id", id);
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

