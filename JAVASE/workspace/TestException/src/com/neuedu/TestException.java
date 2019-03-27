package com.neuedu;

import java.io.IOException;

public class TestException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestException te = new TestException();
		//String s1 = "abc";
		//String s2 = "abc";
		//String s = "hehe";
		//te.count(s1);
		//te.count1(s1, s2);
		//te.strEqual(s1, s2);
		//te.dx(s);
		//te.dc(s);
		//将test变为test
		/*String s = "test";
		StringBuffer sb = new StringBuffer(s);
		sb.reverse();
		s = sb.toString();
		System.out.println(s);*/
		/**
		 *  String s = "113@ ere qqq yyui",提取 113 ere qqq yyui 
		 * */
		/*String s = "113@ ere qqq yyui";
		s = s.replaceAll("@", "");
		String[] a = s.split(" ");
		for(int i =0;i<a.length;i++) {
			System.out.println(a[i]);
		}*/
		
		/**
		 * 将下面的一段文本中的各个单词的字母顺序翻转，
		 * “To be or not to be"，将变成"oT eb ro ton ot eb."。 
		 * */
		/*String s ="To be or not to be";
		String[] a = s.split(" ");
		StringBuffer sb1 = new StringBuffer();
		for(int i =0;i<a.length;i++) {
			StringBuffer sb = new StringBuffer(a[i]);
			sb.reverse();
			sb1.append(sb);
			if(i==a.length-1) {
				sb1.append(".");
			}else {
				sb.append(" ");
			}
		}
		System.out.println(sb1);*/
		
		/**
		 * String s=”name=zhangsan age=18 classNo=090728”;
		 * 将上面的字符串拆分，结果如下: zhangsan 18 090728
		 * */
		String s = "name=zhangsan age=18 classNo=090728";
		String[] s1 = s.split(" ");
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<s1.length;i++) {
			String[] s2 = s1[i].split("=");
			sb.append(s2[1]);
			sb.append(" ");
		}
		System.out.println(sb);
	}
	
	/**
	 * 1.输出一个字符串中的大写英文字母数，小写英文 字母数以及非英文字母数
	 *  A-Z(65-90) a-z(97-122) 
	 * */
	public void count(String s) {
		int dx = 0,xx=0,f=0;
		char[] a = s.toCharArray();
		for(int i=0;i<s.length();i++) {
			if((int)a[i]>=65&&(int)a[i]<=90) {
				dx++;
			}else if((int)a[i]>=97&&a[i]<=122) {
				xx++;
			}else {
				f++;
			}
		}
		System.out.println("大写："+dx+"小写："+xx+"非字母:"+f);
	}
	
	/**
	 * 
	 * indexof方法返回一个整数值，指出 String 对象内子字符串的
	 * 开始位置,如果没有找到子字符串，则返回-1
	 * 
	 * */
	public void count1(String s1,String s2) {
		int a = s2.length();
		int b=0,count=0;
		b=s1.indexOf(s2,b);
		while(b!=-1) {
			count++;
			b=b+a;
			b=s1.indexOf(s2,b);
		}
		System.out.println("次数:"+count);
	}
	
	
	/**
	 * 比较两个字符串是否相等
	 * 
	 * */
	public void strEqual(String s1, String s2) {
		boolean bool = true;
		if(s1.length() != s2.length()) {
			bool = false;
		}
		
		for(int i=0;i<s1.length();i++) {
			char a = s1.charAt(i);
			char b = s2.charAt(i);
			if(a != b) {
				bool = false;
			}
		}
		if(bool) {
			System.out.println("相等");
		}else {
			System.out.println("不相等");
		}		
	}
	/**
	 * 编写程序将 “jdk” 全部变为大写,并输出到屏幕,
	 * 截取子 串”DK” 并输出到屏幕 (substring()截取)
	 * */
	public void dx(String s) {
		s=s.toUpperCase();
		System.out.println("大写:"+s);
		s=s.substring(1);
		System.out.println(s);
	}
	
	/**
	 * 写一个方法判断一个字符串是否对称  heh      heh 
	 * */
	public void dc(String s) {
		StringBuffer sb = new StringBuffer(s);
		String s1 = sb.reverse().toString();
		if(s1.equals(s)) {
			System.out.println("对称");
		}else {
			System.out.println("不对称");
		}
	}
	
	
	/**
	 * 手动抛出异常
	 * 
	 * 
	 * 1)throw + 异常类对象（非运行时异常）
	 * 2)方法的声明上加上throws + 有可能抛出的异常类型
	 * */
	
	/*public void testThrow(int num) throws IOException{
		if(num<0) {
			
		}
	}*/
}
 
