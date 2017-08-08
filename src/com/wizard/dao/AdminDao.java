package com.wizard.dao;

import java.util.List;

import com.wizard.bean.Admin;

public interface AdminDao {
	public void saveAdminUser(Admin admin);
	public void updateAdminUser(Admin admin);
	public void deleteAdminUser(int id);
	public List<Admin> findAdminsList();
}
