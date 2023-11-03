package org.joonzis.test4;

public class CoordinteCircleRingMain {

	public static void main(String[] args) {
		
		//안쪽 원
		Coordinate myC = new Coordinate(10, 20);
		
		Circle c1 = new Circle(20, myC);
		
		//바깥쪽 원 
		Circle c2 = new Circle(21, myC);
		
		Ring r1 = new Ring(c1, c2);
		r1.output();
		
		
		
		
		
		
		
		
		
		
	}
}
