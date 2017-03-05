package com.development.dao;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.transaction.annotation.Transactional;

import com.development.model.Registration;

public class RegistrationImpl implements RegisterDAO {

	
	private SessionFactory sessionFactory;
	
    public RegistrationImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
	

    @Override
    @Transactional
	public void save(Registration registration) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(registration);
	}


	@Override
	@Transactional
	public Registration logincheck(String email) {
		// TODO Auto-generated method stub
		
		Session session = this.sessionFactory.getCurrentSession();
		//session.beginTransaction();
		//int id=1;
//		int id1 = session.createQuery("select id from Registration where email = email");
		//Registration r =  (Registration) session.load(Registration.class, email );
		//System.out.println("===============dddddddddddddddddddddddddddddd 77777777=============" + email);
		Criteria criteria = session.createCriteria(Registration.class).add(Restrictions.eq("email", email));
		Registration r = (Registration) criteria.uniqueResult();
		//Registration r  = (Registration) session.get(Registration.class, email);
		//Registration r = (Registration) session.get(Registration.class, new String(email));
		if(r != null){
			//System.out.println("========rtttttttttttttttttttttttttt====================" + r.getEmail());
			return r;
		}
	  else{
		return null;
		}
	}

}
