package org.joonzis.ex;

public class Ex06_exception {

	/*
	 * throws(예외 떠넘기기) 메소드를 호출 한 곳으로 예외를 떠넘긴다 떠넘길 예외 클래스를 쉼표로 구분해서 나열할 수 있다
	 * throws키워드가 붙어있는 메소드는 반드시 try 블록 내에 호출되어야 한다
	 * 
	 * 예외가 발생하는 곳에서 직접 try-catch 하지 않는 이유는 동시에 여러 개발자가 같은 메소드르 바라보고 있을 시 공용처리보다는
	 * throws로 각각 가져와 개별 처리를 위함이다
	 */

	// divide는 예외가 발생할 수 있음을 알려줌
	// throws를 쓰면 예외를 main으로 던진다
	// 메소드가 여러개인 경우 꼭 throws를 사용하자
	public static void divide(int num1, int num2) throws ArithmeticException {
		System.out.println("몫 : " + num1 / num2); // 해당위치 예외발생
		System.out.println("나머지 : " + num1 % num2);

	}

	public static void main(String[] args) {
		try {
			divide(5, 2);
			divide(5, 0);

		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다");
			e.printStackTrace();
		}

	}

}
