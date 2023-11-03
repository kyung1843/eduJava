package org.joonzis.ex;

public class Ex04_Book {
	//필드 및 특정 메소드 private 처리
	//setter getter
	
	private String title;
	private String writer;
	private int price;
	private int salesVolume;     //판매량
	private boolean isBestSeller; //판매량이 1000이상이면 t, 아니면 f
	
	
	/*메소드
	 * setter getter , output(제목,저자, 가격, 판매량, 베스트세러/일반서적 출력 )
	 * 생성자
	 * 기본생성자
	 * 제목, 저자, 가격 생성자
	 * 제목, 가격 생성자 --> 저자는 "작자미상"*/
	
	public Ex04_Book() {
		// TODO Auto-generated constructor stub
	}

	
	

	public Ex04_Book(String title, int price) {
		this.title = title;
		this.price = price;
		String writer = "작자 미상";
	}




	public Ex04_Book(String title, String writer, int price) {
		this.title = title;
		this.writer = writer;
		this.price = price;
	}




	public String getTitle() {
		return title;
	}




	public void setTitle(String title) {
		this.title = title;
	}




	public String getWriter() {
		return writer;
	}




	public void setWriter(String writer) {
		this.writer = writer;
	}




	public int getPrice() {
		return price;
	}




	public void setPrice(int price) {
		this.price = price;
	}




	public int getSalesVolume() {
		return salesVolume;
	}




	public void setSalesVolume(int salesVolume) {
		this.salesVolume = salesVolume;
	}




	public boolean isBestSeller() {
		return isBestSeller;
	}




	public void setBestSeller(boolean isBestSeller) {
		if(salesVolume > 1000) {
			System.out.println('t');
		}else {
			System.out.println('f');
		}
	}
	
	
	public void output() {
		System.out.println("책 제목 : " + title);
		System.out.println("저자 : " + writer);
		System.out.println("책 가격 : " + price);
		System.out.println("책 판매량 : " + salesVolume);
		System.out.println(isBestSeller? "베스트셀러" : "일반서적");
	}
	
	
	
	
	
	
	
	
	
	
	
}
