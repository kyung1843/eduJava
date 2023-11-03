package org.joonzis.test;

public class DogMain {

	public static void main(String[] args) {
		Dog g = new Dog();

		g.setDog("봄이", 12);
		g.info();

		System.out.println("============================");

		
		Dog myDog = new Dog();
		
		myDog.setDog("여름이", 5, "푸들");
		myDog.info();

	}
}
