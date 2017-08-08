package com.wizard.service.impl;

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

}
