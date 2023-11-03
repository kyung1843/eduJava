package org.joonzis.ex;

interface Eatable {
	public void eat(); // = public abstract void eat();
}

class pig {
	public void piggy() {
		System.out.println("다 먹는다");
	}

}

class Apple extends pig implements Eatable { // 다중 상속

	@Override
	public void eat() {
		System.out.println("사과는 맛있다");

	}

}

class Banana extends pig implements Eatable {

	@Override
	public void eat() {
		System.out.println("맛있으면 바나나");

	}

}

class Computer extends pig {

}

public class Ex03_interface {
	public static void main(String[] args) {

		// 업캐스팅
		pig[] pigking = new pig[3];
		pigking[0] = new Apple();
		pigking[1] = new Banana();
		pigking[2] = new Computer();

		for (int i = 0; i < pigking.length; i++) {
			pigking[i].piggy();

			// 다운캐스팅
			if (pigking[i] instanceof Eatable) {
				Eatable eatable = (Eatable) pigking[i];
//				((Eatable)pigking[i]).eat();
				eatable.eat();
			}

			
				

		}

	}
}
