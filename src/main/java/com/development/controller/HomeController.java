package com.development.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.development.dao.UserDAO;
import com.development.model.User;

@Controller
public class HomeController {

	@Autowired
    private UserDAO userDao;
	@RequestMapping(value="/", method = RequestMethod.GET)
	public ModelAndView test(HttpServletResponse response, HttpServletRequest request) throws IOException{
		 HttpSession session= request.getSession(false);
	        SecurityContextHolder.clearContext();
	        if(session != null) {
	            session.invalidate();
	     
	        }
	        	ModelAndView model = new ModelAndView("home");
	        
		model.addObject("printme","SHASHIKUMAR !!");
		return model;	        
	}
	
	@RequestMapping(value="/home")
    public ModelAndView home() {
        List<User> listUsers = userDao.list();
        ModelAndView model = new ModelAndView("homepage");
        model.addObject("userList", listUsers);
        
        return model;
    }
}
