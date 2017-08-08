package com.wizard.dao.impl;

import org.hibernate.SessionFactory;

import com.wizard.bean.User;
import com.wizard.dao.UserDao;

public class UserDaoImpl implements UserDao {
private SessionFactory sessionFactory;
	
	

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}


	@Override
	public void saveUser(User user) {
		sessionFactory.getCurrentSession().save(user);
	}
}
