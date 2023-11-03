package org.joonzis.ex;

import java.util.Arrays;

class Basket<T>{
	//필드
	private T[] foods;
	
	@SuppressWarnings("unchecked")
	public Basket(int length) {
		foods = (T[])(new Object[length]);
		
	}
	
	public void add(T food) {
		for(int i = 0; i < foods.length; i++) {
			if(foods[i] == null) {
				foods[i]=food;
				break;}
			}
		}
	
	public T[] getFood() {
		return foods;
	}
	}

class Food{//부모 클래스
	String food1;
	
	 
	
	
	
}
class Apple extends Food{
	
	
}
class Banana extends Food{

	
}
class Bread extends Food{

	
	
}
class Computer{
	
	
}
public class Ex06_generic {
	public static void main(String[] args) {
		//Basket 객체 생성
		//위 클래스들 각각 데이터 추가
		//배열 내 데이터 출력
		
		Basket<Food> bk = new Basket<>(3);
		
		bk.add(new Apple());
		bk.add(new Banana());
		bk.add(new Bread());
		
		System.out.println(Arrays.toString(bk.getFood()));
		
		
	}
}
