package org.joonzis.test;

import java.util.Scanner;

public class RectMain {
	public static void main(String[] args) {
		
		Rect myRect = new Rect();
		
		myRect.init();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("너비 입력 >>");
		myRect.width = sc.nextDouble();
		
		System.out.println("높이 입력 >>");
		myRect.height = sc.nextDouble();
		
		
		myRect.info();

		
		
		
		
		
//		
//		Rect nemo = new Rect();
//		
//		nemo.init();
//		nemo.info();
//		
		
		
		
		
		
		
		
		
		
		
		
	}
}
