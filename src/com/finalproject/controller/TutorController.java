package com.finalproject.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;

import javax.servlet.http.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.finalproject.domain.Parent;
import com.finalproject.domain.Tutor;
import com.finalproject.service.TutorService;

@Controller
public class TutorController {

	private List<Tutor> tutor = new ArrayList<Tutor>();

	@Autowired
	private TutorService tutorService;

	@RequestMapping(value = "/tutor", method = RequestMethod.GET)
	public String getTutors(Model model) {
		List<Tutor> tutor = tutorService.getAll();
		model.addAttribute("tutor", tutor);
		return "adminshowtutors";

	}

	@RequestMapping(value = "/tutors", method = RequestMethod.GET)
	public String getTutorsParent(Model model) {
		List<Tutor> tutor = tutorService.getAll();
		model.addAttribute("tutor", tutor);
		return "parentshowtutors";

	}

	@RequestMapping(value = "/profile", method = RequestMethod.GET)
	public String getTutorById(HttpSession session, Model model) {
		List<Tutor> tutor = tutorService.getByIdl((Integer) session.getAttribute("id"));
		model.addAttribute("tutor", tutor);
		return "tutorprofile";

	}

	public void setTutorService(TutorService tutorService) {
		this.tutorService = tutorService;
	}

	@RequestMapping(value = "/addtutors", method = RequestMethod.GET)
	public String add() {
		return "addtutorsnew";
	}

	@RequestMapping(value = "/addtutors", method = RequestMethod.POST)
	public String doAdd(String name, String email, String password, String cell_number, String location, Model model) {
		Tutor t = new Tutor();
		t.setName(name);
		t.setEmail(email);
		t.setPassword(password);
		t.setCell_number(cell_number);
		t.setLocation(location);
		t.setRating(0); //default rating is 0
		try {
			int n = tutorService.add(t);
			if (n > 0)
				model.addAttribute("msg", "Name: " + name + "  ,  " + "Email: " + email + "  ,  " + "Password: "
						+ password + "  ,  " + "Cell Number: " + cell_number + " , " + "Location:" + location);
			return "addtutorsresult";
		} catch (Exception e) {
			model.addAttribute("msg", "Email already exists");
			return "addtutorsnew";
		}
	}

	@RequestMapping(value = "/updatetutor", method = RequestMethod.POST)
	public String update(String id, String name, String email, String password, String cell_number, String location,
			Model model) {
		Tutor t = new Tutor();
		t.setId(Integer.parseInt(id));
		t.setName(name);
		t.setEmail(email);
		t.setPassword(password);
		t.setCell_number(cell_number);
		t.setLocation(location);
		int n = tutorService.update(t);
		if (n > 0)
			model.addAttribute("msg", "Name: " + name + "  ,  " + "Email: " + email + "  ,  " + "Cell Number: "
					+ cell_number + " , " + "Location:" + location);
		return "updatetutorresult";

	}

	@RequestMapping(value = "/updatetutor", method = RequestMethod.GET)
	public String updateTutorsResult() {
		return "updatetutor";

	}

	@RequestMapping(value = "/deletetutor", method = RequestMethod.POST)
	public String deleteTutor(int tid, Model model) {
		int n = tutorService.remove(tid);

		List<Tutor> tutor = tutorService.getAll();
		model.addAttribute("tutor", tutor);
		if (n > 0) {
			return "adminshowtutors";
		} else {
			model.addAttribute("msg", "Failed to delete tutor");
			return "adminshowtutors";
		}
	}

	@RequestMapping(value = "/logintutor", method = RequestMethod.GET)
	public String doLogin() {
		return "logintutor";
	}

	@RequestMapping(value = "/logintutor", method = RequestMethod.POST)
	public String doCheck(String email, String password, HttpSession session, Model model) {
		Tutor t = new Tutor();
		t.setEmail(email);
		t.setPassword(password);
		if (tutorService.check(t)) {
			int id = tutorService.getByEmail(email);
			session.setAttribute("id", id);
			session.setAttribute("email", email);
			return "tutorhome";
		} else {
			model.addAttribute("msg", "Invalid email/password");
			return "logintutor";
		}
	}

	@RequestMapping(value = "/addrating", method = RequestMethod.POST)
	public String doRating(int tutorid, String tname, String temail, String tpassword, String tlocation, int myrating,
			HttpSession session, Model model) {

		List<Tutor> tutor = tutorService.getByIdl(tutorid);
		Tutor t = tutor.get(0);
		t.setName(tname);
		t.setEmail(temail);
		t.setPassword(tpassword);
		t.setLocation(tlocation);
		t.setRating(myrating);
		int n = tutorService.update(t);
		if (n > 0) {
			return "redirect:/tutors";
		}else {
			model.addAttribute("msg", "Failed to update.");
			return "redirect:/tutors";
		}
	}

}
