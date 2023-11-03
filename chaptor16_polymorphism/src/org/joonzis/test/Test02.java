package org.joonzis.test;

import java.util.Arrays;

class Product{
	private String model;
	private int price;
	
	
	public Product(String model, int price) {
		this.model = model;
		this.price = price;
	}


	public String getModel() {
		return model;
	}



	public int getPrice() {
		return price;
	}

}

class Tv extends Product{

	public Tv(String model, int price) {
		super(model, price);
	}
}

class Computer extends Product{
	public Computer(String model, int price) {
		super(model, price);
	}
}

class Customer{
	private int money, startMoney, numOfProduct;    //잔돈,처음 가지고 있던 돈, 인덱스
	private Product[] cart = new Product[10];           //카트 상품추가
	
	
	public Customer(int money) {
		this.money = money;         //잔돈
		this.startMoney = money;   //시작 고정값
		
	}
	
	public void buy(Product product) {
		//물건금액과 잔금 비교
		//잔금부족하면 구매불가("소지 금액이 부족합니다")출력
		//소지금액이 더 크면 잔금에서 차감 후 카트에 제품추가
		//인덱스 증가
//		for(int i = 0; i < cart.length; i++) {
//			
//			if(cart[i].getPrice() > startMoney) {
//				System.out.println("소지 금액이 부족합니다");
//			}else {
//				
//			}
//		}
		
		if(money < product.getPrice()) {
			System.out.println("소지금액 부족");
		}else {
			money = money - product.getPrice();
			cart[numOfProduct] = product;
			numOfProduct++;
		}
		
	}
		
		
	
	
	
	
	
	
	public void output() {
		int sum = 0;
		for(int i = 0; i <numOfProduct; i++) {      //내가 구매한 만큼 돌아
			System.out.println("구매상품 : " + cart[i].getModel() + "," +cart[i].getPrice() );
			
			sum+=cart[i].getPrice();
		}
		
		System.out.println("------------------------------");
		System.out.println("처음 소지 금액 : " + startMoney);
			System.out.println("총 구매 금액 : " + sum );
			System.out.println("잔돈 : " + money );
		
		//해당 고객의 카트에 담긴 내용물 출력
		//구매 상품, 금액(처음 소지금액, 총 구매 금액, 남은 금액)
		
	}
	
}

public class Test02 {
	public static void main(String[] args) {
		
		Customer cus = new Customer(100000);

		cus.buy(new Tv("삼성", 10000));
		cus.buy(new Computer("엘지", 50000));
		
		cus.output();
		
		
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
