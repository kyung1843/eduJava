package org.joonzis.array;

public class Array3 {
	public static void main(String[] args) {
		
		
//		배열 int[][] arr={{1, 2, 3, 4}, {5, 6, 7}, {8, 9}} 에서 각 값을 2씩 증가시키는 프로그램 작성
//		ex) 1 2 3 4 
//			5 6 7 
//			8 9 
//			
//			3 4 5 6 
//			7 8 9 
//			10 11 
//		* 배열을 전달 받아 데이터를 출력하는 메소드 = arrPrint
//		* 배열과 증가할 값을 전달 받아 해당 값만큼 증가시키는 메소드 = addTwoArr

//메소드로 풀이
//public static void addTwoArr(int[][] arr, int add)
//{
//	for(int i = 0; i < arr.length; i ++) {
//		for(int j=0; j<arr[i].length; j++) {
//			arr[i][j] += add;
//		}
//	}
//}
//
//public static void main(String[] args){		
//	//배열선언 : 비어있는 부분은 null로 초기화 된다.
//	int[][] arr = {
//		{1, 2, 3, 4},
//		{5, 6, 7},
//		{8, 9}
//	};
//	//값 증가전 출력
//	arrPrint(arr);		
//	//2만큼 증가시키는 메소드 호출
//	addTwoArr(arr, 2);
//	
//	System.out.println();
//	//증가후 출력
//	arrPrint(arr);
//}
//
////2차원 배열을 출력하기 위한 메소드
//static void arrPrint(int[][] arr) {
//	for(int i = 0; i < arr.length; i ++) {
//		for(int j = 0; j <arr[i].length; j++) {
//			System.out.print(arr[i][j] + " ");
//		}
//		System.out.println();
//	}
//	

//메소드 없이

		int[][] arr={{1, 2, 3, 4}, {5, 6, 7}, {8, 9}};

		//출력 for문
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");}
			
			System.out.println();}
		
		//증가 for문
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] += 2);}}
	
		//출력 for문
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
		} }
	}
	}
