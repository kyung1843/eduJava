package org.joonzis.test;

import java.util.Scanner;

public class Test08 {
	public static void main(String[] args) {
//		성적 관리 프로그램 
//		5명의 int형 점수를 저장하는 scores 배열을 선언하고, 점수를 입력받아 최대, 최소, 평균 점수를 출력하기
//		String형 배열 names를 선언하고, 학생 5명의 이름을 초기화 한 뒤 활용
//		실행 예)
//		바트의 점수 입력 >> 70
//		리사의 점수 입력 >> 100
		
		
		//1.크기 5짜리 문자열 배열 names에 학생 이름 넣어서 초기화
		String[] names = {"a","b","c","d","e"};
		//2.크기 5짜리 정수형 배열 scores 선언
		int[] scores = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		
		//3.scores에 점수 입력 for문
		for(int i = 0; i<scores.length; i++) {
			System.out.println(names[i] + "의 점수 입력>>");
			scores[i] = sc.nextInt();}
			
			
			//연산 및 출력 for문(scores의 최소, 최대, 평균 구하기)	
			int min = scores[0];           //비교할 때 '변수[]'!!
			int max = scores[0];
			double avg = 0;
			int sum = 0;
			
			for(int i = 0; i < scores.length; i++) {
				if(min > scores[i]) {
					min = scores[i];
				}
				if(max < scores[i]) {
					max = scores[i];
				}
				
				
				sum += scores[i];
				avg = (double)sum / scores.length;
			}
			System.out.println("평균 : " + avg);
			System.out.println("최솟값 : " + min);
			System.out.println("최댓값 : " + max);
			
		
		
		
		
		
		
			
			
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
