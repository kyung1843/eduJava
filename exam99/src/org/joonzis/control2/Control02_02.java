package org.joonzis.control2;

public class Control02_02 {
	public static void main(String[] args) {
		//1부터 20까지의 정수 중에서 2 또는 3의 배수가 아닌 수의 총합을 구하시오
		
		int sum = 0;
		
		for(int i = 1; i <= 20; i++) {
			if(i % 2 == 0 || i % 3 == 0) {
				continue;
			}sum += i;
		} System.out.println("총합 : " + sum);
		
		
		
		
		int total=0;
		
		for(int i=1; i<=20; i++ ) {
			if(i % 2!=0 && i % 3 !=0) {
				total +=i;
			}
		}
		System.out.println("2 또는 3의 배수가 아닌 수의 총합 : " + total);
		
		
		
		
		
		
		
		
		
		
	}
}
