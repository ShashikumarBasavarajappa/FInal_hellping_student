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
import com.development.dao.RegisterDAO;
import com.development.model.Archived_user;
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
public class AdminController {

	@Autowired
	AdminDAO adminDao;
	RegisterDAO regDao;
	
	@RequestMapping(value="/adminprofile/search_redirt/{id}")
    public ModelAndView search_redirt(@PathVariable int id,HttpSession session, RedirectAttributes shashi_session) {

		SearchEngine profileresult = adminDao.getAdminDetails(id);
		String main_user_name = (String)session.getAttribute("registrationDTO");
        System.out.println("----------------------------------" + profileresult.getFirst_name());
        ModelAndView model = new ModelAndView("adminhome");
        model.addObject("admindetails", profileresult);
        model.addObject("main_user_name", main_user_name);

        return model;
    }

	/// checking
	@RequestMapping(value="/Adminsearch", method = RequestMethod.GET)
	public ModelAndView registersave(HttpSession session,@ModelAttribute("search") SearchEngine search) throws IOException{

		System.out.println("--------------------------------------------jj---" + search.getFirst_name());
		//String searchtext = search.getEmail();
		//System.out.println("................................" + Email + "=====" + FirstName + "=====" + LastName + "=====" + password + "==========" + Con_pas);
		//regDao.save(registration);
		//SearchEngine ss = (SearchEngine) adminDao.searchAdmin(searchtext);
		List<SearchEngine> searchresult = adminDao.searchAdmin(search);



		String main_user_name = (String)session.getAttribute("registrationDTO");
		
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
		model.addObject("main_user_name", main_user_name);
		return model;

	}

	@RequestMapping(value="/archive_user", method=RequestMethod.GET)
	public ModelAndView archive_user (@ModelAttribute("archive_user") Archived_user archive_user){

		System.out.println("=======****555555555555555555555****" + archive_user.getUser_id());
		int user_id  =  archive_user.getUser_id();
		Archived_user au = adminDao.archive_user(archive_user);
		return null;

	}

	@RequestMapping(value="/rejected_applicants/enable_archiver", method=RequestMethod.GET)
	public ModelAndView enable_archiver (@ModelAttribute("archive_user") Archived_user archive_user,HttpSession session){

		System.out.println("============asddddddddsdsadsads====");
		System.out.println("=======****555555555555555555555****" + archive_user.getUser_id());
		int user_id  =  archive_user.getUser_id();
		Archived_user au = adminDao.enable_archiver(archive_user);
		return null;

	}




	@RequestMapping(value="/adminprofile/profile_save", method = RequestMethod.GET)
	public ModelAndView profile_save(@ModelAttribute("profile_save") SearchEngine profile_save,HttpSession session) {

		//System.out.println("****************************" + first_name + "************" + last_name);

		System.out.println("=======*********" + profile_save.getFirst_name());
		SearchEngine profilesave = adminDao.profilesave(profile_save);
		System.out.println("----------------------------amma ---" + profile_save.getFirst_name());
		String main_user_name = (String)session.getAttribute("registrationDTO");
		ModelAndView model = new ModelAndView("profile");
		model.addObject("profileresult",profilesave);
		model.addObject("main_user_name", main_user_name);
		//System.out.println("................................" + Email + "=====" + FirstName + "=====" + LastName + "=====" + password + "==========" + Con_pas);
	//	regDao.save(registration);
	//	ModelAndView model = new ModelAndView("register");
	//	model.addObject("printme","SHASHIKUMAR !!");
	//	return model;;
		return model;
	}
		@RequestMapping(value="/adminprofile/{email}")
    public ModelAndView profile(@PathVariable String email,HttpSession session, RedirectAttributes shashi_session) {
        //List<User> listUsers = userDao.list();
        System.out.println("profile guru--------" + email);
        SearchEngine profileresult = adminDao.profiledetails(email);

        System.out.println("----------------------------------" + profileresult.getFirst_name());
        String main_user_name = (String)session.getAttribute("registrationDTO");
        ModelAndView model = new ModelAndView("profile");
        model.addObject("profileresult",profileresult);
        model.addObject("main_user_name", main_user_name);
       // model.addObject("userList", listUsers);

        return model;
    }
		
