package org.joonzis.test;

public class Circle {
	//필드
		String name;
		double radius;
		final double PI = 3.14;    //final : 수정불가
		

		//메소드
		public void info() {                       //public : 누구나 어디에서든 쓸수 있다
		System.out.println("반지름 : " + radius);    //void : 리턴하지 않고 보내서 처리하겠다
		System.out.println("이름 : " + name);
		System.out.println("크기 : " + (PI*radius*radius));
		System.out.println("둘레 : " + (2*PI*radius));}
}
