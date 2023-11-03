package org.joonzis.ex;

class Room<T1, T2> {

	// 필드
	private T1 furniture1;
	private T2 furniture2;
	
	//필드초기화 방법 1.생성자, 2.setter

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("첫번째 가구 : ").append(furniture1).append("\n");
		sb.append("두번째 가구 : ").append(furniture2);
		return sb.toString();  //sb의 StringBuffer 타입을 String 타입으로 변환하기 위해 toString() 이용
	}


	public void setFurniture1(T1 furniture1) {
		this.furniture1 = furniture1;
	}


	public void setFurniture2(T2 furniture2) {
		this.furniture2 = furniture2;
	}

	
	
}

//가구
class Chair {

	@Override
	public String toString() {
		return "의자";
	}

}

class Table {
	@Override
	public String toString() {
		return "책상";
	}
}

class Bed {
	@Override
	public String toString() {
		return "침대";
	}

}

class DressTable {
	@Override
	public String toString() {
		return "화장대";
	}

}

public class Ex04_generic {
	public static void main(String[] args) {
		
		Room<Table, Chair> room2 = new Room<>();
		
		room2.setFurniture1(new Table());
		room2.setFurniture2(new Chair());
		
		System.out.println(room2);
		
		System.out.println("==========================");
		
		Room<Bed, DressTable> room1 = new Room<>();
		room1.setFurniture1(new Bed());
		room1.setFurniture2(new DressTable());
		
		System.out.println(room1.toString());
		
		
		
		
		
		
	}
}
