package org.Test01;

public class Ex06 {
	public static void main(String[] args) {
		int num1 = 1;
		int num2 = 1;
		int count= 0;
		for (int i=0; i<18; i++) {	
			count = num1 + num2;
			num1 = num2;
			num2 = count;

		}
		System.out.println("피보나치수열의 20번째 수 : " + count);
	}
}
