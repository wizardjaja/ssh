package com.wizard.test;

import static org.junit.Assert.*;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;
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
	@org.junit.Test
	public void fun2() throws Exception {
		Configuration cfg = new Configuration();
		//读配置文件
		cfg.configure();
		//通过Configuration对象生成SchemaExport对象
		SchemaExport se = new SchemaExport(cfg);
		se.create(false, true); 
	}

	
}
