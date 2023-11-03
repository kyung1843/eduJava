package org.joonzis.ex;

public class Ex03_Circle {

	int x,y;
	double radius;
	
	
	public Ex03_Circle() {
		x = 0;
		y = 0;
		radius = 1;
	}
	public Ex03_Circle(double r) {
		radius = r;
	}
	public Ex03_Circle(int a, int b, double r) {
		x = a;
		y = b;
		radius = r;
	}
	
	double calcArea() {
		return Math.PI * radius*radius;
	}
	
	double calcCircum() {
		return 2 * Math.PI * radius;
	}
	
	void output() {
		System.out.println("중심좌표 : " + x + ',' + y);
		System.out.println("반지름 : " + radius);
		System.out.println("크기 : " + calcArea());
		System.out.println("둘레 : " + calcCircum());
	}
	
	
	
	
	
	
	
}
