package org.joonzis.ex;

public class Ex02_ManMain {
	public static void main(String[] args) {
		
		Ex02_Man man = new Ex02_Man("홍길동", 100);
		man.output();
		
		System.out.println("============================================");
		
		System.out.println(man.age);
		System.out.println(man.name);     
		System.out.println(man.GENDER);         //인스턴스르 통합 접근(추천X)
		System.out.println(Ex02_Man.GENDER);    //클래스를 통합 접근(추천!)
		                                           //static은 클래스명으로 사용  
		
		
		
		
		
		
	}
}
