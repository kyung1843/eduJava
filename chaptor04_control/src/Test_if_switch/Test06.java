package Test_if_switch;

import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
//		Q. 알파벳을 하나 입력 받아 대문자가 입력되면 소문자로 변환해서 출력하고, 소문자가 입력되면 대문자로 변환해서 출력하고
//	   	나머지 문자들은 그대로 출력하기
//	★아스키 코드  97~122 : 소문자, 65~90 : 대문자, 48~57 : 숫자
		
		char ch = 'A';
		
		if(ch >= 'A' && ch <= 'z') {
			System.out.println(ch += 32);
		}else if(ch >= 'a' && ch <= 'z') {
			System.out.println(ch -= 32);
		}else {System.out.println(ch);}
		
		System.out.println(ch += 32);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//	   	
	}
}
