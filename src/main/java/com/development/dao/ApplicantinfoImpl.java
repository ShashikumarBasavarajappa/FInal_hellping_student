package com.development.dao;

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
import javassist.bytecode.Descriptor.Iterator;

import java.util.List;

import com.development.model.SearchEngine;

public class ApplicantinfoImpl implements ApplicantinfoDAO {

	private SessionFactory sessionFactory;

	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	public ApplicantinfoImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	@Transactional
	public List<SearchEngine> applicant_information(SearchEngine welcome_info) {
		String email = welcome_info.getEmail();
		email = "shivahosur@gmail.com";
		Session session = sessionFactory.getCurrentSession();
		Criteria cr = session.createCriteria(SearchEngine.class)
				.add(Restrictions.like("email", email, MatchMode.ANYWHERE));
		SearchEngine profileresult = (SearchEngine) cr.uniqueResult();
		return (List<SearchEngine>) profileresult;
	}

	@Override
	@Transactional
	public SearchEngine profiledetails(String email) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Criteria cr = session.createCriteria(SearchEngine.class)
				.add(Restrictions.like("email", email, MatchMode.ANYWHERE));
		SearchEngine profileresult = (SearchEngine) cr.uniqueResult();
		System.out.println("----------------------------" + profileresult.getFirst_name());

		return profileresult;
	}

}
