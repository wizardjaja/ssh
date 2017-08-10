package com.wizard.dao;

import java.util.List;

import com.wizard.bean.User;

public interface UserDao {
	public void saveUser(User user);
	public void deleteUser(Integer id);
	public void updateUser(User user);
	public List<User> finduserList();
	
}
