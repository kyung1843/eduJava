package org.joonzis.ex;

public class Ex04_BookMain {
	public static void main(String[] args) {
		
		
		
		Ex04_Book B1 = new Ex04_Book();
		B1.setSalesVolume(100);
		B1.output();
		
		
		Ex04_Book B2 = new Ex04_Book("이것이 자바다", 24000);
		B2.setSalesVolume(150);
		B2.output();
		
		
		Ex04_Book B3 = new Ex04_Book("이것이 자바다", 25000, "남궁현");
		B3.setSalesVolume(200);
		B3.output();

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
}
