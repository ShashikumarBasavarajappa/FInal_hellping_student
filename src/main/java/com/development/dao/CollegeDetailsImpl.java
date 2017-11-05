package com.development.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.springframework.transaction.annotation.Transactional;

import com.development.dao.CollegeDetailsDAO;
import com.development.model.College_braches;
import com.development.model.Lecture;
import com.development.model.SearchEngine;

public class CollegeDetailsImpl implements CollegeDetailsDAO{

	private SessionFactory sessionFactory;

	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	public CollegeDetailsImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	@Transactional
	public List<College_braches> College_braches_detail(int college_id) {
		
		
		System.out.println("---------------------------- i'm inside the -----------------");
		

		Session session = sessionFactory.getCurrentSession();
		Criteria cr = session.createCriteria(College_braches.class).add(Restrictions.eqOrIsNull("college_id", college_id));
				//.add(Restrictions.like(college_id, college_id, MatchMode.ANYWHERE));
		System.out.println("-----------------------------------" + cr.toString());
		
		List<College_braches>  profileresult = (List<College_braches>) cr.list();
		System.out.println("-----------------------------------------" + profileresult);
		return profileresult;
	}

	@Override
	@Transactional
	public List<College_braches> College_lecture_details(int college_id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		System.out.println("--------------------please entering here what to do next------");
		Criteria cr = session.createCriteria(Lecture.class).add(Restrictions.eqOrIsNull("college_id", college_id));
				//.add(Restrictions.like(college_id, college_id, MatchMode.ANYWHERE));
		//System.out.println("-----------------------------------" + cr.toString());
		
		List<College_braches>  lecture_deatils = (List<College_braches>) cr.list();
		System.out.println("-----------------------------------------" + lecture_deatils);
		return lecture_deatils;
	}

	

}
