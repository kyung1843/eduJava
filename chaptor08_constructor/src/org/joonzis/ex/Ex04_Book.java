package org.joonzis.ex;

public class Ex04_Book {

	// field
	String title, writer;
	int price;
	int salesVolume;
	boolean isBestSeller;

	// method
	public Ex04_Book() {
	}

	public Ex04_Book(String t, int p) {
		title = t;
		price = p;
		writer = "작자미상";
		setSalesVolume(salesVolume);
		isBestSeller = true;
	}

	public Ex04_Book(String t, int p, String w) {
		title = t;
		price = p;
		writer = w;
		setSalesVolume(salesVolume);
		isBestSeller = true;
	}

	void setSalesVolume(int sales) {
		salesVolume = sales;
		if (sales >= 1000) {
			isBestSeller = true;
		}

	}

	void output() {
		System.out.println("책 제목 : " + title);
		System.out.println("책 가격 : " + price);
		System.out.println("책 저자 : " + writer);
		System.out.println("책 판매량 : " + salesVolume);
		System.out.println(isBestSeller ? "베스트셀러" : "일반서적");
	}

}
