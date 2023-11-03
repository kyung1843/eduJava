package org.joonzis.ex;

public class Ex01_MainThread {
	public static void main(String[] args) {  //메인스레드
		
		
		for(int i = 1; i <11; i++) {
			try {
				Thread.sleep(1000);   //스레드 1초 일시정지 - 예외처리 필수
				System.out.println(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
