package org.joonzis.ex;

interface Animal{
	public void move();               //자동으로 public abstract void move(); 처리가 된다
	public void eat(String food);
	
	
}


class Dog implements Animal{

	@Override
	public void move() {
		System.out.println("달린다");
	}

	@Override
	public void eat(String food) {
		System.out.println(food + " 먹는다");
	}
	
	
}

public class Ex01_interface {
	public static void main(String[] args) {
		Animal animal = new Dog();
		
		animal.eat("토스트");
		animal.move();
	}
}
