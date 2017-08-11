package com.wizard.action;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import com.opensymphony.xwork2.ActionSupport;
import com.wizard.bean.Orders;
import com.wizard.bean.User;
import com.wizard.page.Page;
import com.wizard.service.OrdersService;

public class OrdersAction extends ActionSupport{
	private OrdersService ordersService;
	private Page page;
	private int id;
	private String ordersNo;
	private User user;
	private String status;
	private int currentPage=1;
	private int pageSize=5;
	
	public void setOrdersService(OrdersService ordersService) {
		this.ordersService = ordersService;
	}


	public Page getPage() {
		return page;
	}


	public void setPage(Page page) {
		this.page = page;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getOrdersNo() {
		return ordersNo;
	}


	public void setOrdersNo(String ordersNo) {
		this.ordersNo = ordersNo;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public int getCurrentPage() {
		return currentPage;
	}


	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}


	public int getPageSize() {
		return pageSize;
	}


	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}


	@Override
	public String execute() throws Exception {
		page = ordersService.findOrdersList(currentPage, pageSize);
		return "success";
	}
	
	public String createOrders(){
		Orders orders = new Orders();
		orders.setOrdersNo(ordersNo);
		orders.setUser(user);
		orders.setStatus(status);
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat();
		sdf.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"));
		orders.setReceiveTime(sdf.format(date));
		ordersService.saveOrders(orders);
		return "ok";
	}
	
}
