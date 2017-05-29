package com.development.dao;

import java.util.List;

import com.development.model.Archived_user;
import com.development.model.Notification;
import com.development.model.Registration;
import com.development.model.SearchEngine;
import com.development.model.User;

public interface AdminDAO {
	public List<SearchEngine> searchAdmin(SearchEngine searchtext);

    public  SearchEngine profiledetails(String email);
    public  SearchEngine getAdminDetails(int id);
    public SearchEngine profilesave(SearchEngine profile_save);
		public  Notification getnotificationresult(int id);

		public Archived_user archive_user(Archived_user archive_user);
		public List<SearchEngine> adminRejected_users();



    //System.out.println("=======sdfadsfds===" + email);


}
