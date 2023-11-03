package org.joonzis.ex;

class Box2<T>{
	public T content;
}


public class Generic_book {
	public static void main(String[] args) {
		Box2<String> box = new Box2<>();
		box.content = "안녕하세요";
		String str = box.content;
		System.out.println(str);
		
		
		Box2<Integer> box1 = new Box2<>();
		box1.content = 100;
		int value = box1.content;
		System.out.println(value);
	}
}
