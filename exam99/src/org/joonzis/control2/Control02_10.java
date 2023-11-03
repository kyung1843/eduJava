package org.joonzis.control2;

import java.util.Arrays;

public class Control02_10 {
	public static void main(String[] args) {
		//피보나치 수열 20개를 출력(배열 이용)
		//ex) 1, 1, 2, 3, 5, 8, 13, 21, ...
		
		int[] arr = new int[20];
		
		arr[0] = 1;
		arr[1] = 1;
		
		for(int i = 2; i <arr.length; i++) {                 //인덱스 번호 2번부터 시작; 배열 길이만큼; 
			arr[i] = arr[i - 1] + arr[i - 2];                 // 인덱스 하나 전의 값  + 인덱스 두개 전의 값
			}
		
		String result = "";
		
		for(int i : arr) {
			result += i + ", ";
			//System.out.print(i + ", ");
		}
		result = result.substring(0, result.length()-2); // 마지막 에서 ", " 제외
		System.out.println(result);
		
	}		
	}


