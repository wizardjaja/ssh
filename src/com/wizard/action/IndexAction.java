package com.wizard.action;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

import com.opensymphony.xwork2.ActionSupport;
import com.wizard.bean.User;
import com.wizard.page.Page;
import com.wizard.service.UserService;

public class IndexAction extends ActionSupport{
	
	@Override
	public String execute() throws Exception {
		
		return SUCCESS;
	}
}
