package org.joonzis.test;

import java.util.Random;
import java.util.Scanner;

//사용자로부터 10이상의 정수를 입력 받아 난수 (0 ~ 9)로 나눈결과를 출력하시오.
//위과정을 100번 반복하여 출력하며, 나눌 수없는 경우에는 나눈 결과를 0으로 대신출력한다.
public class Test02 {
	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
Random ran = new Random();

			for (int i = 0; i <= 100; i++) {

				
				System.out.println("10이상의 정수 입력 >>");
				int num = sc.nextInt();
				System.out.println("입력한 정수 : " + num);

				
				int rnd = (ran.nextInt(10));
				System.out.println("난수 : " + rnd);
				
				
				if(num <10) {
					i--;
					continue;
				}else {
					try {
						System.out.println((i + 1)+"번째 나누기 결과 : " + (num / rnd));
					} catch (Exception e) {
						// ArithmeticException
						System.out.println((i + 1)+"번째 나누기 결과(0으로 나눈 결과) : " + 0);
					}
				}
			}
		}
	}
