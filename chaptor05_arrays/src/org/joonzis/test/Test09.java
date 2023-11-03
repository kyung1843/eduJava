package org.joonzis.test;

import java.util.Scanner;

public class Test09 {
 public static void main(String[] args) {
//	 과목 이름을 입력받아 해당 과목 점수를 출력해주는 프로그램을 작성.
//		무한반복을 하다가 "그만"을 입력 받으면, 프로그램 종료
//	★	String[] subjectArr = {"Java", "Python", "Android", "JSP", "Javascript"};
//		int[] scoreArr = {95, 88, 78, 62, 55};
//	실행 예)
//	Java의 점수는 : 95

	 
	 String[] subjectArr = {"Java", "Python", "Android", "JSP", "Javascript"};
	 int[] scoreArr = {95, 88, 78, 62, 55};
	 
	 Scanner sc = new Scanner(System.in);
	 
	 while(true) {
	 		System.out.println("과목이름 >>"  );
	 		String subName = sc.next();
	 		if(subName.equals("그만")) {
	 			System.out.println("프로그램 종료");
	 			break;
	 		}
	 		
	 		for(int i =0; i<subjectArr.length; i++) {
	 			if(subjectArr[i].equalsIgnoreCase(subName)) {                         //equalsIgnoreCase : 대소문자 상관 없이!
	 				System.out.println(subjectArr[i] + "의 점수는 : " + scoreArr[i]);
	 			}
	 		}
	 		}	
	 	}
	 
	 
	 
	 
	 
	 
	 
}

