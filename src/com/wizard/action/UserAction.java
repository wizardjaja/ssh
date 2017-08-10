package com.wizard.action;


import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.wizard.bean.User;
import com.wizard.page.Page;
import com.wizard.service.UserService;

public class UserAction extends ActionSupport{
	private Page page;
	private String username;
	private String password;
	private UserService userService;
	private String tel;
	private String email;
	private int currentPage = 1;
	private int pageSize = 5;
	
	
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
	public Page getPage() {
		return page;
	}
	public void setPage(Page page) {
		this.page = page;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String execute() throws Exception {
		page = userService.finduserList(currentPage, pageSize);
		return SUCCESS;
	}
	
}
