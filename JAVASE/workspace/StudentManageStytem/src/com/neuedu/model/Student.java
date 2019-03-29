package com.neuedu.model;

public class Student {
	
	private int id;
	private String name;
	private String gender;
	private int age;
	private String _class;
	private String address;
	private String phone;
	private String email;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(int id, String name, String gender, int age, String _class, String address, String phone,
			String email) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this._class = _class;
		this.address = address;
		this.phone = phone;
		this.email = email;
	}



	@Override
	public String toString() {
		return  "|"+id +"	|"+ name +"	|"+   gender  + "	|"+ age  + "	|" + _class
				+ "	|"+ address  +"	|"+  phone  + "	|"+ email ;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String get_class() {
		return _class;
	}



	public void set_class(String _class) {
		this._class = _class;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getPhone() {
		return phone;
	}



	public void setPhone(String phone) {
		this.phone = phone;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}

	
	
}
