package org.joonzis.test;

import java.util.Scanner;

public class Test_07 {

	
	
	public static void main(String[] args) {
		
		
		
		/*Q. 체질량 지수(BMI) = 몸무게(kg) / 키 (m) 제곱 
   				BMI 25 이상이면 "과체중", 20 이상이면 "정상", 20 미만이면 "저체중"*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("몸무게>>");
		double weight = sc.nextDouble();
		System.out.println("몸무게 : " + weight + "kg");
		
		System.out.println("키(m) >>");
		double height = sc.nextDouble();
		System.out.println("키 : " + height + "m");
		
		double bmi = weight / height; 
		System.out.println("bmi : " + bmi);
		
		String overweight = (bmi >= 25) ? "과체중" : (bmi >= 20) ? "정상" : "저체중";
		
		System.out.println("결과 : " + overweight);
		
		
		
		
		
		
		
		
//		double weight1 = 63.5;
//		double height1 = (165.7 / 100);      //단위 변환
//		
//		double bmi1 = weight1 / (height1*height1);
//		
//		System.out.println(bmi1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		}
		
		
		
		
		
	}

