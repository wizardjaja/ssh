package com.wizard.service;

import com.wizard.bean.Orders;
import com.wizard.page.Page;

public interface OrdersService {
	public void saveOrders(Orders orders);
	public void deleteOrders(Orders orders);
	public void updateOrders(Orders orders);
	public Page findOrdersList(int currentPage, int pageSize);
	public Orders findOrdersById(int id);
}
