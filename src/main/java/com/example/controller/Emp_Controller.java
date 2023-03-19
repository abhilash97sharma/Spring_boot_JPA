package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Employees;
import com.example.service.EmpService;

import ch.qos.logback.classic.Logger;

@RestController
public class Emp_Controller {

	@Autowired
	EmpService empser_obj;
	

	@GetMapping("home")
	@ResponseBody
	public String out() {
		return "hello";
	}

	@PostMapping("insert")
	@ResponseBody
	public String saveData(@RequestBody() Employees emp) {
		
		System.out.println(emp.toString());

		try {
			empser_obj.savedata(emp);
			return "Data saved successfully";
		} catch (Exception e) {
			return null;
		}

	}
	
	@PostMapping("getDept")
	@ResponseBody
	public List<Employees> getBydept(@RequestBody() Employees emp){
		String dept = emp.getDesigination();
		List<Employees>obj = empser_obj.getBydept(dept);
		System.out.println(obj);
		return obj;
	}
	
	@PostMapping("getrating")
	@ResponseBody
	public List<Employees> getByrating(@RequestBody() Employees emp){
		float rating = emp.getRating();
		List<Employees>obj = empser_obj.getByrating(rating);
		System.out.println(obj);
		return obj;
	}
	
	
	@PostMapping("getratingdesigination")
	@ResponseBody
	public List<Employees> getByratingdesigination(@RequestBody() Employees emp){
		float rating = emp.getRating();
		String desigination = emp.getDesigination();
		List<Employees>obj = empser_obj.getByratingdesigination(rating, desigination);
		System.out.println(obj);
		return obj;
	}
	
	@PostMapping("deletebyid")
	@ResponseBody
	public void deleteObj(@RequestBody() Employees emp) {
		int id = emp.getId();
		try {
		empser_obj.deletebyId(id);
		System.out.println("emp object with the "+id+" is deleted successfully");
		}
		catch (Exception e){
			System.out.println(e.getMessage());
		}
	}

}
