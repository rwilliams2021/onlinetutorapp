
package com.finalproject.service;

import java.util.List;



import com.finalproject.domain.Tutor;




public interface TutorService {

	public int add(Tutor tutor);
	public List<Tutor> getAll();
	public int update(Tutor tutor);
	public int remove(int id);
	public boolean check(Tutor tutor);
}
