package org.joonzis.control1;

public class Control01_04 {

	public static void main(String[] args) {
		// num이라는 변수에 120이라는 숫자를 초기화 한 후에 이 숫자가 
		//양수인지, 음수인지, 짝수인지, 홀수인지 출력
		
		//단편적 데이터 출력
		int num = 120;
		
		if(num  > 0) {
			System.out.println("양수");
		}else if(num < 0){System.out.println("음수");}
		
		else if(num % 2 ==1) {
			System.out.println("홀수");
		}else {System.out.println("짝수");}
		
		System.out.println(num);
		
		
		
		//다중 데이터 출력(묶음 나누기)
//		int num = 120;
//		
//		if(num  > 0) {
//			System.out.println("양수");
//		}else {System.out.println("음수");}
//		
//		if(num % 2 ==1) {
//			System.out.println("홀수");
//		}else {System.out.println("짝수");}
//		
//		System.out.println(num);
		
		
		
		//다중 데이터 출력(논리식)
//		int num = 120;
//		
//		if(num > 0 && num % 2 == 0) {System.out.println("양수 이면서 짝수");}
//		else if(num > 0 && num % 2 == 1) {System.out.println("양수 이면서 홀수");}
//		else if(num < 0 && num % 2 == 0) {System.out.println("음수 이면서 짝수");}
//		else{System.out.println("음수 이면서 홀수");}
	}

}
