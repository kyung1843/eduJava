package org.joonzis.test;

import java.util.Calendar;

//클래스 CarMain을 정의 하시오.
//★
//Calendar calendar = Calendar.getInstance();
//calendar.get(Calendar.YEAR);	 // 현재 년도



public class CarMain {

	public static void main(String[] args) {
		
		
		Car cha = new Car();
		
		cha.setFields("아반때", "블랙", 2010);
		cha.output();
		
		System.out.println("=======================");
		
		
		Car myCar = new Car();
		
		myCar.setFields("산타페", "블랙");
		myCar.output();
		
		
		
		
		
		
		
	}
	
	
}
