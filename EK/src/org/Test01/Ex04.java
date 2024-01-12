package org.Test01;

public class Ex04 {
	// 4. 배열 2, 7, 3, 8, 5 값 중에 최대값 출력
	public static void main(String[] args) {
		int[] arr = {2,7,3,8,5};
		
		int max = arr[0];
		
		for(int i=0; i<arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
			
			
		}
		
		System.out.println("최대 : " + max);
	}
}
