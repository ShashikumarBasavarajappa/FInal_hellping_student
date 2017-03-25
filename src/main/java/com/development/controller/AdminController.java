package com.development.controller;

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

import com.development.dao.AdminDAO;
import com.development.dao.RegisterDAO;
import com.development.model.Registration;
import com.development.model.SearchEngine;

import javassist.bytecode.Descriptor.Iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@Controller
public class AdminController {

	@Autowired
	AdminDAO adminDao;
	RegisterDAO regDao;
	@RequestMapping(value="/Adminsearch", method = RequestMethod.GET)
	public ModelAndView registersave(@ModelAttribute("search") SearchEngine search) throws IOException{

		System.out.println("--------------------------------------------jj---" + search.getFirst_name());
		//String searchtext = search.getEmail();
		//System.out.println("................................" + Email + "=====" + FirstName + "=====" + LastName + "=====" + password + "==========" + Con_pas);
		//regDao.save(registration);
		//SearchEngine ss = (SearchEngine) adminDao.searchAdmin(searchtext);
		List<SearchEngine> searchresult = adminDao.searchAdmin(search);
	
		//for (int i = 0; i < ss.size(); i++) {
			//System.out.println("*********************"  + ss + "-------------------------");
		////}
		//searchresult.
		//List<SearchEngine> ss = (List<SearchEngine>) searchresult;
		
		//SearchEngine[] ss= (SearchEngine[])searchresult;
		//ArrayList<SearchEngine> ss = new
		
		//List<List<SearchEngine>> cardsList = Arrays.asList(searchresult);
		
		//System.out.println(cardsList.);


		for (SearchEngine e : searchresult) {
			SearchEngine sss =  (SearchEngine) e;
		    System.out.println("============================999999999999" + sss.getEmail() + "=============" + sss.getPassword() + "=======================6666");
		}
		
		 
		//System.out.println("====================" + + "---------------------------------");
		ModelAndView model = new ModelAndView("adminhome");
		model.addObject("searchresult",searchresult);
		return model;
		
	}

	@RequestMapping(value="/adminprofile/profile_save", method = RequestMethod.GET)
	public ModelAndView profile_save(@ModelAttribute("profile_save") SearchEngine profile_save) {
		
		//System.out.println("****************************" + first_name + "************" + last_name);

		System.out.println("=======*********" + profile_save.getFirst_name());
		SearchEngine profilesave = adminDao.profilesave(profile_save);
		System.out.println("----------------------------amma ---" + profile_save.getFirst_name());
		ModelAndView model = new ModelAndView("profile");
		model.addObject("profileresult",profilesave);
		//System.out.println("................................" + Email + "=====" + FirstName + "=====" + LastName + "=====" + password + "==========" + Con_pas);
	//	regDao.save(registration);
	//	ModelAndView model = new ModelAndView("register");
	//	model.addObject("printme","SHASHIKUMAR !!");
	//	return model;
		return model;
	}
		@RequestMapping(value="/adminprofile/{email}")
    public ModelAndView profile(@PathVariable String email) {
        //List<User> listUsers = userDao.list();
        System.out.println("profile guru--------" + email);
        SearchEngine profileresult = adminDao.profiledetails(email);

        System.out.println("----------------------------------" + profileresult.getFirst_name());
        ModelAndView model = new ModelAndView("profile");
        model.addObject("profileresult",profileresult);
       // model.addObject("userList", listUsers);
        
        return model;
    }
	
}
