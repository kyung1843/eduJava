package org.joonzis.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;


//로또 & 빙고 (빙고가 어려우면 로또부터 해보기)
//Set을 이용하여 5 X 5 Bingo 배열을 생성하시오. (1 ~ 25)
//Set에 랜덤 생성 -> Bingo 2차원 배열에 저장 
public class Test02 {
	public static void main(String[] args) {
		//로또
		//6개의 랜덤번호(중복 제거)
		//6개의 내가 선택한 번호
//		 비교 ==> 맞은 개수, 맞은 숫자
		 Set<Integer> set = new HashSet<Integer>();  //자체 중복제거
		 
		 //로또번호
		 while(set.size() < 6) {
			 set.add((int)(Math.random()*45)+1);
		 }
		 
		 System.out.println(set);
		
		//내가 선택한 번호
		 int[] lotto = new int[6];    //ArrayList써도 됨
		 Scanner sc = new Scanner(System.in);
		 for(int i = 0; i < lotto.length; i++) {
			 System.out.print((i+1) + "번 숫자 입력 >>");
			 lotto[i] = sc.nextInt();
		 }
		
		 System.out.println(Arrays.toString(lotto));
		 
		//set을 반복자를 이용해 해당 데이터와 lotto배열의 데이터 비교
		 //맞는 데이터 있으면 개수+1, 번호추가
		Iterator<Integer> itr = set.iterator();
		int cnt = 0;
		String result = "";
		while(itr.hasNext()) {
			int tmp = itr.next();
			for(int i = 0; i < lotto.length; i++) {
				if(tmp == lotto[i]) {
					cnt++;
					result += tmp + "";
				}
			}
			}
		
		System.out.println("맞은 개수 : " + cnt);
		System.out.println("맞은 숫자 : " + result);
		
		
		System.out.println("=========================");
		
		
	}
}
