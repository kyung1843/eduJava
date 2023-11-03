package org.joonzis.ex;

public class Ex03_exception {
	public static void main(String[] args) {
		/*
		 * NumberFormatException 주어진 문자열을 정수 및 실수로 변환하지 못할 경우 예외 발생
		 */

		String data1 = "100";
		String data2 = "a100";

		try {
			int val1 = Integer.parseInt(data1);
			System.out.println("변환한 값 : " + val1);
			int val2 = Integer.parseInt(data2); // 해당위치에서 예외 발생
			System.out.println("변환한 값 : " + val2);

		} catch (NumberFormatException e) {
			e.printStackTrace();
			System.out.println("문자열을 숫자로 변환할 수 없습니다");
		}

	}
}
