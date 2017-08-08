package com.wizard.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.wizard.bean.Admin;
import com.wizard.service.AdminService;


public class AdminAction extends ActionSupport {
	private AdminService adminService;
	private List<Admin> data;
	
	public List<Admin> getData() {
		return data;
	}

	public void setData(List<Admin> data) {
		this.data = data;
	}

	public void setAdminService(AdminService adminService) {
		this.adminService = adminService;
	}
	
	
	@Override
	public String execute() throws Exception {
		data = adminService.findAdminsList();
		System.out.println(data);
		return SUCCESS;
	}

}