		@RequestMapping(value="/admin_welcomepage")
		public ModelAndView admin_welcomepage(HttpServletRequest req, HttpServletResponse response,RedirectAttributes rrr, HttpSession session, RedirectAttributes shashi_session) throws IOException{
			//Registration  r = regDao.logincheck(username);
			//System.out.println("-------------------------------------------------------" + req.getParameter("username"));
			String username  =  req.getParameter("username");
			SearchEngine rr = adminDao.user_details(username);
		//System.out.println("==========================" + rr.getEmail());
		String main_user_name = (String)session.getAttribute("registrationDTO");
		System.out.println("====================ssss=====" + main_user_name);
				ModelAndView model = new ModelAndView("adminhome");
			//model.addObject(attributeName, attributeValue)
			model.addObject("admindetails", rr);
		    model.addObject("ssssssssssss", "shahshshsh");
		    model.addObject("main_user_name", main_user_name);
			return model;
		}

		 @RequestMapping(value="/logout/{email}",method = RequestMethod.GET)
	        public String logout(HttpServletRequest request){
			
			 request.getSession(false).invalidate();
	          //  HttpSession httpSession = request.getSession();
	           // httpSession.invalidate();
	            return "redirect:/";
	        }
		
		 @RequestMapping(value="/about_us",method = RequestMethod.GET)
	        public ModelAndView about_us(HttpServletRequest request,HttpSession session){
			 String main_user_name = (String)session.getAttribute("registrationDTO");
	            ModelAndView model = new ModelAndView("about_us");
	            model.addObject("main_user_name", main_user_name);
	            return model;
	        }
 // NOtification code started here please review below these lines only
//notification breaking
// Notification design doing know, we completed based on the Primary Key
	     @RequestMapping(value="/notification/{id}")
	        public ModelAndView notification(@PathVariable int id,HttpSession session){
	        	System.out.println("------------shashi ------" + id);
				    Notification notificatonresult = adminDao.getnotificationresult(id);
				    SearchEngine ss = adminDao.getAdminDetails(id);
				    String main_user_name = (String)session.getAttribute("registrationDTO");
				    //System.out.println("00000000000000000" + ss.getEmail());
				    //System.out.println("--------------------" + notificatonresult.getMessage());
	                ModelAndView model = new ModelAndView("notification");
				    model.addObject("notificatonresult",notificatonresult);
				    model.addObject("admindetails", ss);
				    model.addObject("main_user_name", main_user_name);
	                return model;
	     }
//notification code completed here please stop here only

// code to fetch the rejected applicants

	     	@RequestMapping(value="/rejected_applicants/{id}",method = RequestMethod.GET)
		public ModelAndView rejected_applicants(HttpSession session,HttpServletRequest request, HttpServletResponse response,@PathVariable int id){
				System.out.println("------------shashi ------" + id);
				ModelAndView model = new ModelAndView("rejected_applicants");
				List<SearchEngine> adminRejected_users =  adminDao.adminRejected_users();
				String main_user_name = (String)session.getAttribute("registrationDTO");
				for(SearchEngine ss : adminRejected_users){
					System.out.println("========sdfds====" + ss.getFirst_name());
				}
				model.addObject("adminRejected_users",adminRejected_users);
				model.addObject("main_user_name", main_user_name);
				return model;
		}


//pdf coding don't change anything here please it's working fine
		 @RequestMapping(value="/downloadPDF/{email}",method = RequestMethod.GET)
	        public ModelAndView downloadPDF(HttpSession session,HttpServletRequest request, HttpServletResponse response,@PathVariable String email){
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
			    String main_user_name = (String)session.getAttribute("registrationDTO");
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
			 model.addObject("main_user_name", main_user_name);
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
