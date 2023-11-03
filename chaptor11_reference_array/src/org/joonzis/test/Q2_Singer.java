package org.joonzis.test;
//생성자에서 이름 및 입력할 곡 수 초기화  ---> 배열의 크기 선언
//setsong메소드에서 배열의 인덱스idx 이용해 객체 대입
//배열의 객체 대입할 때마다 idx 증가...?
//출력메소드에서 1가수 3노래 출력  ---> songlist 배열 이용
public class Q2_Singer {

	String name;
	int idx;//(배열 인덱스에 접근용도)		
	Q2_Song[] songlist;//Song 객체 배열
	
	public Q2_Singer() {
		// TODO Auto-generated constructor stub
	}

	public Q2_Singer(String name, int songCnt) {
		this.name = name;                   
		songlist = new Q2_Song[songCnt];    // 배열의 크기 선언
	}
	
	
	void setSong(Q2_Song song) {
		songlist[idx] = song;     //songlist배열 안에 song인덱스 내용 넣기 // idx = 들어갈 인덱스 수
		idx++;                     //인덱스 하나씩 증가
	}
		
	
	void output() {
		System.out.println("가수 이름 : " + name);
		System.out.println("대표곡 ------------------------ ");
		for(int i = 0; i < songlist.length; i++) {
			songlist[i].output();
		}
	}
	
	
}
