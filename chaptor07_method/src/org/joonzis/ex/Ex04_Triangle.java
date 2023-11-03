package org.joonzis.ex;

public class Ex04_Triangle {
	
	int width;
	int height;
	
	void setFields(int w , int h) {
		width = w;
		height = h;
	}
	
	
	//아래 두 clacArea 메소드가 오버로딩(매개변수의 수,순서,타입에 따라) 되지 않는 이유 = 매개변수가 다르지 않기 때문에(리턴타입은 중요하지 않다)
	//일부러 오류
	int calcArea() {
		return width * height / 2;
	}
	
	
	double calcArea() {
		return width * height / 2.0;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
