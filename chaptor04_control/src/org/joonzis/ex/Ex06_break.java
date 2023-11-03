package org.joonzis.ex;

import java.util.Scanner;

public class Ex06_break {
	public static void main(String[] args) {
		/*
		 * 1. 형식
		 * 
		 * 		while(true){
		 * 			if(조건식){
		 * 			 	break;
		 * 			}
		 * 		}
		 * 2. 특징
		 * 	1) 반복문을 곧바로 종료한다.
		 * 	2) switch 문을 곧바로 종료한다.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		while(true){
			System.out.println("ID를 입력해주세요");
			String id = sc.nextLine();
			
			// id가 admin이면 "ID 일치" 출력 후 반복문 종료
			// 일치하지 않으면 "다시 입력하세요" 출력
			
			if(id.equals("admin")) {
				System.out.println("ID 일치");
				break;
			}else {
				System.out.println("다시 입력하세요");
			}
		}
		sc.close();
		
	}
}
