package com.wizard.action;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

import com.opensymphony.xwork2.ActionSupport;
import com.wizard.bean.User;
import com.wizard.page.Page;
import com.wizard.service.UserService;

public class UserAction extends ActionSupport{
	private int id;
	private User user;
	private Page page;
	private String username;
	private String password;
	private UserService userService;
	private String tel;
	private String email;
	private int currentPage = 1;
	private int pageSize = 5;
	private int[] ids;
	
	
	public int[] getIds() {
		return ids;
	}
	public void setIds(int[] ids) {
		this.ids = ids;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	
	public String register() throws Exception {
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		user.setTel(tel);
		user.setEmail(email);
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd kk:mm:ss");
		sdf.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"));
		user.setRegisterTime(sdf.format(date));
		userService.saveUser(user);
		return "ok";
	}
	
	public String findUserById(){
		user = userService.findUserById(id);
		return "toUpdate";
	}
	
	public String update(){
		User user = new User();
		user.setId(id);
		user.setUsername(username);
		user.setPassword(password);
		user.setTel(tel);
		user.setEmail(email);
		userService.updateUser(user);
		return "ok";
	}
	public String delete(){
		user = userService.findUserById(id);
		userService.deleteUser(user);
		return "ok";
	}
	public String deleteUsers(){
		for (int id : ids) {
			user = userService.findUserById(id);
			userService.deleteUser(user);
		}
		return "ok";
	}
}
