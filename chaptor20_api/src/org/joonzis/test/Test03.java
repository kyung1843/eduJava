package org.joonzis.test;
//Coordinate 클래스				필드 : int x, int y;
//메소드 : Constructor, equals()							
//Circle 클래스					필드 : Coordinate center, double radius	
//메소드 : Constructor, equals()	
//new Circle(0, 0, 1.5) // 중심 좌표[0,0], 반지름 : 1.5				
class Coordinate{
	//field
	int x,y;
	
	//method
	public Coordinate() {
		// TODO Auto-generated constructor stub
	}

	public Coordinate(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof Coordinate) {
			Coordinate coor = (Coordinate)obj;
			return x == coor.x && y == coor.y;
			
			}else {
				return false;
			}
		}
		
	}
	
	


class Circle{
	//field
	Coordinate center;
	double radius;
	
	//method

//	public Circle(Coordinate center, double radius) {
//		this.center = center;
//		this.radius = radius;
//	}
	
	public Circle(int x, int y, double radius) {
		this.center = new Coordinate(x,y);
		this.radius = radius;
	}


	@Override
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof Circle) {
			Circle c1 = (Circle)obj;
			return center.equals(c1.center) && (radius == c1.radius); 
			}else {
				return false;
			}
		
	}
	
	
	
}

public class Test03 {
	public static void main(String[] args) {
		
//		Circle cir = new Circle(new Coordinate(0,0), 1.5);  //클래스를 받을땐 객체 만들어서 매개변수안에 넣어
//		Circle cir1 = new Circle(new Coordinate(0,0), 1.5);
		
		Circle cir = new Circle(0, 0, 1.5);
		Circle cir1 = new Circle(0, 0, 1.5);
		
		
		if(cir.equals(cir1)) {
			System.out.println("같은 객체다");
			
		}else {
			System.out.println("다른 객체다");
		}
		
		
	}
}
