package com.neuedu;

import java.util.Scanner;

public class UserVie implements UserView{

	UserBi userBi = new UserBi();
	@Override
	public void login() {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		System.out.println("�������û�����");
		String username = in.nextLine();
	    System.out.println("����������");
	    String password = in.nextLine();
	    userBi.login(username, password);
	}

	@Override
	public void register() {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		System.out.println("�������û�����");
		String username = in.nextLine();
	    System.out.println("����������");
	    String password = in.nextLine();
	    System.out.println("���ٴ���������");
	    String password2 = in.nextLine();
	    System.out.println("����������");
	    String name = in.nextLine();
	    System.out.println("�������������");
	    String email = in.nextLine();
	    userBi.register(username, password, password2, name, email);
	}

}
