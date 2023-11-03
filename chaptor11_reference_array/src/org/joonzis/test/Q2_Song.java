package org.joonzis.test;

public class Q2_Song {
	String title, country;
	
	public Q2_Song() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	public Q2_Song(String title, String country) {
		this.title = title;
		this.country = country;
	}




	void output() {
		System.out.println("노래 제목 : " + title);
		System.out.println("국가 : " + country);
	}
	
	
}
