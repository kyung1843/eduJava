package org.joonzis.ex;
//하나의 파일에 클래스가 2개 이상인 경우 
//public 키워드는 파일명과 일치하는 클래스에만 명시한다
//public 키워드는 하나만 써야함
class Person{
	//필드
	char gender;
	int age;
	double height ;
	String name;
	
	//메소드
	void info() {
		System.out.println("성별 : " + gender);
		System.out.println("나이 : " + age);
		System.out.println("키 : " + height);
		System.out.println("이름 : " + name);
	}
}


	
public class Ex03_PersonMain {										
	public static void main(String[] args) {
		
		//위 person 클래스 객체 생성해 정보 출력
		
		Person m = new Person();
		
		//2.생성된 객체 활용
		m.name = "Jack";
		m.height = 180;
		m.age = 32;
		m.gender = 'm';
		
		
		m.info();
		
		
		System.out.println("===============");
		
		
		Person w = new Person();
		
		w.name = "이은경";
		w.age = 27;
		w.height = 164;
		w.gender = 'f';
		
		w.info();
		
		
		
		
		
		
		
	}
}
