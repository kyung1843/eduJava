package org.joonzis.ex;

public class Ex02_Person {

	int age;
	String name;
	double height;
	char gender;
	
	public Ex02_Person(){
	}
	public Ex02_Person( String n, int a, double h, char g){
		name = n;
		age = a;
		height = h;
		gender = g;
		
		
	}
//	public Ex02_Person(int age, String name, double height, char gender) {
//		this.age = age;
//		this.name = name;
//		this.height = height;
//		this.gender = gender;
//	}
	//마우스 우클릭 - source -  generate constructor using fields.. : 자동으로 필드 내용으로 메소드 채워줌
	
	
	
	void output(){
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("키 : " + height);
		System.out.println("성별 : " + gender);
	}
	
	
	/*개발자가 생성자를 하나도 구현하지 않았다면 자바가 디폴트 생성자 만들어서 호출
	 * 개발자가 생성자를 하나라도 구현하면 person(){}형태의 생성자가 없을 때 오류 발생
	 * 즉 개발자가 생성자를 만들면 개발자가 원하는 모습으로만 객체를 생성할 수 있다*/
	
	
	
	
	
	
	
	
	
	
	
	
	
}
