package org.joonzis.test;

public class Q2_SingerSongMain {
	public static void main(String[] args) {
		//1.singer 객체 생성
		//2.song 객체 3개 생성
		//song 객체 각각 setSong에 전달
		//singer 내용 출력
		
		Q2_Singer singer = new Q2_Singer("rmfprhfl", 3);
		
		Q2_Song song = new Q2_Song();
		Q2_Song song1 = new Q2_Song();
		Q2_Song song2 = new Q2_Song();
		
		song = new Q2_Song("djfsk ", " 미국");
		song1 = new Q2_Song("lkdjfe ", " 캐나다");
		song2 = new Q2_Song("dkf ", "한국 ");
		
		singer.setSong(song);
		singer.setSong(song1);
		singer.setSong(new Q2_Song("아ㅓㄹ니","이널"));
		
		
		singer.output();
			
		}
		
	}


