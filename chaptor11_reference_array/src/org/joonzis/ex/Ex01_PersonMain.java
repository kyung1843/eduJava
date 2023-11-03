package org.joonzis.ex;

public class Ex01_PersonMain {
	public static void main(String[] args) {
		//크기 3의 참조배열 people을 선언 후 값 입력
		
		Ex01_Person[] people = new Ex01_Person[3];  //person클래스 배열 선언 - 반복문과 뗄레야 뗄수 없는 사이
		
		
		people[0] = new Ex01_Person("김씨", 45, 168, '남');
		people[1] = new Ex01_Person("김씨", 45, 168, '남');
		people[2] = new Ex01_Person("김씨", 45, 168, '남');
		
		
		for(int i = 0; i < people.length; i++) {
			people[i].output();
			System.out.println("=====================");
		}
		
				
	}
}