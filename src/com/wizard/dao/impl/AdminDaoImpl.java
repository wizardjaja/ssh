package com.wizard.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.wizard.bean.Admin;
import com.wizard.dao.AdminDao;

public class AdminDaoImpl implements AdminDao {
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public Session getSession(){
		Session session = sessionFactory.getCurrentSession();
		return session;
	}
	@Override
	public void saveAdminUser(Admin admin) {
		getSession().save(admin);
	}

	@Override
	public void updateAdminUser(Admin admin) {
		getSession().update(admin);

	}

	@Override
	public void deleteAdminUser(int id) {
		getSession().delete(id);
	}

	@Override
	public List<Admin> findAdminsList() {
		Query query = getSession().createQuery("from Admin");
		List<Admin> list = query.list();
		return list;
	}

}
