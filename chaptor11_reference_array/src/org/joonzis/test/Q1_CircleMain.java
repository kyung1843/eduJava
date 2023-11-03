package org.joonzis.test;

import java.util.Scanner;

//Circle 3개 생성 (반지름 입력 받아서 처리), 가장 크기가 큰 Circle 출력
////★                         *Circle 배열 circles 생성해서 사용
public class Q1_CircleMain {
	public static void main(String[] args) {
		
		//Circle객체를 담을 배열
		Q1_Circle[] circle = new Q1_Circle[3];
		
		Scanner sc = new Scanner(System.in);
		
		//반지름 입력
		System.out.println("첫번째 반지름 입력>>");
		double r1 = sc.nextDouble();
		System.out.println("두번째 반지름 입력>>");
		double r2 = sc.nextDouble();
		System.out.println("세번째 반지름 입력>>");
		double r3 = sc.nextDouble();
		
		
		
		//Circle 객체 생성
		Q1_Circle  c1 = new Q1_Circle(r1);
		Q1_Circle  c2 = new Q1_Circle(r2);
		Q1_Circle  c3 = new Q1_Circle(r3);
		
		//Circle 객체 배열에 대입
		circle[0] =c1;
		circle[1] =c2;
		circle[2] =c3;
		//세 원의 반지름,크기 출력		
		circle[0].output();
		circle[1].output();
		circle[2].output();
		
		
		//원의 크기 / 반지름 으로 비교할지 결정
		
		double maxArea = circle[0].calcArea();
		int idx = 0;
		
		
		for(int i = 0; i < circle.length; i++) {
			
			if(circle[i].calcArea() < maxArea) {
				maxArea = circle[i].calcArea();
				idx = i;
			}
			
		}
		System.out.println("가장 큰 원의 인덱스 번호 : " + idx );
		System.out.println("가장 큰 원의 크기 : " + maxArea);
			
		System.out.println("가장 크기 원의 정보(반지름 & 크기)");		//3
		circle[idx].output();
		
		// 가장 크기가 큰 Circle 출력
		
		sc.close();	

			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
