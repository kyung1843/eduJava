package org.joonzis.test4;

public class Coordinate {
	int x, y;
	
	public Coordinate() {
		
	}
	
	
	
	public Coordinate(int _x, int _y) {
		x = _x;
		y = _y;
	}
	
	
	
	void output() {
		System.out.println(" 좌표 : " + x +',' +  y);
	}
	
	
}
