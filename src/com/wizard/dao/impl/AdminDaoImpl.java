package com.wizard.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.wizard.bean.Admin;
import com.wizard.dao.AdminDao;
import com.wizard.page.Page;

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
	public Page findAdminsList(int currentPage, int pageSize) {
		Query query = getSession().createQuery("from Admin");
		List<Admin> list1 = query.list();
		query.setFirstResult((currentPage-1)*pageSize);
		query.setMaxResults(pageSize);
		List<Admin> list2 = query.list();
		Page page = new Page(list1.size());
		page.setCurrentPage(currentPage);
		page.setPageSize(pageSize);
		page.setData(list2);
		page.setTotalPage();
		//page.setAllRow();
		
		return page;
	}

}
