package com.finalproject.service;

import java.util.List;



import com.finalproject.domain.Tutor;




public interface TutorService {

	public int add(Tutor tutor);
	public List<Tutor> getAll();
}
