package org.joonzis.method;

public class Q2_PrimeNumber {
	
	
	boolean num;
	
	static boolean isPrimeNumber(int num) {
		
		if (num == 1) {
			return false;
		} else {
			for (int i = 2; i < num; i++) {
				// 1과 자기자신을 제외한 숫자로 나눠서 떨어지면 소수가 아니므로 그 이후는 검사할 필요가 없다
				// 판단되는 즉시 false를 반환하고 종료한다
				if (num % i == 0) {
					return false;
				}

			}
		}
		return false; 
	}


}
