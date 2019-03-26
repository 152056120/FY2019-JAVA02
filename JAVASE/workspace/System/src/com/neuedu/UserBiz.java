package com.neuedu;

public interface UserBiz {
	//用户登录
	void register(String username, String password, String password2,String name, String email) throws RegisterException;
	//用户注册
	void login(String username, String password) throws LoginException;
}
