package org.joonzis.ex;

class Person{
	
	private void sleep() {
		System.out.println("잔다");
	}

	void eat(String food) {
		System.out.println(food + "먹는다");
	}
}

class Student extends Person{
	
	void study() {
		System.out.println("공부한다");
	}
	
		
	
}
public class Ex02_Inheritance {
	public static void main(String[] args) {
		
		Student student = new Student();
		
		student.eat("짬뽕");
		student.sleep();
		student.study();
		
		
		
		
		
		
		
		
		
	}
}
