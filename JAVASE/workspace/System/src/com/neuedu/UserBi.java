package com.neuedu;

import java.util.ArrayList;

public class UserBi implements UserBiz{

	/*public User[] user;*/
	public ArrayList<User> list = new ArrayList<User>();
	public void init() {
		User user1 = new User("admin","admin","Administrator","admin@123.com");
		User user2 = new User("tom","cat","tomcat","tomcat@cat.com");
		list.add(user1);
		list.add(user2);
	}
	@Override
	public void register(String username, String password, String password2, String name, String email)
			throws RegisterException {
		// TODO Auto-generated method stub
		
		init();
		for(User user:list) {
			if(user.getUsername().equals(username)) {
				System.out.println("用户名已存在");
				throw new RegisterException("注册失败");
			}
		}		
		if(!password.equals(password2)) {
			System.out.println("两次密码不一致");
			throw new RegisterException("注册失败");
		}
		
		User user = new User(username,password,password2,email);
		list.add(user);
		
		System.out.println("注册");
	}

	@Override
	public void login(String username, String password) throws LoginException {
		// TODO Auto-generated method stub
		init();
		boolean a=true;
		for(User user:list) {
			if((user.getUsername().equals(username))){
				/*System.out.println("ok");*/
				for(int i=0;i<list.size();i++) {
					if(list.get(i).getUsername().equals(username)) {
						if(!(list.get(i).getPassword().equals(password))) {
							throw new RegisterException("密码错误");
						}
					}
				}
				a = false;
				break;
			}
		}
		if(a) {
			throw new RegisterException("用户名不存在");
		}
		
		System.out.println("登陆成功");
		
	}

}
