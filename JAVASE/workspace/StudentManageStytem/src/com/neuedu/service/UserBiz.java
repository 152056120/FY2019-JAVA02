package com.neuedu.service;

import com.neuedu.exception.LoginException;

public interface UserBiz {
	void login(String username,String password) throws LoginException;
	boolean isNameExit(String username) throws LoginException;
}
