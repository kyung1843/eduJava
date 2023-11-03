package org.joonzis.test;

import java.util.Scanner;

//클래스 Rect
//- 필드 : width, height
//- 메소드 : init(너비, 높이 입력), info(너비, 높이, 크기(calcArea) 출력), 
//calcArea(w*h, 넓이계산(크기) 출력)
//클래스 RectMain
//- 메소드 : main
//값을 입력 받아서 (Scanner) 확인


public class Rect {
	//필드
	double width;
	double height;
	
	
	//메소드
	void init(){                                   //변수 값 초기화(데이터 입력) 하는 메소드
		System.out.println("너비 입력 >>");
		System.out.println("높이 입력 >>");
	}
	
	
	void info() {
		System.out.println("너비 : " + width);        //출력 메소드
		System.out.println("높이 : " + height);
		calcArea(); }
		
	void calcArea() {
		System.out.println("너비 : " + width*height);
	}	
		
//	Scanner sc;
//	
//	double width;
//	double height;
//	double calcArea;
//	
//	void init(){
//		sc = new Scanner(System.in);
//		
//		System.out.println("너비 입력>> ");
//		width = sc.nextDouble();
//		System.out.println("높이 입력>>");
//		height = sc.nextDouble();
//		
//	}
//	
//	void calcArea() {
//		System.out.println("크기 : " + width*height);
//	}	
//	
//	void info() {
//		System.out.println("너비 : " + width);
//		System.out.println("높이 : " + height);
//		calcArea();}
//	
	
	
	
	
	
	
	
//	double width, height;
//	
//	void init() {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("너비입력 >>");
//		width = sc.nextDouble();
//		System.out.println("높이입력 >>");
//		height = sc.nextDouble();
//		
//	}
//	
//	void info() {
//	
//		System.out.println("너비 : " + width);
//		System.out.println("높이 : " + height);
//		calcArea();
//	}
//	
//	
//	void calcArea() {
//		System.out.println("크기 : " + width*height);
//	}
//	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	
	
	
	
