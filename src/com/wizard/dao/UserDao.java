package com.wizard.dao;

import java.util.List;

import com.wizard.bean.User;
import com.wizard.page.Page;

public interface UserDao {
	public void saveUser(User user);
	public void deleteUser(User user);
	public void updateUser(User user);
	public Page finduserList(int currentPage, int pageSize);
	public User findUserById(Integer id);
}
