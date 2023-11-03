
package org.joonzis.test;

import java.util.Scanner;


public class Test_05 {

	
	public static void main(String[] args) {
		
		
		/*Q. 하이픈 없이 주민등록번호를 입력받아 (정수, 문자열) "남자","여자" 출력하기
	* String의 메소드 이용하기
	* ex) charAt(), substring() 등*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("주민등록번호 입력 >> ");
		String num = sc.next();
		
		//문자열 자르기
		String gender = num.substring(6, 7).equals("1") ? "남자" : "여자" ;
		System.out.println("성별 : " + gender);
		
//		String gender = (num.charAt(6)=='1') ? "남자" : "여자";
//		System.out.println("성별 : " + gender);
		
		
		
		/*첫번쩨 방법
		String sn1 ="9999992888888";
		char charSn = sn1.charAt(6);
		
		
		int sn = Character.getNumbericValue(charSn);
		String gender = (sn % 2 == 0) ? "여자" : "남자";
		System.out.println("성별 : " + gender ); */
		
		
		
		/*두번째 방법
		String sn1 ="9999992888888";
		char charSn = sn1.charAt(6);    //2
		
		
		int sn = Character.getNumericValue(charSn);
		String gender = (charSn == '2' || charSn == '4') ? "여자" : "남자";
		System.out.println("성별 : " + gender );  */
		
		
		
		
//		//세번째 방법(추천X)
//		String sn1 ="9999992888888";
//		String StrSn = sn1.substring(6, 7);
//		System.out.println(StrSn);
//		String gender = (StrSn.equals("2")  || StrSn.equals("4") ? "여자" : "남자";
//		System.out.println("성별 : " + gender );
//		
		
		
		
		
		
		
		
		
		
		
	
		
		
	}
}
