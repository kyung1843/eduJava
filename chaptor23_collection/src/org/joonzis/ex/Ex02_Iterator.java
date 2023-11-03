package org.joonzis.ex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex02_Iterator {
	public static void main(String[] args) {
		//10. 20, 30, ... , 100까지 list에 저장하기
		List<Integer> list = new ArrayList<Integer>();
//		for(int i = 1; i < 11; i++) {
//			list.add((i+1)*10);
//		}
		for(int i = 1; i < 101; i+=10) {
			list.add(i);
		}
		
		//반복자 호출
		Iterator<Integer> itr = list.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
	
	}
}
