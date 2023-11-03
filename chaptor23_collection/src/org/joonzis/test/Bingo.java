package org.joonzis.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Bingo {
	public static void main(String[] args) {
		Set<Integer> set1 = new LinkedHashSet<Integer>();
		
		//빙고 번호
		while(set1.size() < 25) {
			set1.add((int)((Math.random()*25)+1));  //Hashset : 범위가 넓어지면 정렬X
		}                                           //범위 넓어도 정렬 유지하려면 LinkedHashSet 사용
		System.out.println(set1);
		
		//2차원 배열 생성해 빙고번호 랜덤값 넣기
		int[][] bingo = new int[5][5];
		
		//set 인덱스 접근
		Iterator<Integer> itr = set1.iterator();
		for(int i = 0; i < bingo.length; i++) {
			for(int j =0; j < bingo[i].length; j++) {
				bingo[i][j] = itr.next();
				
				System.out.println(bingo[i][j] + "\t");
			}
			System.out.println();
		}
		
		//내가 부른 번호
		int[] lotto1 = new int[5];
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < lotto1.length; i++) {
				System.out.println((i+1)+"번 숫자 입력>>");
				lotto1[i] = sc.nextInt();
		}
		
		System.out.println(Arrays.toString(lotto1));
	}
}
