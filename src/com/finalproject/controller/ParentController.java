package com.finalproject.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.finalproject.domain.Parent;
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

	@RequestMapping(value = "/deleteparent", method = RequestMethod.POST)
	public String deleteParent(int pid, Model model) {
		int n = parentService.remove(pid);
		
		List<Parent> parents =  parentService.getAll();
		model.addAttribute("parents", parents);
		if(n>0) {
			return "showparents";
		}
		else {
			model.addAttribute("msg", "Failed to delete parent");
			return "showparents";
		}
	}

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String registerParents() {
		;
		return "registerparent";
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String doRegister(String name, String email, String password, String cellno, Model model) {

		if ((name != "") && (email != "") && (password != "") && (cellno != "")) {
			Parent p = new Parent();
			p.setName(name);
			p.setEmail(email);
			p.setPassword(password);
			p.setCellno(cellno);
			int n = parentService.add(p);
			if (n > 0)
				return "parentlogin";
			else
				return "registerparent";
		} else {
			model.addAttribute("msg", "Please fill in all fields");
			return "registerparent";
		}
	}

	@RequestMapping(value = "/loginparents", method = RequestMethod.GET)
	public String doLogin() {
		return "loginparent";
	}

	@RequestMapping(value = "/loginparents", method = RequestMethod.POST)
	public String doCheck(String email, String password, HttpSession session, Model model) {
		Parent p = new Parent();
		p.setEmail(email);
		p.setPassword(password);
		if (parentService.check(p)) {
			session.setAttribute("email", email);
			// parentService.updateCart(session.getId(), email); //possibly updatetutor here
			// instead
			return "parenthome";
		} else {
			model.addAttribute("msg", "Invalid email/password");
			return "loginparent";
		}
	}

	public void setParentService(ParentService parentService) {
		this.parentService = parentService;
	}

}
