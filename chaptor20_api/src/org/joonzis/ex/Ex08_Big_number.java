package org.joonzis.ex;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Ex08_Big_number {

	public static void main(String[] args) {
		// int 형 최대값
		System.out.println(Integer.MAX_VALUE);
		// long형 최대값
		System.out.println(Long.MAX_VALUE);
		
		// BigInteger 클래스 활용해서 long 타입 이상/이하 사용가능
		BigInteger a = new BigInteger("12345678901234567890");				// 반드시 문자열 처리해서 적어주자
		BigInteger b = new BigInteger("123456789012345678901234567890");
		
		//BigInteger 필드 값
		System.out.println(BigInteger.ZERO);
		System.out.println(BigInteger.ONE);
		System.out.println(BigInteger.TEN);
				
		// 사칙연산
		System.out.println(a.add(b));
		System.out.println(a.subtract(b));
		System.out.println(a.multiply(b));
		System.out.println(a.divide(b));
		
		// BigDecimal 클래스로 실수의 소수 자릿수를 제한없이(손실없이) 사용가능
		double d = 1.23456789123456789;
		System.out.println(d);
		BigDecimal e = new BigDecimal("1.123456789123456789123456789");
		System.out.println(e);
		
		
	}

}
