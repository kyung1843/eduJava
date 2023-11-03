package org.joonzis.test;

import java.util.Scanner;

//나이를 입력 받아 출력하시오. 
//나이가 0 ~ 150 사이의 범위를벗어나면 AgeException 클래스를 이용하여 예외를 처리하시오.
//나이를 입력 받기 위해 getAge() 메소드를 이용하시오.
class AgeException extends Exception{

	private static final long serialVersionUID = 1L;
	
	public AgeException(String message) {
		super(message);
	}
}


public class Test03 {
	
	static Scanner sc = null; //new Scanner(System.in);
	
	public static int getAge() throws AgeException{
		//나이 입력	//나이가 0~150 사이를 벗어나면 Exception
		
		System.out.println("나이입력 >>");
		int age = sc.nextInt();
		
		
		if(age > 150 || age < 0) {
			throw new AgeException("입력 불가");
		}
		return age;
		
		}
	
	public static void main(String[] args) {
		try {System.out.println("나이는 " + getAge() + "살 입니다");
			
			
		} catch (AgeException e) {
			System.out.println("에러 메세지 : " + e.getMessage());
		}finally {
			if(sc != null) {      //열리지도 않았는데 닫으려고 하면 에러나기 때문에 조건 걸어서 닫아준다
				sc.close();
			}
			
		}
		
	}
}
