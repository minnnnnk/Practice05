package com.javaex.ex01;

public class MemberApp {

	public static void main(String[] args) {

		Member jung = new Member();
		jung.setId("jws");
		jung.setName("정우성");
		jung.setPoint(50000);
		
		Member yoo = new Member();
		
		yoo.setId("yjs");
		yoo.setName("유재석");
		yoo.setPoint(30000);
		
		Member lee = new Member();
		
		lee.setId("lhr");
		lee.setName("이효리");
		lee.setPoint(40000);
		
		jung.showInfo();
		yoo.showInfo();
		lee.showInfo();
	}

}
