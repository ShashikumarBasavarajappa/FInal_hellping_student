package com.development.controller;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import com.development.dao.ApplicantinfoDAO;
import com.development.dao.RegisterDAO;
import com.development.model.SearchEngine;
@Controller
//checking main value
public class Applicant_Acccount {

	@Autowired
	ApplicantinfoDAO appDao;
	@RequestMapping(value="/welcomepage")
	public ModelAndView welcomepage(HttpServletResponse response,HttpSession session) throws IOException{
		String main_user_name = (String)session.getAttribute("registrationDTO");
		ModelAndView model = new ModelAndView("main_applicant_home");
	   model.addObject("ssssssssssss", "shahshshsh");	
	   model.addObject("main_user_name", main_user_name);
		return model;
	}
	//okkkk
	
	@RequestMapping(value="/welcome_information", method=RequestMethod.GET)
	public ModelAndView welcome_information(@ModelAttribute("welcome_information") SearchEngine welcome_information,HttpSession session){
		
		//SearchEngine profileresult = adminDao.profiledetails(welcome_information.getEmail());
		String email = welcome_information.getEmail();
		// appDao.applicant_information(welcome_information);
		 SearchEngine profileresult = appDao.profiledetails(email);
		
      //int sss = applicantinforesult.getId();
		System.out.println("========sssssssssssssssssssssss=" + profileresult);
		String shashi1 = "shashikumar";
		String main_user_name = (String)session.getAttribute("registrationDTO");
		ModelAndView  model = new ModelAndView("main_applicant_home");
		
		model.addObject("profileresult",profileresult);
		model.addObject("shashi", shashi1);
		model.addObject("main_user_name", main_user_name);
		// return ned the ata
		return model;
	}

}
