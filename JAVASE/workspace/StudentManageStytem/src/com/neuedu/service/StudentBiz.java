package com.neuedu.service;

public interface StudentBiz {
	void look();
	void lookById(int id);
	void lookNameById(int id);
	void delete(int id);
	void modify(int id, String name, String gender, int age, String _class, String address, String phone,
			String email);
	void modifyById(int id,String k,String Value);
	void add(int id, String name, String gender, int age, String _class, String address, String phone,
			String email);
	boolean judgeId(int id);
	boolean judgePhone(String phone);
	boolean judgeAge(int age);
}
