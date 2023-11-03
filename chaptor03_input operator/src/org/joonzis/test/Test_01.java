package org.joonzis.test;

import java.util.Scanner;

public class Test_01 {
	
	//Q. 두 정수를 입력받아 a, b에 저장한 뒤 두 변수의 값을 교환하는 프로그램 구현
	//* 임시 변수 필요
	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		System.out.println("a : "+ a + ',' + "b : " + b);
		
	
		int  tmp =  a;  //데이터 임시저장
		a = b;      //a의 값을 저장해놓았기 때문에 변경 가능
		b = tmp;	//저장한 a의 값을 b에 저장
		
		System.out.println("a : " + a + ", b : " + b);
		
		
	}
}
