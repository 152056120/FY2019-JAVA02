package com.neuedu.impl;

import java.util.ArrayList;

import com.neuedu.exception.LoginException;
import com.neuedu.model.Admin;
import com.neuedu.service.UserBiz;

public class AdminImpl implements UserBiz {

	private Admin[] admins = new Admin[10];
	public AdminImpl() {
		// TODO Auto-generated method stub
		Admin admin1 = new Admin("admin", "admin");		
		admins[0] = admin1;
	}


	@Override
	public void login(String username, String password) throws LoginException {
		// TODO Auto-generated method stub
		boolean usernameExit = false;
		for(int i=0;i<admins.length;i++) {
			Admin admin = admins[i];
			if(admin == null) {
				continue;
			}
			
			String _username = admin.getUsername();
			String _password = admin.getPassword();
			if(_username.equals(username)) {
				usernameExit = true;
				if(_password.equals(password)) {
					System.out.println("登录成功:"+username);
				}else {
					throw new LoginException("密码和用户名不匹配");
				}
			}
		}
		
		if(!usernameExit) {
			throw new LoginException("用户名不存在");
		}
		
	}


	@Override
	public boolean isNameExit(String username) throws LoginException {
		// TODO Auto-generated method stub
		for(int i=0;i<admins.length;i++) {
			Admin admin = admins[i];
			if(admin == null) {
				continue;
			}		
			if(username.equals(admin.getUsername())) {
				return true;
			}
		}
		throw new LoginException("用户名不存在");
	}



}
