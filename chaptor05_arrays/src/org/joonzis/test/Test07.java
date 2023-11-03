package org.joonzis.test;

import java.util.Arrays;
import java.util.Scanner;

public class Test07 {
 public static void main(String[] args) {
//	 길이가 10인 int형 배열 선언 후, 사용자로부터 콘솔입력 받아 값을 저장한 뒤
//		배열에 있는 정수 중에서 3의 배수만 출력해보자. 
	 
	 int[] arr = new int[10];
	 
	 Scanner sc = new Scanner(System.in);
	 
	 for(int i = 0; i<arr.length; i++) {
		 System.out.println(i + "번 인덱스 값");
		 arr[i] = sc.nextInt();
		 	}
	 	System.out.println(Arrays.toString(arr));
	 	
 
 	for(int i = 0; i<arr.length; i++) {
	 if(arr[i] % 3 == 0) {
		 System.out.println(arr[i]);
	 }
 	
 
 	}
 	
 	sc.close();
 }
}

 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 

