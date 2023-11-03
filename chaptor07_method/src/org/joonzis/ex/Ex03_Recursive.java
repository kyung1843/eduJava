package org.joonzis.ex;

public class Ex03_Recursive {

	/*재귀호출
	 * 1.메소드가 자신을 호출할 때
	 * 2.반복문 처리 / 복잡한 알고리즘 처리
	 * 3.잘못 구현하면 무한루프에 빠진다*/
	
	//필드
	static int count = 0;
	
	//메소드
	static void recursive() {
		System.out.println("recursive() call");
		
		count++;
		if(count == 5) {
			return;
		}                       //메소드 탈출 = return
		                        // 반복문 탈출 = break
		
		recursive();          //자기가 자신을 호출
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		recursive();
	}
	
	
	
	
	
	
	
}
