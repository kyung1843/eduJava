package org.joonzis.ex;
class Box1<T>{
	//field
	public T content;
	
	//내용물 비교
	public boolean compare(Box1<T> other) {
		boolean result = content.equals(other.content);
		return result;
	}
}



public class Generic_book4 {
	public static void main(String[] args) {
		Box1 box = new Box1();
		box.content = "100";
		
		Box1 box1 = new Box1();
		box1.content = "100";
		
		Box1 box2 = new Box1();
		box2.content = 100;
		
		boolean result1 = box.compare(box1);
		System.out.println("result1 : " + result1);
		
		boolean result2 = box.compare(box2);
		System.out.println("result2 : " + result2);
	}
}
