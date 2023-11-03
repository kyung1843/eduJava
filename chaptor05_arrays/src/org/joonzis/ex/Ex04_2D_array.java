package org.joonzis.ex;


public class Ex04_2D_array {
	public static void main(String[] args) {
		/*고정형 2차원 배열
		 * 1. 행과 열이 고정되어 있는 2차원 배열
		 * 2. 선언방법
		 * 		int[][] arr = new int[3][4];       //3행4열
		 * 3. 초기화 방법                     0 1 2 3   0 1 2 3   0 1  2  3
		 * 		int[][] arr = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}};        //1,2 = 7
		 * 		                               0        1          2
		 * 
		 * int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12}}; 
		 * //arr.length  : 배열 길이
			arr[0].length : 0번째 줄의 배열 개수
		 * */
		
		//2행 3열 정수형 배열 arr 작성
		int [][] arr = {{1,2,3},{4,5,6}};
		
		
		//i :행  j:열
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j<arr[i].length ; j++) {                      //모르게ㅆ으면 암기
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		
		//arr.length  : 배열 길이({}의 개수)
		//arr[0].length : 0번째 줄의 배열 개수({} 속 인덱스 개수)
		
		
		int [][] arr1 = {{1,2,3},{4,5,6}};
		int total = 0;
		
		for(int i = 0; i<arr1.length; i++) {
			for(int j = 0; j<arr1[i].length ; j++) {                  
				System.out.println(arr1[i][j] + " ");
				total += arr[i][j];
		}
			System.out.println(total); }
		
		
		
		
		
		
		
		
		
	}			
}
