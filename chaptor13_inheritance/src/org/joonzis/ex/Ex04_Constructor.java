package org.joonzis.ex;
/*super
 * 
 * 1.자식 클래스가 알고있는 부모 클래스의 참조
 * 2.사용방법
 * 		1)super.필드      : 부모 클래스의 필드 사용
 * 		2)super.메소드()  : 부모 클래스의 메소드 사용
 * 		3)super()       : 부모 클래스의 생성자 사용
 */

class Animal {

	String name;

	public Animal() {
	}

	public Animal(String name) {
		this.name = name;
	}
}

class Dog extends Animal {
	String PersonName;

		public Dog(String PersonName) {
		this.PersonName = PersonName;}

		public Dog(String name, String PersonName) {
		super(name);                   //
		this.PersonName = PersonName;
	}

	void whoAmI() {
		System.out.println("내 이름은 " + name + "이고, 주인은 " + PersonName + " 입니다");
	}

}

public class Ex04_Constructor {
	public static void main(String[] args) {
		
		Dog dog1 = new Dog("짱구");
		dog1.whoAmI();
		
		System.out.println("-------------------------");
		
		Dog dog2 = new Dog("뽀삐", "앞집 아주머니");
		dog2.whoAmI();
	
		
		
		
		
	}
}
