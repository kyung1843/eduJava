package org.joonzis.test2;

public class Song {

	String title, country;
	
	public Song() {}
	
	public Song(String t, String c) {
		title = t;
		country = c;
	}
	
	
	void output() {
		System.out.println("노래 제목 : " + title);
		System.out.println("나라 : " + country);
	}
}
