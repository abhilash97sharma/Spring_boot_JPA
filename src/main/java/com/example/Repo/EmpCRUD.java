package com.example.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.model.Employees;

public interface EmpCRUD extends CrudRepository<Employees, Integer>{

	@Query("from Employees where desigination = ?1")  // passing custom queries 
	List<Employees> findBydept(String dept);
	
	@Query("from Employees where rating > :rating")
	List<Employees> findByrating(float rating);
	
	@Query("from Employees where rating > :rating and desigination = :desigination")
	List<Employees> findByratingdesigination(float rating, String desigination);
	
}
