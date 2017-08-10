package com.wizard.action;


import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.wizard.bean.User;
import com.wizard.service.UserService;

public class UserAction extends ActionSupport{
	private List<User> data;
	private String username;
	private String password;
	private UserService userService;
	private String tel;
	private String email;
	
	public List<User> getData() {
		return data;
	}
	public void setData(List<User> data) {
		this.data = data;
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
		data = userService.finduserList();
		System.out.println(data);
		return SUCCESS;
	}
	
}
