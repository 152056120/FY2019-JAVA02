package com.neuedu.impl;

import com.neuedu.model.Student;
import com.neuedu.service.StudentBiz;

public class StudentImpl implements StudentBiz{

	private Student[] students = new Student[100];
	Student student = new Student();
	public StudentImpl() {
		// TODO Auto-generated constructor stub
		Student student1= new Student(1, "tom", "男", 18, "一班", "北京市", "12345678934", "123@qq.com");
		Student student2= new Student(2, "Amy", "女", 17, "一班", "北京市", "17745678934", "124@qq.com");
		students[0] = student1;
		students[1] = student2;
	}
	@Override
	public void look() {
		// TODO Auto-generated method stub
		
		for(int i=0;i<students.length;i++) {
			Student student = students[i];
			if(student != null) {
				System.out.println(student);
			}
		}
	}
	@Override
	public void lookById(int id) {
		// TODO Auto-generated method stub
		/*boolean tag = false;
		for(int i=0;i<students.length;i++) {
			Student student = students[i];
			if(student!=null) {
			if(id == student.getId()) {
				tag = true;
				System.out.println(student);
			}
			}
		}
		if(!tag) {
			System.out.println("id不存在");
		}*/
		if(judgeId(id)) {
			for(int i=0;i<students.length;i++) {
				Student student = students[i];
				if(student!=null) {
				if(id == student.getId()) {

					System.out.println(student);
				}
				}
			}
		}else {
			System.out.println("id不存在");
		}
			
	}
	@Override
	public void lookNameById(int id) {
		// TODO Auto-generated method stub
		boolean tag = false;
		for(int i=0;i<students.length;i++) {
			Student student = students[i];
			if(student!=null) {
			if(id == student.getId()) {
				tag = true;
				System.out.println(student.getName());
			}
			}
		}
		if(!tag) {
			System.out.println("id不存在");
		}
	}
	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		if(judgeId(id)) {
			for(int i=0;i<students.length;i++) {
				Student student = students[i];
				if(student != null) {
					if(id == student.getId()) {
						students[i] = null;
						System.out.println("删除成功");
					}
				}
			}
			look();
		}else {
			System.out.println("id不存在");
		}
	}

	@Override
	public void modify(int id, String name, String gender, int age, String _class, String address, String phone,
			String email) {
		// TODO Auto-generated method stub
		if(judgeId(id)) {
			Student student = students[id];
			//student.setId(id);
			student.setName(name);
			student.setGender(gender);
			student.setAge(age);
			student.set_class(_class);
			student.setAddress(address);
			student.setPhone(phone);
			student.setEmail(email);
			students[id] = student;
			System.out.println("修改成功");
			System.out.println(students[id]);
		}else {
			System.out.println("id不存在");
		}
	}
	
	@Override
	public void modifyById(int id, String k,String value) {
		// TODO Auto-generated method stub
		Student student = students[id-1];
		switch(k) {
			case "name":
				student.setName(value);
				break;
			case "gender":
				student.setGender(value);
				break;
			case "age":
				student.setAge(Integer.parseInt(value));
				break;
			case "_class":
				student.set_class(value);
				break;
			case "address":
				student.setAddress(value);
				break;
			case "phone":
				student.setPhone(value);
				break;
			case "email":
				student.setEmail(value);
				break;
		}
		students[id] = student;
		//System.out.println(students[id]);
	}
	/*public void modify(int id,String name) {
		students[id] = new Student(0, " ", " ",0, " ", " ", " ", " ");
		students[id].setName("a");
		System.out.println(students[id]);
	}*/
	/*public static void main(String[] args) {
		StudentImpl s  = new StudentImpl();
		s.modifyById(1,"_class","高级");
		
	}*/
	
	int i =2;
	@Override
	public void add(int id, String name, String gender, int age, String _class, String address, String phone,
			String email) {
		// TODO Auto-generated method stub
		Student student = students[i];
		student = new Student(0, " ", " ",0, " ", " ", " ", " ");
		student.setId(id);
		student.setName(name);
		student.setGender(gender);
		student.setAge(age);
		student.set_class(_class);
		student.setAddress(address);
		student.setPhone(phone);
		student.setEmail(email);
		students[i] = student;
		i++;
		System.out.println("添加成功");
		look();
	}
	

	
	public boolean judgeId(int id) {
		for(int i=0;i<students.length;i++) {
			Student student = students[i];
			if(student!=null) {
			if(id == student.getId()) {
				return true;
			}
			}
		}
		return false;
	}
	@Override
	public boolean judgePhone(String phone) {
		// TODO Auto-generated method stubr 
		if(phone.length()==11) {
			return true;
		}
		return false;
	}
	@Override
	public boolean judgeAge(int age) {
		// TODO Auto-generated method stub
		if(age>=1&&age<=120) {
			return true;
		}
		return false;
	}
	
	
}
