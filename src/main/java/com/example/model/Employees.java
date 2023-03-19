package com.example.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employees {

	@Id
	private int id;
	private String name;
	private String Desigination;
	private float rating;

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Employees [id=" + id + ", name=" + name + ", Desigination=" + Desigination + "]";
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesigination() {
		return Desigination;
	}

	public void setDesigination(String desigination) {
		Desigination = desigination;
	}

}
