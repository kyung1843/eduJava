package org.joonzis.ex;

/*메인 클래스
 * 1.main method(하나만 있을 수 있고 두개가 있다면 그 두개는 서로 다른 프로그램)가 있는 클래스*/

public class Ex01_BookMain {
	public static void main(String[] args) {
		Ex01_Book myBook = new Ex01_Book();
		
		//2.생성된 객체 활용
		myBook.title = "자바의 정석";
		myBook.writer = "남궁성";
		myBook.price = 35000;
		myBook.isBestSeller = true;
		
		
		myBook.info();
		
		
		
		
		
		
		
		
	}
}
