package com.wizard.service.impl;

import java.util.List;

import org.hibernate.SessionFactory;

import com.wizard.bean.User;
import com.wizard.dao.UserDao;
import com.wizard.service.UserService;

public class UserServiceImpl implements UserService {
	private UserDao userDao;
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public void saveUser(User user) {
		if (user == null) {
			System.out.println("user is null");
		}
		else{
			userDao.saveUser(user);

		}
	}

	@Override
	public void deleteUser(Integer id) {
		userDao.deleteUser(id);
		
	}

	@Override
	public void updateUser(User user) {
		userDao.updateUser(user);
	}

	@Override
	public List<User> finduserList() {
		List<User> list = userDao.finduserList();
		return list;
	}

}
