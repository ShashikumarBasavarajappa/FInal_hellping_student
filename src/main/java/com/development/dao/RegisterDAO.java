package com.development.dao;

import com.development.model.Registration;

public interface RegisterDAO {

	void save(Registration registration);
	public Registration logincheck(String email);
	
	
}
