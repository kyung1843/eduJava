package org.joonzis.ex;

import java.util.Scanner;

public class Ex01_exception {	
	public static void main(String[] args) {
		/*ArithmeticException
		 * 정수를 0으로 나눌 경우 예외 발생*/
		
		Scanner sc = new Scanner(System.in);
		
		try {System.out.println("첫번째 정수 입력 >>");  //10
		int num1 = sc.nextShort();
		
		System.out.println("두번째 정수 입력 >>");  //0 입력시
		int num2 = sc.nextInt();
		
		System.out.println("덧셈 결과 : " + (num1 + num2));
		System.out.println("뺄셈 결과 : " + (num1 - num2));
		System.out.println("곱셈 결과 : " + (num1 * num2));
		System.out.println("나눗셈 결과 : " + (num1 / num2));  //해당 위치에 예외 발생
			
		}catch (ArithmeticException e) {   //Exception e 넣어도 된다
//			System.out.println("0으로 나눌 수 없습니다");
			e.printStackTrace();  //에러코드 확인 위한 메소드
		}finally {
			//예외발생하거나 발생하지 않거나 무조건 실행되는 영역
			//예외발새여부에 상관없이 무조건 실행
			sc.close();
		}
		
		
		
		
		
		
		
	}

}
