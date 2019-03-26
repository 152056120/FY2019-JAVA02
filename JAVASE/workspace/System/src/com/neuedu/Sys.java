package com.neuedu;

import java.util.Scanner;

public class Sys {
	public static void main(String[] args) {
		UserVie ce=new UserVie();
		while(true){
		   System.out.println("1: 注册");
		   System.out.println("2：登录");
		   Scanner t=new Scanner(System.in);
		   System.out.println("请输入您的选择！");
		   int i=t.nextInt();
		   if ( i==1) {
		    ce.register();
		   }else if ( i==2) {
		    ce.login();
		   }else{
		    System.out.println("请您重新输入！");
		   }
		  }
	}
}
