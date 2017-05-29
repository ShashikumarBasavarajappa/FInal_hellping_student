package com.development.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
		System.out.println("9999999999999***9999999999" + id);
		Session session = sessionFactory.getCurrentSession();

		SearchEngine ss = (SearchEngine) session.get(SearchEngine.class, id);
		System.out.println("666666666666666666666*****************6666666666666" + ss.getPassword());

		return ss;

	}

	@Override
@Transactional
public Notification getnotificationresult(int id) {
	// TODO Auto-generated method stub
  System.out.println("=======================99999===" + id);
	Session session = sessionFactory.getCurrentSession();
	Notification Notificatonresult = (Notification) session.get(Notification.class, id);

	return Notificatonresult;
}

	@Override
	@Transactional
	public Archived_user archive_user(Archived_user archive_user) {
		// TODO Auto-generated method stub

		Session session = this.sessionFactory.getCurrentSession();

		System.out.println("=======ammaa================" + archive_user.getUser_id());;
		System.out.println("-----------------------sssssssssssssss-----------------eeeeeeeee ");
		//archive_user.setEmail("shashi");
		int user_id  = archive_user.getUser_id();
        //	SearchEngine aa  =
		//  SQLQuery query = session.createSQLQuery("select e.user_id, e.email from Registration e where e.user_id=user_id");
		//  List<SearchEngine> rows = query.list();

		 // Criteria cr = session.createCriteria(SearchEngine.class).add(Restrictions.like("user_id",user_id));
		  //SearchEngine userresult = (SearchEngine) cr.uniqueResult();
		  //System.out.println("===============le======" + userresult);


		SearchEngine ss = (SearchEngine) session.get(SearchEngine.class, user_id);

		//System.out.println("666666666666666666666*****************6666666666666" + ss.getPassword());


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

	public SearchEngine archiveupdate (int id){
		Session session = sessionFactory.getCurrentSession();
		System.out.println("==============insnide the function====checking the changes==="+ id);
		//int id = 1;
//		SearchEngine ss = session.update(is_archived, id);
		SearchEngine ss = (SearchEngine) session.get(SearchEngine.class, id);
		//System.out.println("==================checking the changes===" + ss.getFirst_name());
		int my_id_value = 1;
		ss.setIs_archived(my_id_value);
		return null;
	}
}
