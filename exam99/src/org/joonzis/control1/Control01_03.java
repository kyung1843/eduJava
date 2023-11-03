package org.joonzis.control1;

import java.util.Scanner;

public class Control01_03 {

	public static void main(String[] args) {
		// 사용자에게 값을 입력받은 후 그 값이 숫자인지 아닌지를 출력
		//* 아스키 코드표 참고 48~57 : 숫자
		
		
		
		//나 : 문자타입
//		Scanner sc = new Scanner(System.in);
//		
//		
//		System.out.println("값 입력 >>");
//		char num = (char)sc.nextInt(); 
//		
//		if(num  >= '0' &&  num <= '9') {
//			System.out.println("숫자O");
//		}else {System.out.println("숫자X");}
//		
		
		//강사님 : 정수타입 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("값 입력 >> ");
		int val = sc.nextInt();
		
		if(val >= 48 && val <=57) {
			System.out.println("숫자 입니다.");
		}else {
			System.out.println("숫자가 아닙니다.");
		}
		
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("값 입력 >> ");
//		char ch = sc.next().charAt(0);         //charAt : String타입 char로 변경
//		
//		if(ch >= 48 && ch <=57) {
//			System.out.println("숫자 입니다.");
//		}else {
//			System.out.println("숫자가 아닙니다.");
//		}
		
		

	}

}
