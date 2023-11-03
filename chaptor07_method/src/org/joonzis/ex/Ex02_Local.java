package org.joonzis.ex;

//국내 거주하는 사람

public class Ex02_Local {

	//필드              //초기화 상태(field값은 초기화 되어있다)
	String name;       //null
	int age;           //0
 	String sn;         //null    //주민등록번호
	boolean isKorean;  //false    //한국인 : ture, 외국인 : false
	
	//입력 메소드
	//인적사항 입력 메소드
//	void setLocalInfo(String _name, int age, String _sn) {
//		name = _name;
//		this.age = age;
//		sn = _sn;
//		
//		isKorean = sn.charAt(7)  <= '4' ? true : false;
//	}
//	void setLocalInfo(String _name, int age) {
//		name = _name;
//		this.age = age;               //this.  : 이 클래스(Local)를 말함
//	}
//	
//	void output() {
//		System.out.println("이름 : " + name);
//		System.out.println("나이 : " + age);
//		System.out.println("주민등록번호 : " + ((sn ==null) ? "없음" : sn));
//		System.out.println(isKorean ? "한국인" : "외국인");
//	}
	
	
	
	
	void setLocalInfo(String _name, int age, String _sn) {
		setLocalInfo(_name, age);          //리펙토링(refactoring)
		this.age = age;
		sn = _sn;
		
		isKorean = sn.charAt(7)  <= '4' ? true : false;
	}
	void setLocalInfo(String _name, int age) {
		name = _name;
		this.age = age;               //this.  : 이 클래스(Local)를 말함
	}
	
	void output() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("주민등록번호 : " + ((sn ==null) ? "없음" : sn));
		System.out.println(isKorean ? "한국인" : "외국인");
	}
	
	
	
	
	
	
	
	
}
