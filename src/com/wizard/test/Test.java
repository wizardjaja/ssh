package com.wizard.test;

import static org.junit.Assert.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wizard.bean.User;
import com.wizard.service.UserService;

public class Test {
	@org.junit.Test
	public void fun1() throws Exception {
		//如果运行在web服务中，就不需要前两行代码
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService us = (UserService) ac.getBean("userService");
		
		//生成一个User对象
		User user = new User();
		user.setUsername("aaa");
		user.setPassword("123");
		us.saveUser(user);
		
	}

	
}
