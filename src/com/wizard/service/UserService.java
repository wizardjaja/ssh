package com.wizard.service;

import java.util.List;

import com.wizard.bean.User;

public interface UserService {
	public void saveUser(User user);
	public void deleteUser(Integer id);
	public void updateUser(User user);
	public List<User> finduserList();
}
