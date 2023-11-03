package org.joonzis.ex;

class MyThread extends Thread{
	/*
	 * 1.스레드 클래스르 상속받아 정의
	 * 	run()을 재정의override 해서 스레드가 실행할 코드 작성*/
	
	private String str;
	public MyThread(String str) {
		this.str = str;
	}
	
	@Override
	public void run() {
		for(int i = 0; i <10; i++) {
			System.out.println(str);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} 
		System.out.println("Other Thread End!!");
	}
}



public class Ex02_Multi_thread {
	public static void main(String[] args) {
		
		/*run()메소드를 호출하면 단순히 클래스에 속한 메소드를 호출하는 것뿐
		 * start()메소드는 스레드 작업을 실행하는데 필요한 호출스택 생성한 다음 run()을 호출*/
		
		
		System.out.println("Main Thread Start!!");
		
		
		MyThread mt1 = new MyThread("***");
		MyThread mt2 = new MyThread("---");
		
		mt1.start();
		mt2.start();
		
		
		

		
		System.out.println("Main Thread End!!");
		
	}
}
