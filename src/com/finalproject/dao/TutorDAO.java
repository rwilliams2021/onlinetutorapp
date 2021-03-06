package com.finalproject.dao;

import java.util.List;

import com.finalproject.domain.Parent;
import com.finalproject.domain.Tutor;



public interface TutorDAO {
	
	public int add(Tutor tutor);
	public List<Tutor> findAll();
	public List<Tutor> findById(int id);
	public int findByEmail(String email);
	public int update(Tutor tutor);
	public int delete(int id);
	public boolean checkLogin(Tutor tutor);

}
