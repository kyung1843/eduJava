package org.joonzis.ex;

class Person {
	public void eat(String food){
		System.out.println(food + "먹는다");
	}
	
	public void sleep(){
		System.out.println("잔다");
	}
	
}

class Student extends Person{
	public void study() {
		System.out.println("공부한다");
	}
}

class Worker extends Person{
	public void work() {
		System.out.println("일한다");
	}
}

public class Ex04_polymorpism {
	public static void main(String[] args) {

		Person person = new Student();      //업캐스팅
		person.eat("밥먹는다");
		person.sleep();
		
		
		//study()메소드 호출
		if(person instanceof Student) {
			Student stu = (Student)person;
			stu.study();
			
//			((Student)person).study();
		
			}
			
		
		
		
		
		
		
		
		
	}
}
