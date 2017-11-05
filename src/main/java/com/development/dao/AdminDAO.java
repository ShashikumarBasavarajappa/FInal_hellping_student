package com.development.dao;

import java.util.List;

import com.development.model.About_us;
import com.development.model.Archived_user;
import com.development.model.Notification;
import com.development.model.Registration;
import com.development.model.SearchEngine;
import com.development.model.User;

public interface AdminDAO {
                public List<SearchEngine> searchAdmin(SearchEngine searchtext);
                public  SearchEngine profiledetails(String email);
                public  SearchEngine user_details(String email);
                public List<About_us> get_user_convesation_comments(String email);
                public  About_us Save_valueable_comments(About_us about_us);
                public  SearchEngine getAdminDetails(int id);
                public SearchEngine profilesave(SearchEngine profile_save);
		public  Notification getnotificationresult(int id);
		public Archived_user archive_user(Archived_user archive_user);
		public List<SearchEngine> adminRejected_users();
		public Archived_user enable_archiver(Archived_user archive_user);

}
