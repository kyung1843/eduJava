package org.joonzis.ex;


public class Ex01_RecMain {

	public static void main(String[] args) {
		
		Ex01_Rect myR = new Ex01_Rect();
		
		
		myR.setFields(10, 20);
		myR.output();
		
		
		System.out.println("==================");
		
		
		Ex01_Rect nemo = new Ex01_Rect();
		
		nemo.setFields(20);
		nemo.output();

		
	}

}
