package com.development.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import com.development.model.User;

public class UserDAOImpl implements UserDAO {

	private SessionFactory sessionFactory;
	
    public UserDAOImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
 
    @Override
    @Transactional
    public List<User> list() {
    	System.out.println("...........................................................");	
        @SuppressWarnings("unchecked")
        //Session session = sessionFactory.openSession();
        //List<User> listUser = session.createQuery("FROM users").list();
        List<User> listUser = (List<User>) sessionFactory.getCurrentSession()
                .createCriteria(User.class)
                .setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
 
        return listUser;
}
}
