package org.joonzis.ex;
interface Animal{
	
	void walk();
}

class Dog implements Animal{

	@Override
	public void walk() {
		System.out.println("산책한다");
	}
	
	public void sleepTogether() {
		System.out.println("같이 잔다");
		
	}
}


class Crocodile implements Animal{

	@Override
	public void walk() {

		System.out.println("악어 기어간다");
	}
	
	
}


public class Ex05_exception {
	public static void verifyDog(Animal animal) {
		
		//1.instanceof 연산자를 이용한 예외처리
//		animal.walk();   //업캐스팅
//		
//		if(animal instanceof Dog) {        //다운캐스팅
//			((Dog) animal).sleepTogether();  //악어 객체에서 문제
//		}else {
//			System.out.println("같이 잘 수 없다");
//		}
		
		//2.try-catch 통한 예외 처리
		try {
			((Dog) animal).sleepTogether();
		} catch (ClassCastException e) {
			System.out.println("같이 잘 수 없다");
			e.printStackTrace();
		}
		
		
		
	}
	
	public static void main(String[] args) {
		verifyDog(new Dog());
		
		verifyDog(new Crocodile());
		
		
	}
}
