package org.joonzis.ex;


interface Shape{
	double PI = Math.PI;         //public static double PI
	double calcArea();           //public abstract double clacArea();
	void output();               //public abstract void output();
	
}

class Rect implements Shape{
	//너비 높이 값 입력받아서 너비. 높이. 크기 값 출력
	int width, height;

	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
		
	}

	@Override
	public double calcArea() {
		return width * height;
	}

	@Override
	public void output() {
		System.out.println("너비 : " + width);
		System.out.println("높이 : " + height);
		System.out.println("크기 : " + calcArea());
	}
	
	
}

class Circle implements Shape{
	//반지름 입력 받아서 반지름, 크기 출력
	int radius;

	public Circle(int radius) {
		this.radius = radius;
		
	}

	@Override
	public double calcArea() {
		return PI* radius * radius;
	}

	@Override
	public void output() {
		System.out.println("반지름 : " + radius);
		System.out.println("크기 : " + calcArea());
	}
	
	
	
}

public class Ex02_interface {
	public static void main(String[] args) {
		
		Shape sh = new Rect(10, 10);
		sh.output();
		
		Shape sh1 = new Circle(5);
		sh1.output();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
