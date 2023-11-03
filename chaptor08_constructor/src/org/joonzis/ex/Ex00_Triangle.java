package org.joonzis.ex;

public class Ex00_Triangle {

	//필드
	int width, height;
	
	
	//생성자 메소드             - 필드 초기화 목적
	public Ex00_Triangle(){    
		width = 1;
		height = 1;
		
	}
	public Ex00_Triangle( int w, int h){            //매개변수로 전달받은 경우 
		width = w;                                   //
		height = h;
	}
	
	
	
	//추가 기능 메소드
	double calcArea() {
		return(width * height) / 2.0;
	};
	
	
	void output() {
		System.out.println("너비 : " + width);
		System.out.println("높이 : " + height);
		System.out.println("너비 : " + calcArea());
	}
	
	
	
	
	
	
	
	
	
	
	
}
