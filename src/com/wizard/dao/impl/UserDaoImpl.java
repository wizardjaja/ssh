package com.wizard.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.wizard.bean.User;
import com.wizard.dao.UserDao;
import com.wizard.page.Page;

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
	public void deleteUser(User user) {
		getSession().delete(user);
		
	}


	@Override
	public void updateUser(User user) {
		getSession().update(user);
	}


	@Override
	public Page finduserList(int currentPage, int pageSize) {
		Query query = getSession().createQuery("from User");
		List<User> list1 = query.list();
		query.setFirstResult((currentPage-1)*pageSize);
		query.setMaxResults(pageSize);
		List<User> list2 = query.list();
		Page page = new Page(list1.size());
		page.setData(list2);
		page.setCurrentPage(currentPage);
		page.setPageSize(pageSize);
		page.setTotalPage();
		return page;
	}


	@Override
	public User findUserById(Integer id) {
		Query query = getSession().createQuery("from User where id="+id);
		User user = (User) query.list().get(0);
		return user;
	}
}
