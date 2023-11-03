package org.joonzis.ex;

public class Ex01_Variable {
	
	int bb = 10;
	
	public static void main(String[] args) {
		
		// 1. 변수 선언 ( 선언과 초기화 동시에 진행 )
		int num1 = 0;
		float num2 = 0f;
		double num3 = 0;
		char ch = 0;	// ??
		char ch2 = 'a';
		int ch3 = 'a';
		//String str = 0;		// 에러
		String str1 = null;		// null : 0번지(주소의 초기화를 0으로 하겠다)
		String str2 = "";		// "" : 빈 문자열
		
		// 2. 다른 값 대입
		num1 = 100;
		num2 = 1.5f;
		num3 = 1.5;
		ch = '한';
		str1 = "Hello";
		str2 = "Java";
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(ch);
		System.out.println(str1);
		System.out.println(str2);
		
		// 3. 스코프 ( 범위 )
		// 	1) 지역 변수 : 코드블록{} 내에서만 접근이 가능, 벗어나면 소멸
		//	2) 전역 변수 : 모든 지역에서 사용 가능
		
		{
			int a = 10;
			System.out.println("코드 블록 내의 a = " + a);
		}
		
		// 39라인에서 이미 a 변수가 소멸되었기 때문에 아래처럼 접근이 불가
		//System.out.println("코드 블록 밖의 a = " + a);
		
		
		
		
		
		
		
	}
}
