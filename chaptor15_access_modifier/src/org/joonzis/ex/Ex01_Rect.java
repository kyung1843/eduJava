package org.joonzis.ex;
public class Ex01_Rect {

	// Field
	private int width;
	private int height;
	private boolean isSquare;
	
	// Constructor
	//	1. 생성자
	// 	2. 역할 : 객체(인스턴스)를 생성할 때 호출되는 메소드
	//	3. 객체 초기화 용도로 사용한다.
	//  4. 규칙 : 파일명과 생성자명이 동일하다, return 타입이 없다. (이름과 매개변수만 있으면됨!)
	public Ex01_Rect() {
		this(1, 1);
	}
	
	public Ex01_Rect(int side){
		this(side, side);
	}
	
	public Ex01_Rect(int width, int height){
		this.width = width;
		this.height = height;
		this.isSquare = (width == height) ? true : false;
	}
	
	// Method
	public void output() {
		System.out.println("너비 : " + width);
		System.out.println("높이 : " + height);
		System.out.println("크기 : " + calcArea());
		System.out.println("형태 : " + (isSquare ? "정사각형" : "직사각형"));
	}
	private int calcArea() {
		return width * height;
	}
	
}