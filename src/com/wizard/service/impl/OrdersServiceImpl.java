package com.wizard.service.impl;

import com.wizard.bean.Orders;
import com.wizard.dao.OrdersDao;
import com.wizard.page.Page;
import com.wizard.service.OrdersService;

public class OrdersServiceImpl implements OrdersService {
	private OrdersDao ordersDao;
	

	public void setOrdersDao(OrdersDao ordersDao) {
		this.ordersDao = ordersDao;
	}

	@Override
	public void saveOrders(Orders orders) {
		ordersDao.saveOrdersUser(orders);
	}

	@Override
	public void deleteOrders(Orders orders) {
		ordersDao.deleteOrdersUser(orders);
	}

	@Override
	public void updateOrders(Orders orders) {
		ordersDao.updateOrdersUser(orders);
	}

	@Override
	public Page findOrdersList(int currentPage, int pageSize) {
		Page page = ordersDao.findOrdersList(currentPage, pageSize);
		return page;
	}

	@Override
	public Orders findOrdersById(int id) {
		Orders orders = ordersDao.findOrdersById(id);
		return orders;
	}
	

}
