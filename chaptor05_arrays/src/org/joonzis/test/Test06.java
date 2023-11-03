package org.joonzis.test;

public class Test06 {
 public static void main(String[] args) {
//	 Test05의 배열을 이용하여 배열 내 값들의 최소, 최대값을 출력
	 
//	 //최솟값이 0보다 커서 출력되지 않을 경우 int min = arr[0];
//	 				 				 int max = arr[0];
//	 
	 int[] arr = {13, 22, -3, 92, 55, 5};
	 
	 int max = 0;
	 int min = 0;
	 
	 for(int i = 0; i< arr.length; i++) {
		if(  min > arr[i]  ) {
			min = arr[i];
		}
		if(max < arr[i]) {
			max = arr[i];
		} 
	 }
		 
		 
		System.out.println("최솟값 : " + min); 
		System.out.println("최댓값 : " + max); 
		
		 
		 }
		
 }

