package org.joonzis.ex;

class Animal{
	public void move() {
		
	}
}

class Dog extends Animal{

	@Override
	public void move() {
		System.out.println("개 달린다");
	}
	
}

class Dolphin extends Animal{

	@Override
	public void move() {
		System.out.println("돌고래 헤엄친다");
	}
	
}

class Eagle extends Animal{

	@Override
	public void move() {
		System.out.println("독수리 달린다");
	}
	
	public void fly() {
		System.out.println("독수리만 날 수 있다");
	}
	
}


public class Ex03_polymorphism {
	public static void main(String[] args) {
		
		//동물 타입의 배열 animals생성(크기 3)
		//상속받은 각 클래스들 대입
		//반복문을 통해 move 메소드 실행
		
		
		Animal[] arr = new Animal[3];
		
		arr[0] = new Dog();
		arr[1] = new Dolphin();
		arr[2] = new Eagle();            //부모 객체에 자식이 들어갔다해도 부모다  (자식 아님)
		
		for(int i = 0; i < arr.length; i++) {
			arr[i].move();
		}
		
		//arr[2].fly();          //부모클래스인 Animal에는 fly()메소드가 없기 때문에 호출X
		
//		다운캐스팅 : 부모타인인 객체를 자식타입으로 바꿔주는 것
//		           : 자식클래스만 가지고 있는 걸 쓰고싶을 때 사용
		//방법1
//		Eagle eagle = (Eagle)arr[2];
//		eagle.fly();
		
		//방법2
//		((Eagle)arr[2]).fly();
		
		
		
//		Eagle eagle = (Eagle)arr[1];  //자식과 자식 간 캐스팅X
//		eagle.fly();                  //오류남
		
		
		
		//1
//		if(arr[2] instanceof Eagle) {
//			Eagle eagle = (Eagle)arr[2];
//			eagle.fly();
//		}
		//2
//		for(int i = 0; i < arr.length; i++) {
//			if(arr[2] instanceof Eagle) {
//				Eagle eagle = (Eagle)arr[2];
//				eagle.fly();
//			}
//		}
		
		
		
		
		
		
		
		
		
	}
}
