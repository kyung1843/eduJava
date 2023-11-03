package org.joonzis.ex;

/*
 * Thread.join()
 *  - 해당 스레드가 끝날 때까지 기다리게 하는 메소드
 * 
 */
class Join extends Thread{
	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i + "번째 실행(join)");
		}
	}
}
class Join2 extends Thread{
	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i + "번째 실행(join2)");
		}
	}
}public class Ex07_join {
	public static void main(String[] args) {
		Join join = new Join();
		Join2 join2 = new Join2();
		
		System.out.println("Main Thread start");
		
		// 스레드 객체를 대기 시키는 구문
		// 메인 스레드 - join(멀티 스레드) - 메인스레드
		try {
			join.start();
			join.join();
			join2.start();
			join2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Main Thread end");
	}

}