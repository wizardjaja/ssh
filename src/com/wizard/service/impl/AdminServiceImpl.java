package com.wizard.service.impl;

import java.util.List;
import com.wizard.bean.Admin;
import com.wizard.dao.AdminDao;
import com.wizard.service.AdminService;

public class AdminServiceImpl implements AdminService {
	private AdminDao adminDao;
	
	public void setAdminDao(AdminDao adminDao) {
		this.adminDao = adminDao;
	}

	@Override
	public void saveAdminUser(Admin admin) {
		adminDao.saveAdminUser(admin);
	}

	@Override
	public void updateAdminUser(Admin admin) {
		adminDao.updateAdminUser(admin);
	}

	@Override
	public void deleteAdminUser(int id) {
		adminDao.deleteAdminUser(id);
	}

	@Override
	public List<Admin> findAdminsList() {
		List<Admin> adminsList = adminDao.findAdminsList();
		return adminsList;
	}

}
