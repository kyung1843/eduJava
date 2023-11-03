package org.joonzis.Class02;

public class MainClass {

	public static void main(String[] args) {
		DataClass dc = new DataClass();
		
		System.out.println(dc.ic[0].press);
		
		//1.전체 책의 값의 합 출력
		//2.전체 도서 정보 중 출판사가 '길벗'인 책 출력
		//3.전체 도서 정보 중 출판사가 '길벗'을 포함하는 경우
		int sum = 0;
		for(int i = 0; i < dc.ic.length; i++) {
			sum +=dc.ic[i].price;
		}
		System.out.println("전체 책의 값의 합 : " + sum);
		
		System.out.println("===================================");
		
		for(int i = 0; i < dc.ic.length; i++) {
			if(dc.ic[i].press.equals("길벗")) {
				System.out.println("출판사가 길벗인 책 : " + dc.ic[i].title);
			}
		}
		
		
		System.out.println("===================================");
		
		for(int i = 0; i<dc.ic.length; i++) {
			if(dc.ic[i].press.contains("길벗")) {
				System.out.println("길벗이 포함된 출판사 책 : " + dc.ic[i].title);
			}
		}
				
	}
	
}
