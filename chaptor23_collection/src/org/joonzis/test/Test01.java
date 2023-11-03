package org.joonzis.test;
//게시물을 저장하는 Board 클래스를 정의하고, ArrayList를 이용하여 3개의 게시물을 저장하시오.
//1~3번 게시물번호 중 하나를 입력 받아 해당 게시물을 삭제하시오.
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;


class Board{
	String title; String content; Date register;

	public Board(String title, String content) {
		this.title = title;
		this.content = content;
		this.register = new Date();
	}

	@Override
	public String toString() {
		return "Board [title=" + title + ", content=" + content + ", register=" + register + "]";
	}

}			 

public class Test01 {
	public static void main(String[] args) {
		
		List<Board> list = new ArrayList<Board>();
		
		list.add(new Board("공지사항1", "모든 회원 필독"));
		list.add(new Board("공지사항2", "모든 회원 필독"));
		list.add(new Board("공지사항3", "모든 회원 필독"));
		
		Scanner sc = new Scanner(System.in);
		System.out.println("삭제할 게시물 번호 >>");
		int delNum = sc.nextInt();
		
		list.remove(delNum -1);  //입력한 번호와 인덱스번호는 차이가 있으니까
		
		System.out.println("======================");
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		
	}
}
