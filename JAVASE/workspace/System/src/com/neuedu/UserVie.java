package com.neuedu;

import java.util.Scanner;

public class UserVie implements UserView{

	UserBi userBi = new UserBi();
	@Override
	public void login() {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		System.out.println("请输入用户名：");
		String username = in.nextLine();
	    System.out.println("请输入密码");
	    String password = in.nextLine();
	    userBi.login(username, password);
	}

	@Override
	public void register() {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		System.out.println("请输入用户名：");
		String username = in.nextLine();
	    System.out.println("请输入密码");
	    String password = in.nextLine();
	    System.out.println("请再次输入密码");
	    String password2 = in.nextLine();
	    System.out.println("请输入姓名");
	    String name = in.nextLine();
	    System.out.println("请输入电子邮箱");
	    String email = in.nextLine();
	    userBi.register(username, password, password2, name, email);
	}

}
