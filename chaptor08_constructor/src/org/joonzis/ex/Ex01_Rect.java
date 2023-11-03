package org.joonzis.ex;

public class Ex01_Rect {
	// 필드
	int width, height;
	boolean isSquare;

	// 메소드
	public Ex01_Rect() {
		width = 1;
		height = 1;
		isSquare = true;
	}


	public Ex01_Rect(int side) {

		width = side;
		height = side;

		isSquare = true;

	}
	
	
	public Ex01_Rect(int w, int h) {
		width = w;
		height = h;
		
		if (w == h) {
			isSquare = true;
		}
	}

	double calcArea() {
		return (width * height);
	}

	void output() {
		System.out.println("너비 : " + width);
		System.out.println("높이 : " + height);
		System.out.println("크기 : " + calcArea());
		System.out.println(isSquare ? "정사각형" : "직사각형");
	}

}
