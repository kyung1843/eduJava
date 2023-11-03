
package org.joonzis.control2;

public class Control02_08 {
	public static void main(String[] args) {
		/*배열 arr에 담긴 모든 값을 더하는 프로그램을 완성하시오*/
	
		
		int[][] arr = {
			{5, 5, 5, 5, 5},                        //arr.length  : 4
			{10, 10, 10, 10, 10},                    //arr[i].length : 5
			{20, 20, 20, 20, 20},
			{30, 30, 30, 30, 30}
			};
		
		int sum = 0;
		for(int i =0; i < arr.length; i++) {
			for(int j = 0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + "" + "\t");
				sum += arr[i][j];
			}   
				System.out.println();
		}
		
	System.out.println("배열 arr의 총합 : " + sum);
		
		
		
		
		
	}
}
