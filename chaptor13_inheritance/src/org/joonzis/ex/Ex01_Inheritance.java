package org.joonzis.ex;

class Parent{
	//필드
	int number;
	
	//메소드
	void doParent() {
		System.out.println("doparent() 호출");
	}
}


class Child extends Parent{
	
	//메소드
	void doChild() {
		System.out.println("doChild() 호출");
	}
}

public class Ex01_Inheritance {
	public static void main(String[] args) {
		
		Child c = new Child();
		
		c.number = 10;
		System.out.println(c.number);
		
		c.doParent();
		c.doChild();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
