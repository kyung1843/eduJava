package org.joonzis.test;


//클래스 RecursiveCall 을 정의하시오.
//- 필드  : X
//- 메소드 : recursive(n) -> n번 "Hello" 출력하기
//		 main
//★
//if-else 사용 - else 일 때 재귀 호출


public class RecursiveCall {

	private static void recursive(int n) {          //재귀호출
		
		if(n == 0) {
			return;
		}else {System.out.println("Hello");
				recursive(n - 1);
		}
		
		
		
	}
	
	public static void main(String[] args) {
		
		recursive(5);
	}
	
	
	
	
	
	
	
	
}
