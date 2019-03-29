package com.neuedu;

import java.util.Scanner;

import com.neuedu.exception.LoginException;
import com.neuedu.impl.AdminViewImpl;
import com.neuedu.impl.StudentImpl;
import com.neuedu.impl.StudentViewImpl;
import com.neuedu.service.StudentBiz;
import com.neuedu.view.StudentView;
import com.neuedu.view.UserView;

public class Application {

	public static void main(String[] args) {
		System.out.println("----------欢迎登陆-----------");
		System.out.println("      1.登陆            2.退出        ");
		System.out.println("----------------------------");
		if(operation()) {
			choose();
		};
	}
	
	static Scanner s=new Scanner(System.in); 	
	public static boolean operation(){
		UserView userView = new AdminViewImpl();
			
		//s.nextLine();
		System.out.println("请选择:");
		int operation = s.nextInt();
		if(operation == 1){
			//登陆
			try {
				userView.login();
				return true;
			} catch (LoginException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				String msg = e.getMessage();
				System.out.println(msg);
			}
		}else if(operation == 2){
			//退出
			System.exit(0);
		}else{
			System.out.println("您输入的有误，请从新输入。");
			operation();//递归调用
		}
		return false;
	}
	
	public static void choose() {
		StudentView studentView = new StudentViewImpl();
		System.out.println("*****************请选择您要操作的信息对应数字**************");
		System.out.println("*1.查看学生信息  2.添加学生信息 3.修改学生信息  4.删除学生信息*");
		System.out.println("**********************************************************");
		System.out.print("请选择:");
		String tag = s.next();
		switch(tag) {
			case "1":
				studentView.look();				
				break;
			case "2":
				studentView.add();
				break;
			case "3":
				studentView.modify();
				break;
			case "4":
				studentView.delete();
				break;
		}
	}
}
