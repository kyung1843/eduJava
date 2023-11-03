package org.joonzis.test;

import java.util.Scanner;

public class Test_03 {
	public static void main(String[] args) {
		
		//Q. 매출액과 등급("VIP", "일반")을 입력받아 등급이 "VIP"이면 매출액에서 20%를 할인하고
		   //"일반"이면 매출액에서 5%를 할인하는 프로그램 구현 
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("등급>>");
//		String grade = sc.nextLine();
//		System.out.println("등급 : " + grade);
//		
//		System.out.println("매출액>>");
//		int revenue = sc.nextInt();
//		System.out.println("매출액 : " + revenue);
//		
//		int result = (grade.equalsIgnoreCase("일반")) ? (int)(revenue * 0.5) : (int)(revenue * 0.8);
//		System.out.println("할인된 금액 : " + result + "원");
		
		
		
		  int p = 10;            // 매출액 변수
		  String g = "vip";      //등급 변수 
		  
		 int result =  g.equals("vip") ? (int)(p * 0.8) :  (int)(p * 0.95); 
		 
		
		//equalsignorecase  : 대소문자 상관 없이 인식 "vip","VIP" 어덯게 쳐도 인식한다
		
		System.out.println(result);
		
	}
}
