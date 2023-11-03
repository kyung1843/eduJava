package org.joonzis.ex;

import java.util.Random;

public class Ex01_Random {

	public static void main(String[] args) {
		Random ran = new Random();
	
		System.out.println(ran.nextInt());
		System.out.println(ran.nextInt(10));   //10개 중에 1개 난수 발생(0~9)
		
		
		//1~6 사이 난수 출력
		System.out.println(ran.nextInt(6));    //0~5  int형 범위 내 난수 발생 
		System.out.println(ran.nextInt(6)+1);  //1~6 
		
		System.out.println(ran.nextDouble());          //0~0.9999까지의 난수 발생(0 이상 1 미만)
		System.out.println(ran.nextDouble()*10);       //0~9.9999까지의 난수 발생(0 이상 1 미만)
		System.out.println((int)ran.nextDouble()*10);  //0~9까지의 난수 발생(0 이상 1 미만)
		
		//1~6사이의 난수 출력(double)
		System.out.println(((int)ran.nextDouble()*6)+1);
		
		System.out.println("=======================================");
		
		
		/*Math 클래스
		 * Math.random() 함수(메소드)는 내부적으로 Random 클래스의 nextDouble() 메소드를 사용한다
		 * 0 ~ 0.9999까지의 난수 발생(0 이상 1 미만)*/
		
		
		int rnd = ((int)(Math.random()*6)+1);
		System.out.println(rnd);
		
		
	}
	
	
	
	
	
	
	
	
	
}
