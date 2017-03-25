package com.development.dao;

import java.util.List;

import com.development.model.Registration;
import com.development.model.SearchEngine;
import com.development.model.User;

public interface AdminDAO {
	public List<SearchEngine> searchAdmin(SearchEngine searchtext);
    
    public  SearchEngine profiledetails(String email);
    public SearchEngine profilesave(SearchEngine profile_save);
    
    //System.out.println("=======sdfadsfds===" + email);


}
