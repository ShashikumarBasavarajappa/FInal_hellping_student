package com.development.dao;

import java.util.List;

import com.development.model.College_braches;



public interface CollegeDetailsDAO {

	public List<College_braches> College_braches_detail(int college_id);
	public List<College_braches> College_lecture_details(int college_id);
}
