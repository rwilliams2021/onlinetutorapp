package com.finalproject.dao;

import java.util.List;


import com.finalproject.domain.Tutor;



public interface TutorDAO {
	
	public int add(Tutor tutor);
	public List<Tutor> findAll();

}
