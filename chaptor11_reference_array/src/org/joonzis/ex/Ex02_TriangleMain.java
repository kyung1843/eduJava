package org.joonzis.ex;

import java.util.Scanner;

public class Ex02_TriangleMain {
	public static void main(String[] args) {
		
		//크기3의 참조(Ex02_Triangle.java) 배열 arr 선언	
		//반복문 이용해 객체 생성과 동시에 값을 초기화 시킨다(스캐너 사용)
		//반복문 이용해 각 인덱스에 들어가져 있는 값 출력
		
		
		Ex02_Triangle[] arr = new Ex02_Triangle[3];
		
	
		//입력for문
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < arr.length; i++) {
			//초기화 방법(생성자)
			System.out.println("너비 입력 >>");
			int width = sc.nextInt();
			System.out.println("높이 입력 >>");
			int height = sc.nextInt();
			
			arr[i] = new Ex02_Triangle(width, height);
			
		}  sc.close();
		
		//출력for문
		for(int i = 0; i< arr.length; i++) {
			System.out.println((i + 1) + "번 삼각형 ---");
			
		}
		
	
		
		
		
		
		
		
		
		
		
		
		
	}

}
