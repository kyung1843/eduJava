package org.joonzis.test;

import java.util.Scanner;



//Q3. 
//클래스 TriangleMain
//- 메소드  : main
//값을 입력 받아서 (Scanner) 확인 
//파일을 하나만 사용


public class TriangleMain {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);              //(system.in) : 괄호 안의 값을  던져주는 것
		Triangle myT = new Triangle();
		
		myT.init(sc);
		myT.info();
	
	}
}


class Triangle{
	
	public static Triangle semo;
	//클래스 Triangle 
	//- 필드 : width, height
	//- 메소드 : init(너비, 높이 입력), info(너비, 높이, 크기 출력), calcArea(w*h/2 넓이계산 후 리턴)
	
	
	
	double width;
	double height;
	
	
	void init(Scanner sc) {
		System.out.println("너비 입력 >>");
		width = sc.nextDouble();
		System.out.println("높이 입력 >>");
		height = sc.nextDouble();
	}
	
	
	
	
	void info () {
		System.out.println("너비 : " + width);
		System.out.println("높이 : " + height);
		System.out.println("크기 : " + calcArea());
	}
	
	double calcArea() {
		double result = (width*height)/2.0;
		return result;
	}
	
}