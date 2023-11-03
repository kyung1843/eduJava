package Test_if_switch;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
//		문자를 하나 입력 받아 "대문자", "소문자", "아라비아 숫자", "일반 문자" 구분해서 출력하기
//	     아스키 코드표 참고 97~122 : 소문자, 65~90 : 대문자, 48~57 : 숫자
		
		char ch = 'A';
		
		if(ch >= 'A' && ch <= 'z') {
			System.out.println("대문자");
		}else if(ch >= 'a'&& ch<= 'z') {
			System.out.println("소문자");
		}else if(ch >= '0' && ch <= '9'){
			System.out.println("아라비아 숫자");
		}else {System.out.println("일반문자");}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
