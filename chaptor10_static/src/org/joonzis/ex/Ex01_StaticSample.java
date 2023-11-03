package org.joonzis.ex;

import javax.swing.JOptionPane;

public class Ex01_StaticSample {
	
	static final double PI = Math.PI;
	
	public static void main(String[] args) {
		
		//그동안 사용한 static 멤버들
		System.out.println();
		JOptionPane.showInputDialog("입력메세지");    //입력 메세지 팝업으로 뜨는 스캐너
		
		                                           //static은 글씨가 기울기가 있음
		//공통점 : new가 없다(객체 생성을 안한다)
		PI = 123;
		System.out.println(PI);
		
		
		
		
		
		
		
	}
}
