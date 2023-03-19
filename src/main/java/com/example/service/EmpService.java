package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Repo.EmpCRUD;
import com.example.model.Employees;

@Service
public class EmpService {

	@Autowired
	EmpCRUD obj;

	
	public void savedata(Employees emp) {
		obj.save(emp);
	}
	
	public List<Employees> getBydept(String dept){
		return obj.findBydept(dept);
	}
	
	public List<Employees> getByrating(float rating){
		return obj.findByrating(rating);
	}
	
	public List<Employees> getByratingdesigination(float rating, String desigination){
		return obj.findByratingdesigination(rating, desigination);
	}
	
}
