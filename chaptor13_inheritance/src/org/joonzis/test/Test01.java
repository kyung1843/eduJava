package org.joonzis.test;

class Human{
	String name;
	int age;
	
	public Human() {}    //기본생성자와 매개변수 생성자 두개 생성해놓으면 컴파일 과정에서 자동추가되어 부모생성자 호출

	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void output() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
	
}



class Student extends Human {
	String school; 
	

	 public Student(String name, String school, int age) {
		super(name, age);
		this.school = school;
	}
	
	void output() {             // 이 자체로 오버라이드 된 것
		super.output();
		System.out.println("학교 : " + school);
		
	}
}

class Worker extends Human{
	
	String name, job ; 
	int age;
	
	public Worker() {
		// TODO Auto-generated constructor stub
	}

	
	public Worker(String name, String job, int age) {
		super(name, age);  //부모 생성자 호출
		this.job = job;     
	}


	@Override             //상속된 메소드 재정의
	void output() {
		System.out.println("직업 : " + job);
		super.output();
	}
	
	
	
	
	
	
	
}


public class Test01 {

	public static void main(String[] args) {
		
		Student stu = new Student("김군", "구디고", 18);
		stu.output();
		
		
		System.out.println("================================");
		
		Worker wor = new Worker("김씨", "개발자", 40);
		wor.output();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
