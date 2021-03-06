package com.development.dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.management.remote.NotificationResult;
import javax.transaction.Transaction;

import org.hibernate.Criteria;
import org.hibernate.SQLQuery;
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
import com.development.model.About_us;
import com.development.model.Archived_user;
import com.development.model.Notification;

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
		public List<SearchEngine> adminRejected_users(){
			Session session = sessionFactory.getCurrentSession();
			Criteria cr = session.createCriteria(SearchEngine.class).add(Restrictions.eq("is_archived", 1));

			List<SearchEngine> crr = cr.list();

			/*
			for(int i=0;i<crr.size();i++){
				//SearchEngine ss = new SearchEngine();
				System.out.println("===========================" + crr.get(0));
			}
			for(SearchEngine ss : crr){
				System.out.println("====---====" + ss.getEmail());
			}
			*/
			return crr;
		}
    @Transactional
	public List<SearchEngine> searchAdmin(SearchEngine searchtext) {
		// TODO Auto-generated method stub
    	  Session session = sessionFactory.getCurrentSession();
    	   Criteria cr = session.createCriteria(SearchEngine.class).add(Restrictions.like("email", searchtext.getEmail(),MatchMode.ANYWHERE))
    			   .add(Restrictions.eq("is_archived", 0));

    	   List<SearchEngine> searchresult = cr.list();
    	  // List<SearchEngine> searchresult1 = cr.uniqueResult();
    	   //System.out.println(searchresult1);

    	  // SearchEngine sss = (SearchEngine)cr.uniqueResult();
    	   if(searchresult.size() == 0){
    		   return null;
    	   }
    	   else{
    		   //Iterator<St = new type();>

    		   return searchresult;
    	   }



//    	   	while(searchresult.ne)
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

	@Override
	@Transactional
	public SearchEngine getAdminDetails(int id){
		System.out.println("9999999999999***9999999999" + id);
		Session session = sessionFactory.getCurrentSession();

		SearchEngine ss = (SearchEngine) session.get(SearchEngine.class, id);
		System.out.println("666666666666666666666*****************6666666666666" + ss.getPassword());

		return ss;

	}



	public SearchEngine getDetails(int id){
		Session session = sessionFactory.getCurrentSession();
		SearchEngine ss = (SearchEngine) session.get(SearchEngine.class, id);
		return ss;
	}

	@Override
    @Transactional
public Notification getnotificationresult(String email) {

	Session session = sessionFactory.getCurrentSession();		

	//System.out.println("**************888***********" +Notificatonresult.getEmail());
	Notification Notificatonresult = (Notification) session.get(Notification.class, email);	
	
	return Notificatonresult;
}

	@Override
	@Transactional
	public Archived_user archive_user(Archived_user archive_user) {
		// TODO Auto-generated method stub

		Session session = this.sessionFactory.getCurrentSession();


		int user_id  = archive_user.getUser_id();
        //	SearchEngine aa  =
		//  SQLQuery query = session.createSQLQuery("select e.user_id, e.email from Registration e where e.user_id=user_id");
		//  List<SearchEngine> rows = query.list();

		 // Criteria cr = session.createCriteria(SearchEngine.class).add(Restrictions.like("user_id",user_id));
		  //SearchEngine userresult = (SearchEngine) cr.uniqueResult();
		  //System.out.println("===============le======" + userresult);


		SearchEngine ss = (SearchEngine) session.get(SearchEngine.class, user_id);
		Archived_user aa = new Archived_user();
		aa.setUser_id(ss.getId());
		aa.setEmail(ss.getEmail());
		session.persist(aa);

		ss.setIs_archived(1);
		session.update(ss);

		  /*
		   *
		SearchEngine ss = (SearchEngine) session.get(SearchEngine.class, id);
		System.out.println("666666666666666666666*****************6666666666666" + ss.getPassword());

		   */
	    //  System.out.println("=================email kanappa =asdsadsadsa==" + rows);
		//  for(SearchEngine ss : rows) {
        //   System.out.println("=================email kanappa ===" + ss.getEmail());
       // }

	//System.out.println("========================good bye ===" + rows);
		//Query query = (Query) session.createSQLQuery("select e.user_id, e.email from Registration e where e.user_id=user_id")
		//		.setParameter("user_id", archive_user.getUser_id());
		//session.persist(archive_user);
	//	List result = ((Criteria) query).list();

	//	System.out.println("=================== " + result);


		return null;

	}

	@Override
	@Transactional
	public Archived_user enable_archiver(Archived_user archive_user) {
		// TODO Auto-generated method stub

		Session session = this.sessionFactory.getCurrentSession();
		int user_id  = archive_user.getUser_id();
		Criteria cr = session.createCriteria(Archived_user.class).add(Restrictions.eqOrIsNull("user_id", archive_user.getUser_id()));
		//SearchEngine profileresult = (SearchEngine) cr.uniqueResult();
		Archived_user aaa = (Archived_user) cr.uniqueResult();
		SearchEngine ss = (SearchEngine) session.get(SearchEngine.class, user_id);
		//Archived_user aa = (Archived_user) session.get(Archived_user.class, user_id);

		session.delete(aaa);
		//session.delete(aa);
		ss.setIs_archived(0);
		session.update(ss);
		return null;

	}


	public SearchEngine archiveupdate (int id){
		Session session = sessionFactory.getCurrentSession();
		SearchEngine ss = (SearchEngine) session.get(SearchEngine.class, id);
		int my_id_value = 1;
		ss.setIs_archived(my_id_value);
		return null;
	}

	@Override
	@Transactional
	public SearchEngine user_details(String email) {
		// TODO Auto-generated method stub
		 Session session = sessionFactory.getCurrentSession();
		   Criteria cr = session.createCriteria(SearchEngine.class).add(Restrictions.like("email", email,MatchMode.ANYWHERE));
		   SearchEngine profileresult = (SearchEngine) cr.uniqueResult();
	   	   return profileresult;
	}

	@Override
	@Transactional
	public About_us Save_valueable_comments(About_us about_us) {
		// TODO Auto-generated method stub
		 Session session = sessionFactory.getCurrentSession();
		 About_us aa = new  About_us();
		 System.out.println("==================******************====" + about_us.getEmail());
		 aa.setComments(about_us.getComments());
		 aa.setEmail(about_us.getEmail());
		 aa.setRating_number(about_us.getRating_number());
	     session.save(aa);
		return null;
	}

	@Override
	@Transactional
	public List<About_us> get_user_convesation_comments(String email) {

		Session session = sessionFactory.getCurrentSession();
		//Criteria cr = session.createCriteria(SearchEngine.class).add(Restrictions.like("email", email,MatchMode.ANYWHERE));

		Criteria cr = session.createCriteria(About_us.class);
		// due to some issue .com has issue in my code so leave as it is replace FileNotFoundException
		email = email.replace(".com","");
		cr.add(Restrictions.eq("email", email) );
		List<About_us> crr = cr.list();


		// TODO Auto-generated method stub
		return crr;
	}
/*
	@Override
	@Transactional
	public List<Optionentry>  get_option_set_values(int id) {
		// TODO Auto-generated method stub
		  Session session = sessionFactory.getCurrentSession();
		  System.out.println();
		  
	 //Criteria cr = session.createCriteria(Optionentry.class).add(Restrictions.eq("option_set_id", id));
	 //Criteria crr =  session.createCriteria(Optionset.class);
	// List<Optionset> sss =  crr.list();
	 //System.out.println(sss.size());
	 
	  //Optionentry crr = (Optionentry) cr.list();
	//List<Optionentry> crre = cr.list();
	//System.out.println("%%%%%%%%%%" + crre.size());
	 //List<SearchEngine> searchresult = cr.list();
		  
	//System.out.println("***************99989999*****" + crr.size());
		
		return null;
	}
	*/
}
