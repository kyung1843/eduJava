package org.joonzis.ex;

class Box {   //제네릭타입 쓰지 않으면 Object타입으로 사용
//	필드
	private Object obj;

	public Object Box() {
		return obj;
	}

	public void setobj(Object obj) {
		this.obj = obj;
	}

	

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}
}

class Ballpen {
}

class Pencil {
}

public class Ex01_genefric {
	public static void main(String[] args) {
		Box box = new Box(); // 디포트 생성자가 자동으로 생성된 뒤 호출

//		box.setobj(1,2,3);

		box.setObj(new Ballpen());
//		box.getObj();

		Ballpen myPen = (Ballpen) box.getObj();// 볼펜을 빼려면 볼펜으로 캐싕 해줘야한다
		System.out.println(myPen);
	}
}
