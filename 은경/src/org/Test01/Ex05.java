package org.Test01;

public class Ex05 {
//	5. 주어진 2차원 배열의 전체 합과 평균 구하기
//	int[][] arr = {
//	  {95, 86},
//	  {83, 92, 96},
//	  {78, 83, 93, 87, 88}
//	};
	public static void main(String[] args) {
		int[][] arr = {
		  {95, 86},
		  {83, 92, 96},
		  {78, 83, 93, 87, 88}
		};
		
		
		int sum = 0;
		int avg = 0;
		
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr[i].length ; j++) {                  
				sum += arr[i][j];
				avg = sum / arr[i].length;
		}
			 }System.out.println("총합 : "+sum);
			 System.out.println( "평균 : "+ avg);
		
		
		
		
		
		
		
		
	}
}
