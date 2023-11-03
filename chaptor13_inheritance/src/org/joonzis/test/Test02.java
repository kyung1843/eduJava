package org.joonzis.test;

class Computer {

	String model;
	int price, battery;

	public Computer(String model, int price) {
		this.model = model;
		this.price = price;
	}
	
	void output() {
		System.out.println("종류 : " + model);
		System.out.println("가격 : " + price);
	}

}

class Notebook extends Computer {
	int battery;
	public Notebook(String model, int price, int battery) {
		super(model, price);
		this.battery = battery; 
	}
	
	
	

	void output() {
		super.output();
		System.out.println("배터리 : " + battery);
	}

}

class Tablet extends Computer {

	String pen;

	public Tablet(String model, int price, int battery, String pen) {
		super(model, price);
		this.pen = pen;
		this.battery = battery;
	}
	
	

	void output() {
		super.output();
		System.out.println("배터리 : " + battery);
		System.out.println("테블릿 펜 : " + pen);

	}
}

	public class Test02 {
		public void main(String[] args) {

			Notebook note = new Notebook("그램", 100, 80);
			note.output();

			
			System.out.println("==============================");
			
			
			Tablet tab = new Tablet("아이패드", 160, 100, "애플펜슬");
			tab.output();

		}

	}

