package com.neuedu.impl;

import java.util.Scanner;

import com.neuedu.Application;
import com.neuedu.service.StudentBiz;
import com.neuedu.view.StudentView;

public class StudentViewImpl implements StudentView{

	StudentBiz studentBiz = new StudentImpl();
	Application app = new Application();
	Scanner s = new Scanner(System.in);
	@Override
	public void look() {
		// TODO Auto-generated method stub
		System.out.println("************************************************************************************");
		System.out.println("*1.查看所有学生信息           2.根据id查询学生信息           3.根据id查询学生姓名           4.返回上一层*");
		System.out.println("************************************************************************************");
		System.out.print("请输入您的选择:");
		int tag = s.nextInt();
		switch(tag) {
			case 1:
				System.out.println("**************************所有学生信息******************************");
				System.out.println("|学号	|姓名	|性别	|年龄	|班级	|地址	|联系方式	|email");
				studentBiz.look();
				look();
				break;
			case 2:
				System.out.print("请输入您要查询的id:");
				int id1 = s.nextInt();
				System.out.println("|学号	|姓名	|性别	|年龄	|班级	|地址	|联系方式	|email");
				studentBiz.lookById(id1);
				look();
				break;
			case 3:
				System.out.print("请输入您要查询的id:");
				int id2 = s.nextInt();
				System.out.print("学生姓名为：");
				studentBiz.lookNameById(id2);
				break;
			case 4:
				app.choose();
				break;
		}
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("*******************删除学生信息********************");
		System.out.print("请输入学生id：");
		int id = s.nextInt();
		studentBiz.delete(id);
	}

	@Override
	public void modify() {
		// TODO Auto-generated method stub
		System.out.println("************************************修改学生信息*************************************");
		System.out.println("************************************************************************************");
		System.out.println("*1.根据id修改学生全部信息             2.根据id修改学生部分信息             3.返回上一级            4.退出*");
		System.out.println("************************************************************************************");
		System.out.print("请输入您的选择：");
		int tag = s.nextInt();
		switch(tag) {
		case 1:
			System.out.print("请输入学生id：");
			int id = s.nextInt();
			if(!studentBiz.judgeId(id)) {
				System.out.println("id不存在，请重新输入：");
			}
			System.out.print("请输入学生姓名：");
			String name = s.next();
			System.out.print("请输入学生性别：");
			String gender = s.next();
			System.out.print("请输入学生年龄(只能1-120之间的数字)：");
			int age = s.nextInt();
			if(!studentBiz.judgeAge(age)) {
				System.out.print("请输入学生年龄(只能1-120之间的数字)：");
				int age1 = s.nextInt();
			}
			System.out.print("请输入学生所属年级(只能初级，中级，高级)：");
			String _class = s.next();
			System.out.print("请输入学生地址：");
			String address = s.next();
			System.out.print("请输入学生联系方式(只能11位手机号码)：");
			String phone = s.next();
			if(!studentBiz.judgePhone(phone)) {
				System.out.println("手机号码错误，请重新输入");
			}
			System.out.print("请输入学生电子邮箱(包括@和.com)：");
			String email= s.next();
			studentBiz.modify(id, name, gender, age, _class, address, phone, email);
			break;
		case 2:
			System.out.print("请输入学生id：");
			int id2 = s.nextInt();
			if(!studentBiz.judgeId(id2)) {
				System.out.println("id不存在，请重新输入：");
			}
			System.out.println("请输入您要修改的属性：");
			String k = s.next();
			System.out.println("请输入您修改的值：");
			String value = s.next();
			studentBiz.modifyById(id2, k, value);
			studentBiz.lookById(id2);
			break;
		case 3:
			app.choose();
			break;
		case 4:
			System.exit(0);
			break;
	}
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("*******************添加学生信息********************");
		System.out.print("请输入学生id：");
		int id = s.nextInt();
		if(studentBiz.judgeId(id)) {
			System.out.println("id已存在");
		}
		System.out.print("请输入学生姓名：");
		String name = s.next();
		System.out.print("请输入学生性别：");
		String gender = s.next();
		System.out.print("请输入学生年龄(只能1-120之间的数字)：");
		int age = s.nextInt();
		if(!studentBiz.judgeAge(age)) {
			System.out.print("年龄输入错误：");
		}
		System.out.print("请输入学生所属年级(只能初级，中级，高级)：");
		String _class = s.next();
		System.out.print("请输入学生地址：");
		String address = s.next();
		System.out.print("请输入学生联系方式(只能11位手机号码)：");
		String phone = s.next();
		if(!studentBiz.judgePhone(phone)) {
			System.out.println("手机号码错误，请重新输入");
		}
		System.out.print("请输入学生电子邮箱(包括@和.com)：");
		String email= s.next();
		studentBiz.add(id, name, gender, age, _class, address, phone, email);
	}
	
	/*public static void main(String[] args) {
		StudentViewImpl s = new StudentViewImpl();
		s.modify();
	}*/
}
