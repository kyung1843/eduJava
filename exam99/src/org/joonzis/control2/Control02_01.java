package org.joonzis.control2;

import java.util.Scanner;

public class Control02_01 {
	public static void main(String[] args) {
//		특정 값(정수)을 입력 받아 입력 받은 값이 3의 배수인지 아닌지를 출력

		
		
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("값(정수) 입력 >>");
		int num = sc.nextInt();
		
		if(num % 3 == 0) {
			System.out.println("3의 배수 맞음");
		}else {
			System.out.println("3의 배수 아님");
		}
		
		sc.close();
	}
}
