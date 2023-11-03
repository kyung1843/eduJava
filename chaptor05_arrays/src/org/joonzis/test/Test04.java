package org.joonzis.test;

import java.util.Scanner;

public class Test04 {
 public static void main(String[] args) {
//	 길이가 5인 int형 배열 선언 후, 사용자로부터 콘솔입력 받아 해당 데이터 값을 모두 더해서 합을 출력하기
	 
	 int[] arr = new int[5];
	 int total = 0;
	 
	 Scanner sc = new Scanner(System.in);
	 
	 for(int i = 0; i<arr.length; i++) {
		 System.out.println("데이터를 입력하세요>>");
		 arr[i] = sc.nextInt();
		 total = total += arr[i];
		 }System.out.println("총합 : " + total);
	 	
		 
		 //
	 	int[] arr1 = new int[5];
	 	int total1 = 0;
	 
		 Scanner sc1= new Scanner(System.in);
		 
		 
		 arr1[0] = sc1.nextInt();		 
		 arr1[1] = sc1.nextInt();		 		 
		 arr1[2] = sc1.nextInt();		 
		 arr1[3] = sc1.nextInt();		 
		 arr1[4] = sc1.nextInt();		 
		 
		 
		 
		 for(int i =0; i<arr1.length; i++) {
			 System.out.println(i + "번 인덱스에 입력하 값 >>");
			 arr1[i] = sc1.nextInt();
			 total1 += arr1[i];
		 }
		  System.out.println(total1);
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}

