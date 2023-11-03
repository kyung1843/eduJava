package org.joonzis.ex;

import java.util.Scanner;

public class Ex02_for_each {
	public static void main(String[] args) {
		
		/*
		// 배열에 값 저장 방법
		// 1. 개별적으로 한 개씩 넣는다(추천 x)
		arr[0] = sc.nextInt();
		arr[1] = sc.nextInt();
		arr[2] = sc.nextInt();
		
		// 2. 반복문 이용(추천)
		for(int i=0; i<arr.length; i++) {
			System.out.print(i + "번 인덱스 입력 >> ");
			arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		// for-each문(향상 for문)
		for(int num : arr) {			// arr 배열의 각 요소를 num이라는 변수로 전달해서 처리
			System.out.println(num);	// 위에서 입력받은 arr가 순차적으로 num으로 넘어옴
		}
		*/
		
		
		Scanner sc = new Scanner(System.in);  //스캐너 객체 생성
		
		//정수형 크기 3짜리  배열 arr 선언
		int[] arr = new int[3];  //배열 생성
		
		//배열에 값 저장 방법
		//1.개별적으로 한 개씩 삽입(추천X)
//		arr[0] = sc.nextInt();
//		arr[1] = sc.nextInt();
//		arr[2] = sc.nextInt();
		
		//2.반복문 이용(추천!)
		for(int i = 0; i<arr.length; i++) {
			System.out.println(i + "번 인덱스 값 입력 >>");
			arr[i] = sc.nextInt();
		}
		
		
		//배열의 전체 인덱스를 접근할 때
		//무조건 고정
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
		//for-each문(항상 for문)
		for(int num : arr) {	                 //arr 배열의 각 요소를 num이라는 변수로 전달받아 처리
			System.out.println(num);             //위에서 입력받은 arr이 순차적으로 num으로 넘어옴
		}
		
		//주의사항
		int[] arr2 = new int[3];
		//1.for-each문을 통한 입력
		//기본 자료형의 배열은 for-each문으로 수정X
		//배열에 직접 접근하지 않고, 배열 요소의 값을 다른 변수로 받아서 처리하기 때문
		for(int num : arr2) {
			System.out.println("입력>>");
			num = sc.nextInt();}
		
		for(int num : arr2) {
			System.out.println(num);}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
