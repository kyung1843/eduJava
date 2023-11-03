package org.joonzis.ex;

public class Ex03_Team {
	
	//필드
	String name;
	static int count = 0;     //모든 team이 공유하는 자원
	
	//메소드
	public Ex03_Team(String name) {
		this.name = name;
		count++;
	}
	
	
	void output() {
		System.out.println("이름 : " + name);
		System.out.println("현재 팀원 : " + count + "명");
	}
	
	
}
