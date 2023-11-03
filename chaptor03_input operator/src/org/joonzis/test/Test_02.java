package org.joonzis.test;

import java.util.Scanner;

public class Test_02 {

	public static void main(String[] args) {
		
		
		//Q. 나이를 입력받아 "성인" 또는 "미성년자" 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이 입력>>");
		int age = sc.nextInt();
		
		String isAdultStr = (age >= 20) ? "성인" : "미성년자";
		/*boolean isAdult = (age >= 20) ? true : false;
		String result = (isAdult) ? "성인" : "미성년자";*/
		System.out.println(isAdultStr);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
