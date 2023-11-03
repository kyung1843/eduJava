package org.joonzis.ex;

class Shape {
	// 의미없는 메소드(자식들이 사용하기 위해 만듦)
	public double calcArea() {
		return 0;
	}

}

class Rect extends Shape {
	private int width, height;

	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public double calcArea() {
		return width * height;
	}

}

class Triangle extends Shape {
	private int width, height;

	public Triangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public double calcArea() {
		return (width * height) / 2;
	}
}

class Circle extends Shape {
	private int radius;

	public Circle(int radius) {
		this.radius = radius;
	}

	@Override
	public double calcArea() {
		return Math.PI * radius * radius;
	}

}

public class Ex02_polymorphism {
	public static void main(String[] args) {

		//도형 배열 arr생성(크기3)
		//각 인덱스에 사각형, 삼각형, 원형 초기화 하여 입력
		//각 도형 크기 출력
		//업캐스팅 이용
		
		Shape[] arr = new Shape[3];
		
		arr[0] = new Circle(15);
		arr[1] = new Triangle(15, 2);
		arr[2] = new Rect(15, 3);
		
		System.out.println("원의 크기 : " + arr[0].calcArea());
		System.out.println("삼각형의 크기 : " + arr[1].calcArea());
		System.out.println("사각형의 크기 : " + arr[2].calcArea());
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
