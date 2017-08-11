package com.wizard.dao;


import java.util.List;

import com.wizard.bean.Admin;
import com.wizard.bean.Orders;
import com.wizard.page.Page;

public interface OrdersDao {
	public void saveOrdersUser(Orders orders);
	public void updateOrdersUser(Orders orders);
	public void deleteOrdersUser(Orders orders);
	public Page findOrdersList(int currentPage, int pageSize);
	public Orders findOrdersById(int id);
}