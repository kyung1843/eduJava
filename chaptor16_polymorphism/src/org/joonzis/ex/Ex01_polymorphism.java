package org.joonzis.ex;


class Product{
	public void info() {
		System.out.println("product");
	}
}


class Computer extends Product{

	@Override
	public void info() {
		System.out.println("Computer");
	}
	
	
}


class Notebook extends Product{

	@Override
	public void info() {
		System.out.println("Notebook");
	}
	
}

public class Ex01_polymorphism {
	public static void main(String[] args) {
	
		Computer[] computers = new Computer[10];
		Notebook[] notebooks = new Notebook[10];
		
		for(int i = 0; i < computers.length; i++) {
			computers[i] = new Computer();
		}
		for(int i = 0; i < notebooks.length; i++) {
			notebooks[i] = new Notebook();
		}
		
		
		//========================================업캐스팅 이용
		
		Product[] products = new Product[20];
		
		//products[0] = new Product();   // 문법에는 문제가 없으나 존재하면 안된느 코드(무슨제품인지 모름)
		products[0] = new Computer();
		products[1] = new Computer();
		products[2] = new Notebook();
		
		products[0].info();
		products[1].info();
		products[2].info();
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
