package org.joonzis.test1;

import java.util.Calendar;

public class Car {

	String model, color;
	int year;
	boolean isNewCar;
	
	
	public Car(String m, String c) {
		model = m;
		color = c;
		Calendar calendar = Calendar.getInstance();
		calendar.get(Calendar.YEAR);
		
		
	}

	public Car(String m, String c, int y) {
		model = m;
		color = c;
		year = y;
		
	}
	
	void output() {
		System.out.println("차종 : " + model);
		System.out.println("색상 : " + color);
		System.out.println("연식 : " + year);
		System.out.println(isNewCar? "신차" : "구형");
	}
	
	
}
