package org.Test01;

public class Ex03 {
	public static void main(String[] args) {
		// 1+(1+2)+(1+2+3)+(1+2+3+4)+...(1+2+3+...+10)의 결과를 출력

		for (int i = 0; i < 11; i++) {
			int sum = 0;
			
			
			for (i = 1; i <= 10; i++) {
				for (int j = 1; j <= i; j++) {
					sum += j;	
				}
				System.out.println();
			}
			System.out.println("sum=" + sum);
		}

	}
}
