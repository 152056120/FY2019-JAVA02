package com.neuedu.impl;

import java.util.Scanner;

import com.neuedu.exception.LoginException;
import com.neuedu.exception.RegisterException;
import com.neuedu.service.UserBiz;
import com.neuedu.view.UserView;

public class AdminViewImpl implements UserView{

	UserBiz userBiz = new AdminImpl();
	
	@Override
	public void register() throws RegisterException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void login() throws LoginException {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("请输入用户名");
		String username = in.next();
		boolean usernameExit = userBiz.isNameExit(username);
		if(usernameExit) {
			System.out.println("请输入密码");
	        String password = in.next();
	        userBiz.login(username, password);}
	}
	
}
