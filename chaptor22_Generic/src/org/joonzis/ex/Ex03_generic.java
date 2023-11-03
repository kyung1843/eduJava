package org.joonzis.ex;

import java.util.Arrays;

public class Ex03_generic {
	
	//제네릭 메소드
	static <T> void printArray(T[] arr) {
		System.out.println(Arrays.toString(arr));
	}
//	static void printArray(Double[] arr) {    //메소드 오버로딩
//		System.out.println(Arrays.toString(arr));
//	}
	
	
	
	public static void main(String[] args) {
		//정수형 배열
		Integer[] arr1 = {1,2,3,4,5};
		printArray(arr1);
		
		//실수형 배열
		Double[] arr2 = {1.4, 2.4, 3.5};
		printArray(arr2);
		
		//문자열 배열
		String[] arr3 = {"hello", "java", "world"};
		printArray(arr3);
		
	}
}
