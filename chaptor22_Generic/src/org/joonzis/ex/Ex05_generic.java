package org.joonzis.ex;

import java.util.Arrays;


class Container<T>{
	//필드
	private T[] items;
	@SuppressWarnings("unchecked")//명확하지 않은 타입체크지만 더이상
	public Container(int capacity) {
		items = (T[])(new Object[capacity]);  //제네릭으로 다운캐스팅
	}
	
	public void add(T item) {
		for(int i = 0; i < items.length; i++){
			if(items[i] == null) {
				items[i] = item;
				break;
			}
		}
	}
	public T[] getItems() {  //setter개념
		//순차적으로 순회하다가 빈자리 발견되면 그 자리에 저장
		return items;
	}
	
}

class Gun{
	private String model;

	public Gun(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return model;
	}
	
	
}

public class Ex05_generic {
	public static void main(String[] args) {
		//컨테이너 객체 생성(타입은 Gun, 크기는 5)
		//총기 3개만 입력
		//배열 출력
		
		Container<Gun> con = new Container<>(5);
		
		con.add(new Gun("권총"));
		con.add(new Gun("소총"));
		con.add(new Gun("기관총"));
		
		System.out.println(Arrays.toString(con.getItems()));
		
		
	}
}
