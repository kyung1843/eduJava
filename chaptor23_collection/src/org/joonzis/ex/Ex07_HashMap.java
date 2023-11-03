package org.joonzis.ex;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class Ex07_HashMap {
	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		//데이터 추가 : put(key, value)
		map.put("할머니", 120);
		map.put("할아버지", 120);
		map.put("엄마", 53);
		map.put("아빠", 56);
		map.put("동생", 10);
		map.put("동생", 3);   //key중복 발생(중복된 key로 삽입하려고 하면 기존 value값이 수정된다)
		
		//데이터 삭제 : remove(key);
		map.remove("할머니");
		
		//크기 확인 : size()
		System.out.println("entry 개수 : " + map.size());
		
		//반복자는 key를 통해서 순회한다(반복자의 타입 == key의 타입)
		//1. map의 key를 set에 저장한다
		//2. map에서 key만 빼서 순회한다
	
		Set<String> set = map.keySet();      //1번
		Iterator<String> itr = set.iterator();//2번
		
		//저장된 value 가져오기 : get(key);
		while(itr.hasNext()) {
			String key = itr.next();
			Integer Value = map.get(key);
			
			System.out.println("이름(key) : " + key + ", 나이(value) :" + Value);
		}
		
		System.out.println("================================");
		
		//itr을 순회하고 나면 사용된 itr은 재사용x
		//새로 itr 값을 받아서 사용해야한다
		//itr = set.iterator(); 다시 정보 얻어옴
		while(itr.hasNext()) {
			String key = itr.next();
			Integer Value = map.get(key);
			
			System.out.println("이름(key) : " + key + ", 나이(value) :" + Value);
		}
		
		
		System.out.println("===============================");
		
		System.out.println(map);   //키 = 값 형태의 배열
		map.clear();  //map의 모든 객체 삭제
		System.out.println(map);  //키=값 형태의 배열
		
		
		
		
	}
}
