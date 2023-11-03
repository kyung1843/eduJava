package org.joonzis.ex;

import java.util.TreeSet;

public class Ex06_TreeSet {
	public static void main(String[] args) {
		
		//TreeSet의 메소드르 사용하기 위해 Set 대신 TreeSet을 사용한다
		TreeSet<String> set = new TreeSet<String>();
		
		set.add("airplane");
		set.add("apple");
		set.add("area");
		set.add("disc");
		set.add("dance");
		
		/*
		 * 메소드 정의
		 * 1. headSet : 지정된 객체보다 작은 값의 객체들 반환
		 * 2. subSet :  범위 내 검색 결과 반환
		 * 3. tailSet :  지정된 객체보다 큰 값의 객체들 반환
		 */
		
		System.out.println(set.headSet("b"));  //b 보다 작은 a값들 반환
		System.out.println(set.subSet("a", "aq"));  //a~aq사이 값 반환
		System.out.println(set.tailSet("c"));   //c보다 큰 값 반환
		
		
		TreeSet<Integer> setInt = new TreeSet<Integer>();
		setInt.add(10);
		setInt.add(20);
		setInt.add(30);
		setInt.add(40);
		setInt.add(50);
		
		//15보다 작은 값
		System.out.println(setInt.headSet(15));
		//15~45 사이의 값
		System.out.println(setInt.subSet(15, 45));
		//35보다 큰 값
		System.out.println(setInt.tailSet(35));
	}
}
