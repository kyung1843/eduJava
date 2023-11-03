package org.joonzis.test4;

public class Ring {

	Circle inner; 
	Circle outer;
	
	
	public Ring(Circle i, Circle o) {
		inner = i;
		outer = o;
		
	}
	
	
	
	void output() {
		System.out.println("안쪽 원의 정보 : ");
		inner.output();
		System.out.println("바깥쪽 원의 정보 : ");
		outer.output();
	}
	
	
}
