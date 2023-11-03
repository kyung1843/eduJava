package org.joonzis.ex;
class Box3<T>{
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
	
}
public class Generic_book5 {
	public static<T> Box3<T> boxing(T t){
		Box3<T> box = new Box3();
		box.setT(t);
		return box;
	}
	
	public static void main(String[] args) {
		Box3<Integer> box1 = boxing(100);
		int intValue = box1.getT();
		System.out.println(intValue);
	}
	
}
