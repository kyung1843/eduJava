package org.joonzis.ex;

public class Ex01_RectMain {
	public static void main(String[] args) {
		
		Ex01_Rect myR1 = new Ex01_Rect();
		myR1.output();
		
		System.out.println("=================");
		
		
		Ex01_Rect myR2 = new Ex01_Rect(10);
		myR2.output();
		
		
		System.out.println("=====================");
		
		Ex01_Rect myR3 = new Ex01_Rect(12, 17);
		myR3.output();
		
	}
}
