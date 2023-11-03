package Test_if_switch;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
//		Q. 정수를 입력 받아 "짝수", "홀수" 구분해서 출력하기
//		   3의 배수는 "3의 배수"로 출력하기

		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력>>");
		int num = sc.nextInt();

//		if(num % 2 == 1) {
//			System.out.println("홀수");
//		}
//		else if(num % 3 == 0) {
//			System.out.println("3의 배수");
//		}
//		else {System.out.println("짝수");}
//		

		if (num % 3 == 0 && num % 2 == 0) {
			System.out.println("3의 배수 이면서 짝수");
		} else if (num % 3 == 0 && num % 2 == 1) {
			System.out.println("3의 배수이면서 홀수");
		} else if (num % 3 != 0 && num % 2 == 1) {
			System.out.println("3의 배수 아니면서  홀수");
		} else if (num % 3 != 0 && num % 2 == 0) {
			System.out.println("3의 배수 아니면서 짝수");
		}

	}
}
