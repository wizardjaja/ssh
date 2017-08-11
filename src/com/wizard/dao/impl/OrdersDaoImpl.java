package com.wizard.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.wizard.bean.Orders;
import com.wizard.dao.OrdersDao;
import com.wizard.page.Page;

public class OrdersDaoImpl implements OrdersDao {
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	public Session getSession(){
		Session session = sessionFactory.getCurrentSession();
		return session;
	}

	@Override
	public void saveOrdersUser(Orders orders) {
		getSession().save(orders);
	}

	@Override
	public void updateOrdersUser(Orders orders) {
		getSession().update(orders);
	}

	@Override
	public void deleteOrdersUser(Orders orders) {
		getSession().delete(orders);

	}

	@Override
	public Page findOrdersList(int currentPage, int pageSize) {
		Query query = getSession().createQuery("from Orders");
		List list1 = query.list();
		query.setFirstResult((currentPage-1)*pageSize);
		query.setMaxResults(pageSize);
		List list2 = query.list();
		Page page = new Page(list1.size());
		page.setCurrentPage(currentPage);
		page.setPageSize(pageSize);
		page.setData(list2);
		page.setTotalPage();
		return page;
	}

	@Override
	public Orders findOrdersById(int id) {
		Query query = getSession().createQuery("from Orders where id="+id);
		Orders orders = (Orders) query.list().get(0);
		return orders;
	}

}
