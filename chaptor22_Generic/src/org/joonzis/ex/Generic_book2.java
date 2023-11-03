package org.joonzis.ex;

class Product<k, m>{
	//field
	private k kind;
	private m model;
	
	
	//method
	public k getKind() {           //setter값 리턴
		return kind;
	} 
	public void setKind(k kind) {  //필드 초기화
		this.kind = kind;
	}
	public m getModel() {
		return model;
	}
	public void setModel(m model) {
		this.model = model;
	}
}

class Tv{
	
}

class Car{
	
}
public class Generic_book2{
	public static void main(String[] args) {
		Product<Tv, String> pro = new Product<>();
	pro.setKind(new Tv());
	Tv tv = pro.getKind();
	
	pro.setModel("삼성");
	String TvModel = pro.getModel();
	
	System.out.println(tv.toString());
	System.out.println(TvModel);
	}
}