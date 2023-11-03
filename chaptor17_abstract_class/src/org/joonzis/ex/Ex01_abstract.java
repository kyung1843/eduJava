package org.joonzis.ex;

abstract class Animal {                       
	abstract public void move();        

	

	public void eat(String food) {
		System.out.println(food + " 먹는다");
	}

}

class Dog extends Animal {

	@Override                                 //추상메소드는 클래스도 추상으로 만들고 반드시 자식클래스에서 오버라이드하고 속을 채워줘야함
	public void move() {
		System.out.println("개 달린다");
	}

}

public class Ex01_abstract {
	public static void main(String[] args) {
		
//		Animal ani  = new Animal();      //추상클래스는 객체생성X(new X)
		
		
		Animal animal = new Dog();
		animal.eat("간식");
		animal.move();
	}
}
