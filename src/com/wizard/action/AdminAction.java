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
	private String username;
	private String password;
	private int id;
	private int[] ids;
	private Admin admin;
	/*private int redpage;
	public int getRedpage() {
		return redpage;
	}

	public void setRedpage(int redpage) {
		this.redpage = redpage;
	}*/
	
	
	public String getUsername() {
		return username;
	}

	public int[] getIds() {
		return ids;
	}

	public void setIds(int[] ids) {
		this.ids = ids;
	}

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
	
	public String register() {
		Admin admin = new Admin();
		admin.setUsername(username);
		admin.setPassword(password);
		adminService.saveAdminUser(admin);
		return "ok";
	}
	
	public String findAdminById() {
		admin = adminService.findAdminById(id);
		return "successUpdate";
	}
	
	public String update() {
		Admin admin = new Admin();
		admin.setId(id);
		admin.setUsername(username);
		admin.setPassword(password);
		adminService.updateAdminUser(admin);
		return "ok";
	}
	public String delete() {
		admin = adminService.findAdminById(id);
		adminService.deleteAdminUser(admin);
		System.out.println("delete...");
		return "ok";
	}
	
	public String deleteAdmins(){
		System.out.println(ids);
		for (int id : ids) {
			System.out.println(id);
			admin = adminService.findAdminById(id);
			adminService.deleteAdminUser(admin);
		}
		return "ok";
	}
}