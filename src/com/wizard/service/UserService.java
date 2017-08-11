package com.wizard.service;

import java.util.List;

import com.wizard.bean.User;
import com.wizard.page.Page;

public interface UserService {
	public void saveUser(User user);
	public void deleteUser(User user);
	public void updateUser(User user);
	public Page finduserList(int currentPage, int pageSize);
	public User findUserById(Integer id);
}
