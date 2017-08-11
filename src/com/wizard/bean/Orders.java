package com.wizard.bean;

import java.util.List;

public class Orders {
	private int id;
	private String ordersNo;
	private String receiveTime;
	private User user;
	private String status;
	//private List<OrdersItem> items;
	
	public int getId() {
		return id;
	}
	public String getReceiveTime() {
		return receiveTime;
	}
	public void setReceiveTime(String receiveTime) {
		this.receiveTime = receiveTime;
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
	
}
