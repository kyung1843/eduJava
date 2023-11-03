package org.joonzis.control2;

import java.util.Scanner;

public class Control02_04 {
	public static void main(String[] args) {
//		 4개의 과목 성적을 입력하여 평균이 60점 미만이면 과락, 60점 이상이면 합격을 출력
//			* 배열을 이용
		int[] arr = new int[4];
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		double avg = 0;
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println((i+1) + "번째 성적 입력 >>");
			 arr[i] = sc.nextInt();
			 
			 sum += arr[i];
			 avg = sum /arr.length;
			 
		}System.out.println(avg);
		
		if(avg >= 60) {
			System.out.println("합격");
		}else {
			System.out.println("과락");
		}
		
		
		
		
		
		
		
		
		
		
	}
}
