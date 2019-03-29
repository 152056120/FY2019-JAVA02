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
		System.out.println("----------��ӭ��½-----------");
		System.out.println("      1.��½            2.�˳�        ");
		System.out.println("----------------------------");
		if(operation()) {
			choose();
		};
	}
	
	static Scanner s=new Scanner(System.in); 	
	public static boolean operation(){
		UserView userView = new AdminViewImpl();
			
		//s.nextLine();
		System.out.println("��ѡ��:");
		int operation = s.nextInt();
		if(operation == 1){
			//��½
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
			//�˳�
			System.exit(0);
		}else{
			System.out.println("�������������������롣");
			operation();//�ݹ����
		}
		return false;
	}
	
	public static void choose() {
		StudentView studentView = new StudentViewImpl();
		System.out.println("*****************��ѡ����Ҫ��������Ϣ��Ӧ����**************");
		System.out.println("*1.�鿴ѧ����Ϣ  2.���ѧ����Ϣ 3.�޸�ѧ����Ϣ  4.ɾ��ѧ����Ϣ*");
		System.out.println("**********************************************************");
		System.out.print("��ѡ��:");
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
