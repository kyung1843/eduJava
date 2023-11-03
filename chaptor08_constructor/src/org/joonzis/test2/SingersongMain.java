package org.joonzis.test2;

public class SingersongMain {

	public static void main(String[] args) {
		
	Song s1 = new Song("tom", "kor");   //정보 던져주기 위한 객체 
	s1.output();
	
	
	
	Singer s2 = new Singer("찰리", s1) ;	 //siger라는 클래스 쓰기 위해 객체 생성
	s2.setSong(s1);
	s2.output();
	

	}
	
}
