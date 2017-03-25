package com.development.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

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
	
	@RequestMapping(value="/registersave", method = RequestMethod.POST)
	public ModelAndView registersave(@ModelAttribute("registration") Registration registration) throws IOException{

		
		//System.out.println("................................" + Email + "=====" + FirstName + "=====" + LastName + "=====" + password + "==========" + Con_pas);
		regDao.save(registration);
		ModelAndView model = new ModelAndView("register");
		model.addObject("printme","SHASHIKUMAR !!");
		return model;
		
	}
	
	@RequestMapping(value="/signin", method = RequestMethod.POST)
	public ModelAndView signin(@ModelAttribute("registration") Registration registration) throws IOException{

		String username = registration.getEmail();
		String password =  registration.getPassword();
		//System.out.println("................................" +  username + "===================" + password);
		//regDao.save(registration);
		//regDao.save(registration);
		Registration  r = regDao.logincheck(username);
        System.out.println("-------------------jjjjjj-------" + r.getFirst_name());

		if(r != null){
			ModelAndView model = new ModelAndView("adminhome");
			model.addObject("admindetails", r);
			return model;
         }
		else{
			ModelAndView model = new ModelAndView("home");
			model.addObject("error_msg","Please enter correct email and password");
			return model;
		}
		
	}
}
