/*package com.finalproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.finalproject.service.ParentService;

@Controller
public class ParentController {
	@Autowired
	private ParentService parentService;
	
	@RequestMapping(value = "/parents",method = RequestMethod.GET)
	public String getParents(Model model) {
		
		List<Parent> parents =  parentService.getAll();
		model.addAttribute("parents", parents);
		return "showparents";
		
	}
	@RequestMapping(value = "/loginparents", method = RequestMethod.GET)
	public String doLogin() {
		return "loginparent";
	}

	@RequestMapping(value = "/loginparents", method = RequestMethod.POST)
	public String doCheck(String email, String password,HttpSession session,Model model) {
		Parent p = new Parent();
		p.setEmail(email);
		p.setPassword(password);
		if (parentService.check(p))
		{
			session.setAttribute("email", email);
//			parentService.updateCart(session.getId(), email); //possibly updatetutor here instead
			return "showtutors";
		}
		else {
			model.addAttribute("msg","Invalid email/password");
			return "loginparent";
		}

	public void setParentService(ParentService parentService) {
		this.parentService = parentService;
	}

	
}
*/