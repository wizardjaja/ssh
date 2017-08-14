package com.wizard.action;


import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.wizard.bean.User;
import com.wizard.page.Page;
import com.wizard.service.UserService;

public class UserAction extends ActionSupport{
	private UserService userService;
	private Page page;
	private int id;
	private User user;
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
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	@Override
	public String execute() throws Exception {
		page = userService.finduserList(currentPage, pageSize);
		return SUCCESS;
	}
	
	public String register() throws Exception {
		User user = new User();
		BeanUtils.populate(user, ServletActionContext.getRequest().getParameterMap());
		Date d = new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd  kk:mm:ss ");
		sdf.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"));
		user.setRegisterTime(sdf.format(d));
		
		userService.saveUser(user);
		return "ok";
	}
	
	public String findUserById(){
		user = userService.findUserById(id);
		return "toUpdate";
	}
	
	public String update() throws IllegalAccessException, InvocationTargetException{
		User user = new User();
		BeanUtils.populate(user, ServletActionContext.getRequest().getParameterMap());
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
