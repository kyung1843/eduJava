package org.joonzis.ex;

public class Ex02_exception {	
	public static void main(String[] args) {
		
		/*ArrayIndexOutOfBoundsException
		 * 배열에서 인덱스 범위를 벗어난 경우 예외 발생*/
		
		int[] arr = new int[3];
		
		try {
			
			arr[1] = 1;
			arr[2] = 2;
			arr[3] = 3; //예외 발생 위치
		
		for(int i : arr) {
			System.out.println(i);
		}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스 가용 범위를 벗어났습니다");
		}
		
		
				
		//위 상황에서 예외 발생 위치 주석으로 달기
		//예외 처리하기 위한 try-catch 영역 잡기
		//예외 발생시 "인덱스 가용 범위를 벗어났습니다" 출력
		
		
	
	}}


