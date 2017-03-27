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

import com.development.dao.AdminDAO;
import com.development.dao.RegisterDAO;
import com.development.model.Registration;
import com.development.model.SearchEngine;

import javassist.bytecode.Descriptor.Iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

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
public class AdminController {

	@Autowired
	AdminDAO adminDao;
	RegisterDAO regDao;
	@RequestMapping(value="/adminprofile/search_redirt/{id}")
    public ModelAndView search_redirt(@PathVariable int id) {

		SearchEngine profileresult = adminDao.getAdminDetails(id);

        System.out.println("----------------------------------" + profileresult.getFirst_name());
        ModelAndView model = new ModelAndView("adminhome");
        model.addObject("admindetails", profileresult);
        
        return model;
    }

	
	@RequestMapping(value="/Adminsearch", method = RequestMethod.GET)
	public ModelAndView registersave(@ModelAttribute("search") SearchEngine search) throws IOException{

		System.out.println("--------------------------------------------jj---" + search.getFirst_name());
		//String searchtext = search.getEmail();
		//System.out.println("................................" + Email + "=====" + FirstName + "=====" + LastName + "=====" + password + "==========" + Con_pas);
		//regDao.save(registration);
		//SearchEngine ss = (SearchEngine) adminDao.searchAdmin(searchtext);
		List<SearchEngine> searchresult = adminDao.searchAdmin(search);
		
		
		
	
		//System.out.println(searchresult.ne);
		//List ss = (List) searchresult.iterator();
		//while(ss.it)
   	  
		//for (int i = 0; i < ss.size(); i++) {
			//System.out.println("*********************"  + ss + "-------------------------");
		////}
		//searchresult.
		//List<SearchEngine> ss = (List<SearchEngine>) searchresult;
		
		//SearchEngine[] ss= (SearchEngine[])searchresult;
		//ArrayList<SearchEngine> ss = new
		
		//List<List<SearchEngine>> cardsList = Arrays.asList(searchresult);
		
		//System.out.println(cardsList.);
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
    
		 @RequestMapping(value="/logout",method = RequestMethod.GET)
	        public String logout(HttpServletRequest request){
	            HttpSession httpSession = request.getSession();
	            httpSession.invalidate();
	            return "redirect:/";
	        }
		 

		 @RequestMapping(value="/downloadPDF/{email}",method = RequestMethod.GET)
	        public ModelAndView downloadPDF(HttpServletRequest request, HttpServletResponse response,@PathVariable String email){
	            //HttpSession httpSession = request.getSession();
	            //httpSession.invalidate();
			 //System.out.println("------------------------" + email);
			 //List<SearchEngine> listBooks  = new ArrayList<SearchEngine>();

				final ServletContext servletContext = request.getSession().getServletContext();
			    final File tempDirectory = (File) servletContext.getAttribute("javax.servlet.context.tempdir");
			    final String temperotyFilePath = tempDirectory.getAbsolutePath();

			    String fileName = "Resume.pdf";
			    response.setContentType("application/pdf");
			    response.setHeader("Content-disposition", "attachment; filename="+ fileName);
			    String email1 ="shashi2466@gmail.com";
		        SearchEngine profileresult = adminDao.profiledetails(email);
			    try {

			        CreatePDF.createPDF(temperotyFilePath+"\\"+fileName,profileresult);
			        ByteArrayOutputStream baos = new ByteArrayOutputStream();
			        baos = convertPDFToByteArrayOutputStream(temperotyFilePath+"\\"+fileName);
			        OutputStream os = response.getOutputStream();
			        baos.writeTo(os);
			        os.flush();
			    } catch (Exception e1) {
			        e1.printStackTrace();
			    }

		 
		        // return a view which will be resolved by an excel view resolver
		        //return new ModelAndView("pdfView", "listBooks", listBooks);
			 ModelAndView model = new ModelAndView("adminhome");
		//		model.addObject("searchresult",searchresult);
				return model;
				
		 
		 }
			
			private ByteArrayOutputStream convertPDFToByteArrayOutputStream(String fileName) {

				InputStream inputStream = null;
				ByteArrayOutputStream baos = new ByteArrayOutputStream();
				try {

					inputStream = new FileInputStream(fileName);
					byte[] buffer = new byte[1024];
					baos = new ByteArrayOutputStream();

					int bytesRead;
					while ((bytesRead = inputStream.read(buffer)) != -1) {
						baos.write(buffer, 0, bytesRead);
					}

				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				} finally {
					if (inputStream != null) {
						try {
							inputStream.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
				}
				return baos;
			}
		
}
