package com.wizard.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.wizard.bean.Admin;
import com.wizard.page.Page;
import com.wizard.service.AdminService;


public class AdminAction extends ActionSupport {
	private AdminService adminService;
	private Page page;
	private int currentPage = 1;
	private int pageSize = 5;

	public Page getPage() {
		return page;
	}


	public void setPage(Page page) {
		this.page = page;
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


	public AdminService getAdminService() {
		return adminService;
	}


	public void setAdminService(AdminService adminService) {
		this.adminService = adminService;
	}
	
	
	@Override
	public String execute() throws Exception {
		page = adminService.findAdminsList(currentPage, pageSize);
		System.out.println(page.getData());
		return SUCCESS;
	}

}
