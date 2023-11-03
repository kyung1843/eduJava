package org.joonzis.test;

//클래스 Dog을 정의하시오.

//- 필드 : String name, String breed, int age
//- 메소드 : setDog(name, age) : 품종은 푸들
//		setDog(name, age, breed) 
//		info() - name, age, breed 출력

public class Dog {

	// 필드
	String name;
	String breed;
	int age;

	// 메소드
	void setDog(String n, int a) {
		name = n;
		age = a;

	}

	void setDog(String n, int a, String b) {
		name = n;
		age = a;
		breed = b;
	}

	void info() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("품종 : " + breed);
	}

}
