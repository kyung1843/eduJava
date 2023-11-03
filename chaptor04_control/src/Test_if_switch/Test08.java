package Test_if_switch;

import java.util.Scanner;

public class Test08 {
	public static void main(String[] args) {
		
//		Q. 권한을 출력하기
//		3 수준 : 실행, 쓰기, 읽기 / 2수준 : 쓰기, 읽기 / 1수준 : 읽기
//		실행 예)
//		수준입력 >> 3
//		출력 : 실행, 쓰기, 읽기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("수준 입력>>");
		int auth = sc.nextInt();
		System.out.println("수준 : " + auth);
		
		switch(auth) {
			case 1 : System.out.println("읽기");
				break;
			case 2 : System.out.println("쓰기, 읽기");
				break;
			case 3 : System.out.println("실행, 쓰기, 읽기");
				break;
	}
		switch(auth) {
		case 3 : System.out.println("실행,");
		case 2 : System.out.println("쓰기,");
		case 1 : System.out.println("읽기");
			break;
		}
		
		
//		if(auth == 1) {
//			System.out.println("읽기");
//		}
//		else if(auth == 2) {
//			System.out.println("쓰기, 읽기");
//		}
//		else{
//			System.out.println("실행, 쓰기, 읽기");
//		}
//		
		//sc.close();  : 스캐너 객체 닫아주는거
		
		
		
		
		
	}
}
