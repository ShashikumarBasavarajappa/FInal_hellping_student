package com.development.model;

import java.io.Serializable;
import java.util.List;

public class States implements Serializable {

	private int id;
	private String name;
	private List city;
	
	public States(){
		// default constructor declared here
	}
	
	public List getCity() {
		return city;
	}
	public void setCity(List city) {
		this.city = city;
	}
	public int getId() {
		return id;
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

}
