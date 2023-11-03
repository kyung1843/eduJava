package org.joonzis.ex;

public class Ex05_String {
	public static void main(String[] args) {
		
		String a = "apple";  //인스턴스는 다르지만 내부 데이터가 동일하므로 객체1개만 저장    cbv(call by value)
		String b = "apple";  //"apple"은 하나만 만들어 진다 
		System.out.println(a == b ? "apple 1개" : "apple 2개");
		
		String c = new String("banana");                                        //cbr(call by reference)
		String d = new String("banana");
		System.out.println(c==d ? "banana 1개" : "banana 2개");
		//new...다른 주소에 저장되서 2개
		
		
		//.split()  //특정 기호로 분리
		String sn = "000000-1234567";
		String[] snArr = sn.split("-"); //하이픈으로 분리하여 각각 배열에 저장
		for(String s : snArr) {
			System.out.println(s);
		}
		
		String today = "2022.10.05";
		String[] ymd = today.split("\\.");   //몇몇 특수문자는 사용시 앞에 역슬래쉬 2개(\\) 붙여야 함
		for(String y : ymd) {
			System.out.println(y);
		}
		
		
		//.join()  // 배열 요소 사이에 특정 기호 넣어서 합치기 //매개변수 2개(기호, 배열)
		String today2 = String.join("-", ymd);
		System.out.println(today2);
		
		
		//.valueOf
		//정수 -> 문자열 : String.valueOf(10) == "10"  // ""+10 -> "10"
		//실수 -> 문자열 : String.valueOf(1.5) == "1.5"
		
		//.subString
		//.subString(시작 인덱스) : 시작 인덱스부터 끝까지 추출
		//.subString(시작 인덱스, 종료인덱스) : 시작 인덱스 포함 종료 인덱스 전까지 추출
		//                 1  ,  3        : 1,2
		
		String phone = "010-1234-5678";
		
		String phone1 = phone.substring(0,3);  //010
		String phone2 = phone.substring(4, 8); //1234
		String phone3 = phone.substring(9); //5678
		
		
		System.out.println(phone1);
		System.out.println(phone2);
		System.out.println(phone3);
		
		
		
		
		
		
		
		
	}
}
