package com.development.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.development.dao.RegisterDAO;
import com.development.model.Registration;

@Controller
public class RegistrationController {

	@Autowired
	RegisterDAO regDao;
	@RequestMapping(value="/register")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		ModelAndView model = new ModelAndView("register");
		model.addObject("printme","SHASHIKUMAR !!");
		return model;

	}
	@RequestMapping(value="/sample")
	public ModelAndView sample(HttpServletResponse response) throws IOException{
		ModelAndView model = new ModelAndView("sample");
		
		return model;

	}

	
	@RequestMapping(value="/registerhome", method = RequestMethod.POST)
	public String registerhome(@ModelAttribute("registration") Registration registration) throws IOException{


		//System.out.println("................................" + Email + "=====" + FirstName + "=====" + LastName + "=====" + password + "==========" + Con_pas);
		regDao.save(registration);
		//ModelAndView model = new ModelAndView("rejected_applicants");
		//model.addObject("printme","SHASHIKUMAR !!");
		//return model;
		return "redirect:/welcomepage";

	}	

	@RequestMapping(value="/signin", method = RequestMethod.POST)
	public String signin(@ModelAttribute("registration") Registration registration,HttpSession session, RedirectAttributes rr) throws IOException{

		String username = registration.getEmail();
		String password =  registration.getPassword();
		//System.out.println("................................" +  username + "===================" + password);
		//regDao.save(registration);
		//regDao.save(registration);
		Registration  r = regDao.logincheck(username);
		session.setAttribute("registrationDTO", r.getEmail());
		String username1 = (String)session.getAttribute("registrationDTO");
		System.out.println("===============a=a==a=a==a=a==a=======" + username1);
        //System.out.println("-------------------jjjjjj-------" + sss);
/*
    Trying to add the validation controler, then we will what happen.
    
    better to triim the data then only comparition become easy to do it other ise it will affect
*/
       
       String staffname = r.getEmail().trim();
       String staffpassword = r.getPassword().trim();
       //r.getEmail().trim();
       	
       		System.out.println("............................................................................................." + staffname + ".................................." + staffpassword  + " .........." + username + "..............." + password);
       	
		//if((username.equals(staffname)) && (password.equals(staffpassword))){
			//ModelAndView model = new ModelAndView("adminhome");
			//model.addObject("admindetails", r);
			//return model;
       		//rr.addAllAttributes("usernmae",username);
       		rr.addAttribute("username",username);
			return "redirect:/admin_welcomepage";
         //}
		//else{
		//	ModelAndView model = new ModelAndView("home");
		//	model.addObject("error_msg","Please enter correct email and password");
		//	return model;
		//}
		

	}
}
