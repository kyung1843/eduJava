package org.joonzis.ex;

public class Ex01_RectMain {

	public static void main(String[] args) {
		
		//객체생성
		Ex01_Rect rect1 = new Ex01_Rect();
		//해당 클래스 자원(필드) 사용법
		//1.필드 초기화
//		rect1.width = 10;
//		rect1.height = 15;
		
		//1-1 private 하면 외부에서 못불러
//		rect1 = new Ex01_Rect(20, 22);
//		
		//1-2 setter.getter
		rect1.setWidth(30);
		rect1.setHeight(15);
		
		//1-3
		rect1.output();
		
		
		//출력
		System.out.println();
	}
	
}
