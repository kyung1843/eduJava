package org.joonzis.test;
/*
	 * 1. 메인클래스를 보고 알맞은 클래스들을 구현하시오. 2. Product 클래스를 구현하시오. 필드 : T1 category, T2
	 * model 적절한 메소드 구현하기
	 */
class Product<T1,T2>{
	//필드
	T1 category;
	T2 model;
	
	public T1 getCategory() {
		return category;
	}

	public T2 getModel() {
		return model;
	}

	public void setCategory(T1 category) {
		this.category = category;
		
	}
	
	public void setModel(T2 model) {
		this.model = model;
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(category).append(",").append(model);
		return sb.toString();  //sb의 StringBuffer 타입을 String 타입으로 변환하기 위해 toString() 이용
	}
	
}

class Elec extends Product{
	
	@Override
	public String toString() {
		return "전자제품";
	}
	
	
}

class Tv extends Product{
	private String model;
	
	public Tv(String model) {
		this.model = model;
	}
	@Override
	public String toString() {
		return (String) model;
	}
	
	
}


class Life extends Product{

	@Override
	public void setCategory(Object category) {
		// TODO Auto-generated method stub
		super.setCategory(category);
	}

	@Override
	public void setModel(Object model) {
		// TODO Auto-generated method stub
		super.setModel(model);
	}
}

class Cup extends Product{

	@Override
	public void setCategory(Object category) {
		// TODO Auto-generated method stub
		super.setCategory(category);
	}

	@Override
	public void setModel(Object model) {
		// TODO Auto-generated method stub
		super.setModel(model);
	}

	
}
public class Test03 {
	
		
	public static void main(String[] args) {

		Product<Elec, Tv> product1 = new Product<>();
		Product<Life, Cup> product2 = new Product<>();

		product1.setCategory(new Elec());
		product1.setModel(new Tv("LG Tv"));
		
		System.out.println(product1);			// 출력 예시) 전자제품, LG TV
	}

}
