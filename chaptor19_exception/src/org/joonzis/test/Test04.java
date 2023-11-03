package org.joonzis.test;

import java.util.Scanner;

//주민등록 번호 (하이픈 포함)를 입력 받아 출력하시오.
//주민등록번호가 14글자가 아니면 PerIDException 클래스를 이용하여 예외를 처리하시오.
//주민등록번호를 입력받기 위해 getPerID() 메소드를 이용하시오.		
class PerIDException extends Exception{
	private static final long serialVersionUID = 1L;
	
	private String jn;

	public PerIDException(String message) {
		super(message);
	}
	
	
	
} 



public class Test04 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static String getPerID() throws PerIDException{
			
			System.out.println("주민등록번호 입력(하이픈 포함) >>");
			String jn = sc.next();
		
			if(jn.length() != 14) {
				throw new PerIDException("올바른 주민등록번호가 아님");
			}
			return jn;
		
	}
	
	
	
	public static void main(String[] args) {
		
		try {
			System.out.println("입력한 주민번호 : " + getPerID());
			
		} catch (PerIDException e) {
			System.out.println("에러 메세지 : " + e.getMessage());
		}finally {
			if(sc != null) {
				sc.close();
			}
		}
	}
}
