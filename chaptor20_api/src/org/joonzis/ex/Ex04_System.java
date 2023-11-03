package org.joonzis.ex;

public class Ex04_System {
	public static void main(String[] args) {
		//0~9까지 반복하여 데이터 출력
		//해당 데이터가 5일때 시스템 종료
		
		for(int i = 0; i <= 9; i++) {
			System.out.print(i + " "
					+ "");
			try {
				if(i == 5) {
				System.exit(i);
			}
			} catch (SecurityException e) {
				e.printStackTrace();
				
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
