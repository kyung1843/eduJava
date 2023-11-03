package org.joonzis.ex;


public class Ex05_Local {

	String name;
	int age;
	String sn;
	boolean isKorean;
	
	
	public Ex05_Local() {
		
	}
	
	public Ex05_Local(String n, int a) {
		name = n;
		age = a; 
		
	}
	public Ex05_Local(String n, int a, String _sn) {
		name = n;
		age = a;
		sn = _sn;
		isKorean = sn.charAt(7) <= '4' ? true : false;
		
	}
	
	
	
	
	void output() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("주민등록번호 : " + (sn == null ? "입력 없음" : sn));
		System.out.println(isKorean? "한국인" : "외국인");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
