package com.development.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.hibernate.search.FullTextSession;
import org.hibernate.search.Search;
import org.hibernate.search.query.dsl.QueryBuilder;
import org.postgresql.core.Query;
import org.springframework.transaction.annotation.Transactional;

import com.development.controller.AdminController;
import com.development.model.Registration;
import com.development.model.SearchEngine;
import com.development.model.User;

import javassist.bytecode.Descriptor.Iterator;

public class AdminImpl  implements AdminDAO{


	
	private SessionFactory sessionFactory;
	
	
	private Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }
	
    public AdminImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Transactional	
	public List<SearchEngine> searchAdmin(SearchEngine searchtext) {
		// TODO Auto-generated method stub
    	  Session session = sessionFactory.getCurrentSession();
    	   Criteria cr = session.createCriteria(SearchEngine.class).add(Restrictions.like("email", searchtext.getEmail(),MatchMode.ANYWHERE));
    	   
    	   List<SearchEngine> searchresult = cr.list();
    	
    	  // System.out.println("888888**************************************" + searchresult.getClass().getName() + "=======");
    	   
    	   
    	  
    	  /*
    	  Query query=(Query) session.createQuery("from Registration where email = :email");
    	  ((org.hibernate.Query) query).
          setParameter("email", searchtext);
    	  
    	  List<SearchEngine> companyList  = ((Criteria) query).list();
    	  
           System.out.println("-----------------------------===========================amma========" + companyList.isEmpty() + "=============");

    	  */
         //searchtext="%hello%";
    	   /*
          FullTextSession fullTextSession = Search.getFullTextSession(session);
          //System.out.println("------------------------------- " +searchtext + "-----");
          QueryBuilder qb = fullTextSession.getSearchFactory()
                  .buildQueryBuilder().forEntity(SearchEngine.class).get();
                org.apache.lucene.search.Query query = qb
                  .keyword().onField("first_name")
                  .matching(searchtext)
                  .createQuery();
                org.hibernate.Query hibQuery = 
                        fullTextSession.createFullTextQuery(query, SearchEngine.class);
                //System.out.println("---------------------adddddddddd " + qb.toString() + "==================");
                     List<SearchEngine> results = hibQuery.list();
                     //List rr = hibQuery.list();
                     //List<SearchEngine> results  = ((SearchEngine) hibQuery).getResultList();
                     
                     System.out.println("===========================amma========" + results.size() + "=============");
                      
                     */
    	  // List list = Arrays.asList(searchresult);
    	  // searchresult.get
    	   if(searchresult.size() == 0){
    		   return null;
    	   }
    	   else{
    		   //Iterator<St = new type();>
    	
    		   return searchresult;
    	   }
	}

	@Override
	@Transactional	
	public SearchEngine profiledetails(String email) {
		// TODO Auto-generated method stub
  		  Session session = sessionFactory.getCurrentSession();
	   Criteria cr = session.createCriteria(SearchEngine.class).add(Restrictions.like("email", email,MatchMode.ANYWHERE));
	   SearchEngine profileresult = (SearchEngine) cr.uniqueResult();
		System.out.println("----------------------------" + profileresult.getFirst_name());
		  // if(profileresult.getEmail() equals(email)){
    		   return profileresult;
    	  //}
    	   //else{
    		 //  //Iterator<St = new type();>
    	
    		   //return null;
    	   //}

	}

	@Override
	@Transactional		
	public SearchEngine profilesave(SearchEngine profile_save) {
		System.out.println("********************************************************hhh888888*************");
		// TODO Auto-generated method stub
		//System.out.println("---------------" + profile_save.getFirst_name());
		Session session = sessionFactory.getCurrentSession();
		int id = profile_save.getId();
		SearchEngine sps = getDetails(id);
		System.out.println("--------------------profile ----" + sps.getPassword());
		sps.setEmail(profile_save.getEmail());
		sps.setFirst_name(profile_save.getFirst_name());
		session.update(sps);
		//session.update('email',profile_save.getEmail());
		//return (SearchEngine) session.get(SearchEngine.class,profile_save.getEmail());
		//System.out.println("-----------sdf------" + l.size());
		//session.update(profile_save);
		//SearchEngine.classreturn null;
		return sps;
	}

	public SearchEngine getDetails(int id){
		System.out.println("9999999999999***9999999999" + id);
		Session session = sessionFactory.getCurrentSession();
	
		SearchEngine ss = (SearchEngine) session.get(SearchEngine.class, id);
		System.out.println("666666666666666666666*****************6666666666666" + ss.getPassword());
		
		return ss;
		
	}
	
    
	//@Override
	//
	
}
