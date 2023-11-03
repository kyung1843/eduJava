package org.joonzis.ex;

public class Ex02_Triangle {

	
	int widht, height;
	
	public Ex02_Triangle() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Ex02_Triangle(int side) {
		//생성자 리팩토링(호출) - 거의 안씀
		this(side,side);
		
//		this.height = side;
//		this.widht = side;
		
	}
	
	
	public Ex02_Triangle(int width, int height) {
		this.widht = width;
		this.height = height;
		
	}
}
