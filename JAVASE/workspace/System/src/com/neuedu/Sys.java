package com.neuedu;

import java.util.Scanner;

public class Sys {
	public static void main(String[] args) {
		UserVie ce=new UserVie();
		while(true){
		   System.out.println("1: ע��");
		   System.out.println("2����¼");
		   Scanner t=new Scanner(System.in);
		   System.out.println("����������ѡ��");
		   int i=t.nextInt();
		   if ( i==1) {
		    ce.register();
		   }else if ( i==2) {
		    ce.login();
		   }else{
		    System.out.println("�����������룡");
		   }
		  }
	}
}
