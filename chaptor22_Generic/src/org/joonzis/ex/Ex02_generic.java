package org.joonzis.ex;
//제네릭 클래스
class Bag<T>{         //<T> : 참조자료형  ex)int형 사용하고 싶으면 ?? Integer를 사용해야 한다
	private T obj;

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}
	
	
}
class Ball{
	
	
}

class Pen{}
public class Ex02_generic {
	public static void main(String[] args) {
		Bag<Ball> bag = new Bag<>();
//		Bag<Ball> bag = new Bag<>();  //<>안에 Pen을 넣으면 Pen전용 가방
		
		
		bag.setObj(new Ball());
		Ball ball = bag.getObj();    //제네릭 사용하면 캐스팅 할 필요 없다
		System.out.println(ball);
		
		
		
		
		
		
		
		
		
	}
}
