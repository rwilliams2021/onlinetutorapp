package com.finalproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finalproject.dao.TutorDAO;

import com.finalproject.domain.Tutor;



@Service
public class TutorServiceImpl implements TutorService {
	
	@Autowired
	private TutorDAO tutorDAO;
	

	
	
	public void setTutorDAO(TutorDAO tutorDAO) {
		this.tutorDAO = tutorDAO;
	}
	@Override
	public int add(Tutor tutor) {
		int n = tutorDAO.add(tutor);
		return n;
	}
	@Override
	public List<Tutor> getAll() {
		return tutorDAO.findAll();
	}

}
