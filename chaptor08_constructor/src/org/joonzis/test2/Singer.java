package org.joonzis.test2;

public class Singer {

	String name;
	Song song;
	
	
	public Singer(String n, Song s) {
		name = n;
		song = s;
	}
	
	void setSong(Song song) {
		this.song = song;
	}
	
	void output() {
		System.out.println("가수 이름" + name);
		song.output();
	}
}