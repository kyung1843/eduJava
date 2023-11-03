package org.joonzis.ex;

class MyThread2 implements Runnable{
	/*1.Runnable인터페이스를 구현하는 방법
	 * -인터페이스를 구현할 대에도 쟂의 할 때의 어노테이션을 붙여준다
	 * 
	 * 단일상속의 문재로 interface를 이요하는 경우가 많다*/
	private String str;
	public MyThread2(String str) {
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

public class Ex03_multiThread {
	public static void main(String[] args) {
		System.out.println("Main Thread Start!!");
		
		
		MyThread2 mt1 = new MyThread2("***");
		MyThread2 mt2 = new MyThread2("---");
		
		
		//start()를 사용하기 위해서 Thread클래스 객체 생성 해서 매개변수에 클래스객체 입력
		//Ex02_multiThread 파일에서 객체를 만들어서 하는 것 뿐 같은것
		Thread t1 = new Thread(mt1);
		Thread t2 = new Thread(mt2);
		
		t1.start();
		t2.start();
		
		
		
		
		
		System.out.println("Main Thread End!!");
	}
}
