package org.joonzis.test;
//필드 : double radius
//- 메소드 : Constructor, calcArea, output
//CricleMain.java			Circle 3개 생성 (반지름 입력 받아서 처리), 가장 크기가 큰 Circle 출력
//★                         *Circle 배열 circles 생성해서 사용
//calcArea => Math.PI * Math.pow(radius, 2)
public class Q1_Circle {

	double radius;
	//
	public Q1_Circle() {
		// TODO Auto-generated constructor stub
	}
	
	public Q1_Circle(double radius) {
		this.radius = radius;
		calcArea();
	}




	double calcArea(){
		return Math.PI * Math.pow(radius, 2);
	}
	
	
	void output() {
		System.out.println("반지름 : " + radius);
		System.out.println("원의 크기 : " + calcArea());
	}
}
