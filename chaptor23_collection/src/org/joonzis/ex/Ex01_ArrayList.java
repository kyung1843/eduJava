package org.joonzis.ex;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Ex01_ArrayList {
	public static void main(String[] args) {
		
		 List<Integer> list = new ArrayList<Integer>();  //()안에 초기 사이즈를 넣어줄 수 있다
		 
		 //1. 저장: add()
		 list.add(new Integer(1));   //1을 객체로 만들어서 저장
		 list.add(new Integer(2));   //1을 객체로 만들어서 저장
		 list.add(5);
		 list.add(4);
		 list.add(3);
		
		 //2. 저장된 요소 가져오기 : get()
		 System.out.println("첫번째 요소 : "+ list.get(0));
		 System.out.println("첫번째 요소 : "+ list.get(1));
		 System.out.println("첫번째 요소 : "+ list.get(2));
		 System.out.println("첫번째 요소 : "+ list.get(3));
		 System.out.println("첫번째 요소 : "+ list.get(4));
		 
		 
		//3. 크기 : size()  - length역할과 동일
		 for(int i = 0; i < list.size(); i++) {
			 System.out.println(list.get(i));
		 }
		 
		
		//4. 삭제 : remove(), clear()
		list.remove(0);   //0번 인덱스의 데이터 삭제
//		list.clear();     //저장된 모든 객체 삭제
		
		
		//5. 확인(저장 유무 확인) : contains()
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(5);
		list2.add(6);
		list2.add(7);
		for(int i = 0; i < list2.size(); i++) {
			if(list.contains(list2.get(i))) {
				System.out.println("중복되는 값 : " + list2.get(i));
			}
		}
		
		//6.컬렉션은 반복문 그냥 출력해도 된다
		System.out.println(list);
		
		//7. 정렬 : sort()
		Collections.sort(list);
		System.out.println("정렬 후 list: " + list);
		
		//8. 최악(최고)의 성능이 나타나도록 list의 모든 데이터를 삭제하시오
		while(list.size() > 0) {
			list.remove(0);   //최악!(앞의 인덱스부터 삭제) 0번 인덱스 삭제되면 1번인덱스가 0번 인덱스로 이동
			
			//추천!(뒤 인덱스부터 삭제)
			list.remove(list.size()-1);
			
			//ex)길이가 7인 배열  ==>  마지막 인덱스 6
			
			
		}
		
		
		
		
		
		
	}
}
