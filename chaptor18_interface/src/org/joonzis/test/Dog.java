package org.joonzis.test;

public class Dog implements Animal {

	@Override
	public void move() {
		System.out.println("멍멍");
	}

	public static void main(String[] args) {
		Animal ani = new Dog();
		ani.move();
	}
}
