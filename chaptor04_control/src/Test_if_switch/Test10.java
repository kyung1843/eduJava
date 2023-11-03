package Test_if_switch;

import java.util.Scanner;

public class Test10 {
	public static void main(String[] args) {
//		Test10.java (switch문)
//		Q. Test04.java 을 switch 문으로 다시풀기
//			점수를 입력 받아 학점 출력하기
//		   100 ~ 97점 : A+ / 96 ~ 94점 : A0 / 93 ~ 90점 : A- 
//		    89 ~ 87점 : B+ / 86 ~ 84점 : B0 / 83 ~ 80점 : B-
//		    79 ~ 77점 : C+ / 76 ~ 74점 : C0 / 73 ~ 70점 : C- / 69 ~ 0점 : F
		
		Scanner sc = new Scanner(System.in);

		System.out.println("점수 입력 >> ");
		int score = sc.nextInt();
		
		char grade, point = 0;
		
		switch(score % 10) {
			case 0 : case 1 : case 2 : case 3 : point = '-';
				break;
			case 4 : case 5 : case 6 : point = '0';
				break;
			case 7 : case 8 : case 9 : point = '+';
		}
	
		switch(score / 10) {
			case 10 : point = '+'; 
			case 9 : grade = 'A';
				break;
			case 8 : grade = 'B';
				break;
			case 7 : grade = 'C';
				break;
			default : grade ='F'; point=' ';
		}
		
		System.out.println("학점 : " + grade+point);
		
		sc.close();
	}
}
