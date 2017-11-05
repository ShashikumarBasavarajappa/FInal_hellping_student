package com.development.controller;

import java.io.File;
import java.io.IOException;

import org.hibernate.search.Search;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.development.dao.AdminDAO;
import com.development.dao.ApplicantinfoDAO;
import com.development.dao.CollegeDetailsDAO;
import com.development.dao.RegisterDAO;
import com.development.model.About_us;
import com.development.model.Archived_user;
import com.development.model.College_braches;
import com.development.model.Notification;
import com.development.model.Registration;
import com.development.model.SearchEngine;

import javassist.bytecode.Descriptor.Iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import javax.mail.Session;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.OutputStream;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class CollegeViewController {
	@Autowired
	CollegeDetailsDAO  colDao;



	@RequestMapping(value="/college_data")
    public ModelAndView search_redirt(HttpServletResponse response, HttpServletRequest request) {
		
		System.out.println("--------------------printing something to fix the issue---------");
        ModelAndView model = new ModelAndView("college_home");

        return model;
    }
	
	

	@RequestMapping(value="/about_college")
    public ModelAndView about_college(HttpServletResponse response, HttpServletRequest request) {
		
		System.out.println("--------------------printing something to fix the issue---------");
		
        ModelAndView model = new ModelAndView("college_home");
        model.addObject("aboutcollege","aboutcollege");
        return model;
    }
	
	
	@RequestMapping(value="/college_braches")	
    public ModelAndView college_braches(HttpServletResponse response, HttpServletRequest request) {
		
		System.out.println("--------------------printing something to fix the issue---------");
		int college_id= 1;
		List<College_braches>  profileresult = (List<College_braches>) colDao.College_braches_detail(college_id);
		
        ModelAndView model = new ModelAndView("college_home");
        model.addObject("branchdetails",profileresult);
        return model;
    }
    
	@RequestMapping(value="/lectures_list")
     public ModelAndView lectures_list(HttpServletResponse response, HttpServletRequest request){
              System.out.println("--------------------some how i entered here after that---------");
            int college_id = 1;
            List<College_braches>  lecturedetails = (List<College_braches>) colDao.College_lecture_details(college_id);
            System.out.println("-------lecture sir----------dd-" +  lecturedetails);
              ModelAndView model = new ModelAndView("college_home");
            model.addObject("check_lecture", " yes");
          return model;
     }
}
