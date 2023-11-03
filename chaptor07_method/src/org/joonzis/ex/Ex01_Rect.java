package org.joonzis.ex;

public class Ex01_Rect {

	int width;                   //너비
	int height;                  //높이
	boolean isSquare;            //정사각형 : true, 직사각형 : false
	
	//메소드
	//너비 높이 입력 메소드
	void setFields(int w, int h) {      //myR
		width = w;
		height = h;
		
		if(w ==h) {
			isSquare = true;
		}
	}
	void setFields(int side) {           //nemo
		width = side;
		height = side;
		isSquare = true;
	}
	
	
	
	
	//사각형 크기를 구하여 리턴하는 메소드
	int calcArea() {
		return width*height;
	}
		
		
		
		
	//데이터 출력 메소드
	void output() {
			System.out.println("너비 : " + width);
			System.out.println("높이 : " + height);
			System.out.println("크기 : " + calcArea());
			System.out.println(isSquare ? "정사각형" : "직사각형");
		}
		
		
		
		
		
		
		
		
}
