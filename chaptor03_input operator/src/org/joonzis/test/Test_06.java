package org.joonzis.test;

import java.util.Scanner;


public class Test_06 {
	
	public static void main(String[] args) {
		
		
		/*Q. 섭씨 화씨 변환기
      섭씨를 입력하면 변환된 화씨, 화씨를 입력하면 변환된 섭씨 출력하기
		★화씨 = 섭씨 * 1.8 +32
  		섭씨 = (화씨 -32) / 1.8*/
		
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("섭씨>>");		
//		double celcius = sc.nextDouble();
//		System.out.println("화씨 : " + (celcius * 1.8 + 32));
//		
//		System.out.println("화씨>>");		
//		double fahrenheit = sc.nextDouble();
//		System.out.println("섭씨 : " + (fahrenheit - 32) / 1.8);
		
		
		
		double c = 100;
		double f = c * 1.8 + 32;
		System.out.println("변화된 화씨 : " + f );
		
		double f1 = 200;
		double c1 = (f1 - 32) / 1.8;
		System.out.println("변화된 화씨 : " + f1 );
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
