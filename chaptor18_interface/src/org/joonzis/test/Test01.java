package org.joonzis.test;
//스마트폰 => 전화기 + 컴퓨터 

//
//class Phone 				필드 : String owner
//							메소드 : Constructor, sendCall(), receiveCall()
//interface Computable		메소드 : connectInternet(), playApp()
//class SmartPhone 			Phone 상속, Computable 구현

interface Computable {
	public void connectInternet();

	public void playApp();
}

class Phone{
	private String owner;

	public Phone(String owner) {
		this.owner = owner;
	}

	public void sendCall(String owner) {
		System.out.println(owner + "전화 걸기");
	}

	public void receiveCall(String owner) {
		System.out.println(owner + "전화 받기");
	}

	
	
	
	
}

class SmartPhone extends Phone implements Computable {
	
	
	public SmartPhone(String owner) {
		super(owner);
	}

	@Override
	public void connectInternet() {
		System.out.println("인터넷 연결");
	}

	@Override
	public void playApp() {
		System.out.println("앱 실행");
	}

}

public class Test01 {
	public static void main(String[] args) {
		SmartPhone ph = new SmartPhone("김씨");
		ph.receiveCall("김씨");
		ph.sendCall("김씨");
		ph.connectInternet();
		ph.playApp();
		
		
		
	}
}
