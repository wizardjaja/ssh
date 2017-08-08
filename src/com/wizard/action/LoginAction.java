package com.wizard.action;


import com.opensymphony.xwork2.ActionSupport;
import com.wizard.bean.User;
import com.wizard.service.UserService;

public class LoginAction extends ActionSupport{
	private String username;
	private String password;
	private UserService userService;
	 
	
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
	public String toString() {
		return "LoginAction [username=" + username + ", password=" + password
				+ "]";
	}
	@Override
	public String execute() throws Exception {
		System.out.println(this);
		System.out.println(username);
		System.out.println(password);
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		System.out.println(userService);
		userService.saveUser(user);
		return SUCCESS;
	}
	
}
