package org.joonzis.test;

import java.util.Calendar;

//클래스 Car 를 정의하시오.
//- 필드 : String model,String color, int year
//- 메소드 : setFields(model, color) : 올해를 year로 처리, 
//		 setFields(model, color, year),
//		 output()

public class Car {

	//필드
	String model;         //참조타입의 기본값 = null값이어서 값을 넣어 줘야 한다
	String color;
	int year;
	
	
	//메소드
	
	void setFields(String _model, String color) {        //참조타입의 기본값 = null값이어서 값을 넣어 줘야 
		model = _model;
		this.color = color;
		
		Calendar calendar = Calendar.getInstance();
		
		year = calendar.get(Calendar.YEAR);         //현재년도
	}
	
	
	void setFields(String _model, String color, int year) {     //참조타입의 기본값 = null값이어서 값을 넣어 줘야 
		setFields(_model, color);
		this.year = year; 
	}
	
	void output() {
		System.out.println("모델명 : " + model);
		System.out.println("색상 : " + color);
		System.out.println("연식 : " + year);
	}
	
	
	
	
	
	
	
	
	
}
