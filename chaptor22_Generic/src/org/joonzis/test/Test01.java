package org.joonzis.test;

import java.util.Arrays;

//문자/정수/실수 타입의 배열을 전달하고 데이터 타입을 체크하여
//해당 데이터 타입과 해당 배열의 데이터들을 출력
//class TypeCheckClass - 필드 : T[] arr
//   					  메소드 : String checkType(T[] arr), toString()
//   					  
// 출력 예시 : 배열 데이터는 [1, 3, 5]이고 데이터 형태는 정수형 입니다
class TypeCheckClass<T>{
	private T[] arr;   //필드
	
	
	public String checkType(T[] arr) {    //메소드
		this.arr = arr;
		
		if(arr instanceof Integer[]) {
			return "정수형 입니다";
		}else if(arr instanceof Double[]) {
			return "실수형 입니다";
		}else {return "문자열 입니다";}
		
	}
	

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("배열의 데이터는 ").append(Arrays.toString(arr)).append("이고");
		sb.append("배열의 데이터는 ").append(checkType(arr));
		
		return sb.toString();
	}
}

public class Test01 {
	public static void main(String[] args) {
		
		
		Integer[] arr1 = {1,2,3, 4};
		Double[] arr2 = {1.1, 2.2, 3.3, 4.4};
		String[] arr3 = {"개발", "너무", "어렵", "자냐"};
		
		TypeCheckClass<Integer> tc = new TypeCheckClass<>(); 
		
		
		tc.checkType(arr1);
		
		System.out.println(tc);
	}
}
