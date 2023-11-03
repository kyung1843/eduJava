package org.joonzis.control2;

public class Control02_06 {
	public static void main(String[] args) {
		// 두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램을 작성하시오

		int[] arr = {1,2,3,4,5,6};       //첫번째 주사위
		int[] arr1 = {1,2,3,4,5,6};       //두번째 주사위
		
		for(int i = 0; i <arr.length; i++) {
			for(int j = 0; j < arr1.length; j++ ) {
				if(i + j == 6) {
					System.out.print("(" + i + "/" + j + ")");
				}
			}
		}
		
		for(int i=1; i<=6; i++) {
			for(int j=1; j<=6; j++) {
				if(i+j==6) {
					System.out.print("(" + i + "," + j + ")");
				}
			}
		}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	}


//주사위 {1 2 3 4 5 6}{1 2 3 4 5 6}