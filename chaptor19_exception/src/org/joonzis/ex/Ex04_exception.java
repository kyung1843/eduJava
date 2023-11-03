package org.joonzis.ex;

public class Ex04_exception {

	/*
	 * NullPointerException 객체참조가 없는 상태 null값을 갖는 객체를 사용하는 경우 예외발생
	 */

	public static void main(String[] args) {
//		String name = "Lisa";
//		System.out.println("이름 : " + name.toString());    //toString : 객체 내용 나열

		try {
			String name = null;
			System.out.println("이름 : " + name.toString()); // toString : 객체 내용 나열

		} catch (NullPointerException e) {
			System.out.println("예외발생!");
			System.out.println(e.getMessage());   //e라는 매개변수 안에 들어있는 에러 명칭
			System.out.println("------------------");
			e.printStackTrace();
		}

	}
}
