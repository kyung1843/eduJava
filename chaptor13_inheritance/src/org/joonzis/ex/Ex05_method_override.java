package org.joonzis.ex;

class Espresso{
	
	String origin;

	
	public Espresso() {}
	public Espresso(String origin) {
		this.origin = origin;
		
	}
	
	void taste() {
		System.out.println("쓰고, 진하다");
	}
}


class Latte extends Espresso{
	String milk;
	
	public Latte() {}
	
	public Latte(String milk, String origin) {
		super(origin);
		this.milk = milk;
	}

	
	
	//오버라이드 하는 법 1
	@Override
	void taste() {
		System.out.println("원산지 : " +  origin + ", " + "우유 : " + milk);
		System.out.println("부드럽다");
	}
}

public class Ex05_method_override {
	public static void main(String[] args) {
		Latte latte = new Latte("서울우유", "콜롬비아");
		latte.taste();
	}			
}
