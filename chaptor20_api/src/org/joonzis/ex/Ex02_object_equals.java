package org.joonzis.ex;

class Computer {
	private String model;
	private int price;

	public Computer(String model, int price) {
		this.model = model;
		this.price = price;
	}

	@Override
	public boolean equals(Object obj) { // Object object = new Computer();
		if (obj != null && obj instanceof Computer) {
			// price == obj.price
			Computer other = (Computer) obj;
				if (price == ((Computer) obj).price && model.equals(other.model)) {
					return true;
				}
				// model == obj.model
				else {
					return false;
				}
		}
		return false;

	}

	@Override
	public String toString() {
		String info = "모델 : " + model + ", 가격 : " + price;
		return info;
	}

}

public class Ex02_object_equals {
	public static void main(String[] args) {
		Computer mycom1 = new Computer("삼성", 100);
		Computer mycom2 = new Computer("삼성", 100);

		System.out.println(mycom1.toString());
		System.out.println(mycom2);
		
		
		//equals
		//1)object의 equals 메소드 : 객체 비교 불가
		//2)Computer 클래스의 equals 메소드 오버라이드
		if (mycom1.equals(mycom2)) { // equals : 값 비교
			System.out.println("같은 종류의 컴퓨터이다");
		}else {
			System.out.println("다른 종류의 컴퓨터이다");
		}
		
		
		if (mycom1 == mycom2) {   //== : 주소 비교(참조 비교)
			System.out.println("같은 종류의 컴퓨터이다");
		}else {
			System.out.println("다른 종류의 컴퓨터이다");
		}

	}
}
