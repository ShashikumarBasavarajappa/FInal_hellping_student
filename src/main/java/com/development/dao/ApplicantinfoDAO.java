package com.development.dao;

import java.util.List;

import com.development.model.Archived_user;
import com.development.model.Notification;
import com.development.model.Registration;
import com.development.model.SearchEngine;
import com.development.model.User;

public interface ApplicantinfoDAO {

	
	public List<SearchEngine> applicant_information(SearchEngine welcome_info);

	public SearchEngine profiledetails(String email);
	
}
