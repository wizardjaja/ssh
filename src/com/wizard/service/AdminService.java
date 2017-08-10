package com.wizard.service;


import com.wizard.bean.Admin;
import com.wizard.page.Page;

public interface AdminService {
	public void saveAdminUser(Admin admin);
	public void updateAdminUser(Admin admin);
	public void deleteAdminUser(Admin admin);
	public Page findAdminsList(int currentPage, int pageSize);
	public Admin findAdminById(int id);
}
