package org.joonzis.ex;

//클래스의 구성 = 필드 + 메소드
//필드(= 변수) : 정보
//메소드       : 정보를 실행시켜줌

public class Ex01_Book {
	
	//필드 = 스스로 아무것도 못함. 다른 클래스 이용해 실행시켜 줘야함
	String title;
	String writer;
	int price;
	boolean isBestSeller;
	
	//메소드
	void info() {
		System.out.println("제목 : " + title);
		System.out.println("저자 : " + writer);
		System.out.println("가격 : " + price);
		System.out.println(isBestSeller? "베스" : "일반서적");
	}
	
	
	
	
	
}
