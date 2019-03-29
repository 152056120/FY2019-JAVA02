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
		System.out.println("*1.�鿴����ѧ����Ϣ           2.����id��ѯѧ����Ϣ           3.����id��ѯѧ������           4.������һ��*");
		System.out.println("************************************************************************************");
		System.out.print("����������ѡ��:");
		int tag = s.nextInt();
		switch(tag) {
			case 1:
				System.out.println("**************************����ѧ����Ϣ******************************");
				System.out.println("|ѧ��	|����	|�Ա�	|����	|�༶	|��ַ	|��ϵ��ʽ	|email");
				studentBiz.look();
				look();
				break;
			case 2:
				System.out.print("��������Ҫ��ѯ��id:");
				int id1 = s.nextInt();
				System.out.println("|ѧ��	|����	|�Ա�	|����	|�༶	|��ַ	|��ϵ��ʽ	|email");
				studentBiz.lookById(id1);
				look();
				break;
			case 3:
				System.out.print("��������Ҫ��ѯ��id:");
				int id2 = s.nextInt();
				System.out.print("ѧ������Ϊ��");
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
		System.out.println("*******************ɾ��ѧ����Ϣ********************");
		System.out.print("������ѧ��id��");
		int id = s.nextInt();
		studentBiz.delete(id);
	}

	@Override
	public void modify() {
		// TODO Auto-generated method stub
		System.out.println("************************************�޸�ѧ����Ϣ*************************************");
		System.out.println("************************************************************************************");
		System.out.println("*1.����id�޸�ѧ��ȫ����Ϣ             2.����id�޸�ѧ��������Ϣ             3.������һ��            4.�˳�*");
		System.out.println("************************************************************************************");
		System.out.print("����������ѡ��");
		int tag = s.nextInt();
		switch(tag) {
		case 1:
			System.out.print("������ѧ��id��");
			int id = s.nextInt();
			if(!studentBiz.judgeId(id)) {
				System.out.println("id�����ڣ����������룺");
			}
			System.out.print("������ѧ��������");
			String name = s.next();
			System.out.print("������ѧ���Ա�");
			String gender = s.next();
			System.out.print("������ѧ������(ֻ��1-120֮�������)��");
			int age = s.nextInt();
			if(!studentBiz.judgeAge(age)) {
				System.out.print("������ѧ������(ֻ��1-120֮�������)��");
				int age1 = s.nextInt();
			}
			System.out.print("������ѧ�������꼶(ֻ�ܳ������м����߼�)��");
			String _class = s.next();
			System.out.print("������ѧ����ַ��");
			String address = s.next();
			System.out.print("������ѧ����ϵ��ʽ(ֻ��11λ�ֻ�����)��");
			String phone = s.next();
			if(!studentBiz.judgePhone(phone)) {
				System.out.println("�ֻ������������������");
			}
			System.out.print("������ѧ����������(����@��.com)��");
			String email= s.next();
			studentBiz.modify(id, name, gender, age, _class, address, phone, email);
			break;
		case 2:
			System.out.print("������ѧ��id��");
			int id2 = s.nextInt();
			if(!studentBiz.judgeId(id2)) {
				System.out.println("id�����ڣ����������룺");
			}
			System.out.println("��������Ҫ�޸ĵ����ԣ�");
			String k = s.next();
			System.out.println("���������޸ĵ�ֵ��");
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
		System.out.println("*******************���ѧ����Ϣ********************");
		System.out.print("������ѧ��id��");
		int id = s.nextInt();
		if(studentBiz.judgeId(id)) {
			System.out.println("id�Ѵ���");
		}
		System.out.print("������ѧ��������");
		String name = s.next();
		System.out.print("������ѧ���Ա�");
		String gender = s.next();
		System.out.print("������ѧ������(ֻ��1-120֮�������)��");
		int age = s.nextInt();
		if(!studentBiz.judgeAge(age)) {
			System.out.print("�����������");
		}
		System.out.print("������ѧ�������꼶(ֻ�ܳ������м����߼�)��");
		String _class = s.next();
		System.out.print("������ѧ����ַ��");
		String address = s.next();
		System.out.print("������ѧ����ϵ��ʽ(ֻ��11λ�ֻ�����)��");
		String phone = s.next();
		if(!studentBiz.judgePhone(phone)) {
			System.out.println("�ֻ������������������");
		}
		System.out.print("������ѧ����������(����@��.com)��");
		String email= s.next();
		studentBiz.add(id, name, gender, age, _class, address, phone, email);
	}
	
	/*public static void main(String[] args) {
		StudentViewImpl s = new StudentViewImpl();
		s.modify();
	}*/
}
