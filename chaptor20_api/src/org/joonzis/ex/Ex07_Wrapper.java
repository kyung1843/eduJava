package org.joonzis.ex;

public class Ex07_Wrapper {
	public static void main(String[] args) {
		/*
		 * Wrapper class(parsing할때 써)
		 * 1. 기본타입을 참조타입으로 변경해주는 클래스
		 * 2. 종류
		 *  	1)int -> Integer
		 * 		1)double -> Double
		 *  	1)boolean -> Boolean
		 *  	1)char -> Character
		 *  3. 변수를 객체로 변환해주는 클래스
		 *  4. 반드시 reference type을 사용해야 하는 경우에만 사용*/
		
		
		Integer a = new Integer(10); //10을 저장한 객체(인스턴스) a
		Integer b = new Integer(10); //10을 저장한 객체(인스턴스) b
		
		//동등비교
		System.out.println("저장된 위치 비교 : " + (a == b));
		System.out.println("저장된 내용 비교 : " + a.equals(b));
		
		//크기비교
		//a.compareTo(b) :  결과는 a-b를 통해 계산한다
		//a.compareTo(b) : a > b    결과 1(양수)
		//a.compareTo(b) : a < b    결과 -1(음수)
		//a.compareTo(b) : a == b   결과 0
		
		System.out.println("두 객체에 저장된 값의 크기 비교 : " + a.compareTo(b));
		
		//Auto Boxing, Auto UnBoxing
		//값 ->  객체로 변환 : Boxing
		//객체 -> 값으로 변환 : UnBoxing
		
		//Auto Boxing(객체 = 값)
		Integer c = 100;
		Integer d = 100;
		
		//Auto UnBoxing
		int result = c+d;
		System.out.println(result);
		
		
		
		
		
		
	}
}
