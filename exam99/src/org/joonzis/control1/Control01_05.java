package org.joonzis.control1;

public class Control01_05 {

	public static void main(String[] args) {
		// 1부터 100까지 수 중에 3의 배수이거나 7의 배수인 수의 합을 출력
		//* 3과 7의 공배수는 계산에서 제외
		
		//나
		
//		int sum = 0;
//		
//		for(int i = 1; i <= 100; i++) {
//			if(i% 3 == 0) {
//				System.out.println(i);
//			}if(i % 7 == 0) {
//				System.out.println(i);
//			} if(i% 3 == 0 && i % 7 == 0) {
//				continue;
//			} sum += i;}
//		System.out.println(sum);
		
		
		//강사님
		
//		int sum = 0;
//		
//		for(int i = 1; i<=100; i++) {
//			if(i % 3 == 0 || i % 7 == 0) {
//				if(i % (3 * 7) != 0) {
//					sum += i;
//					System.out.print(i+" ");
//				}
//			}
//		}
//		System.out.println("\n총 합 : " + sum);
		
		
		
		

		
		//
		int start = 1;
		int end = 100;
		int sum1 = 0;
		
		for(int i = start; i <= end; i++) {
			if(i%3==0 || i%7 ==0) {
				if(i % (3*7) != 0) {
					sum1 += i;
				}
			}
		}
		
		
		
		
			}
		
	}

