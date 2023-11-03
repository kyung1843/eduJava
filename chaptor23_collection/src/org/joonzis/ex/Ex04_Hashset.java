package org.joonzis.ex;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex04_Hashset {
	public static void main(String[] args) {

		Set<String> set = new HashSet<String>();

		set.add("C");
		set.add("Spring");
		set.add("Java");
		set.add("DB");
		set.add("jsp");
		set.add("web");
		set.add("Java"); // 중복저장 시도  //자동으로 .equals 호출해서 하나만 저장

		// 반복자를 이용해 해당내용이 Spring인 데이터 삭제 itr.remove();
		// set 데이터 전체 울
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			if (itr.next().equals("Spring")) {
				itr.remove();
			}
		}
		
		// set.remove("Spring"); // set을 이용한 특정 객체 삭제
		// set.removeAll(set); //set을 이용한 전체 객체 삭제
		
		System.out.println(set);

	}
}
