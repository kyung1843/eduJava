package org.joonzis.test4;

public class Circle {
	
	
	Coordinate center; 
	double radius;
	
	public Circle(double r , Coordinate c) {
		radius = r;
		center = c;
		
		
		
		
	}
	
	void output() {
		System.out.println("반지름 : " + radius);
		center.output();
	}

	
}
