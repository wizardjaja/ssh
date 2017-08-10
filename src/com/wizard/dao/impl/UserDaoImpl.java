package com.wizard.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.wizard.bean.User;
import com.wizard.dao.UserDao;

public class UserDaoImpl implements UserDao {
private SessionFactory sessionFactory;
	public Session getSession(){
		return sessionFactory.getCurrentSession();
	}
	

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}


	@Override
	public void saveUser(User user) {
		getSession().save(user);
	}


	@Override
	public void deleteUser(Integer id) {
		getSession().delete(id);
		
	}


	@Override
	public void updateUser(User user) {
		getSession().update(user);
	}


	@Override
	public List<User> finduserList() {
		Query query = getSession().createQuery("from User");
		List<User> list = query.list();
		return list;
	}
}
