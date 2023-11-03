package org.joonzis.ex;

public class Ex06_String_buffer {
	//StringBuffer =  StringBuilder나 
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("apple");
		StringBuffer sb2 = new StringBuffer("apple");
		
		System.out.println("sb1 해시코드(주소)값 : " + sb1.hashCode());
		System.out.println("sb2 해시코드(주소)값 : " + sb2.hashCode());
		
		//검색 : 해시코드 비교 -> 같은 해시코드만(동등비교)
		
		//StringBuffer(데이터 실어나르는 택배차량)는 문자열을 만들어내고 연산하는 경우 사용
		StringBuffer sb = new StringBuffer();
		System.out.println("기본 버퍼 크기 : " + sb.capacity());
		//.capacity() : 버퍼 크기 알아볼때 사용, 기본은 16문자를 저장할 수 있다
		
		//sb에 문자열 추가
		//.append(추가할 값)
		sb.append("hello");
		sb.append("java").append("world");   //chaining 기법 : 계속 값을 이어서 추가
		System.out.println(sb);
		
		
		//삭제
		StringBuffer phone = new StringBuffer();
		phone.append("010-1234-5678");
		phone.deleteCharAt(3);        //삭제할 인덱스 적기
		phone.deleteCharAt(7);        //연달아 삭제할땐 앞서 삭제된 인덱스로 인해 인덱스번호 바뀐걸 감안해서 입력해야함
		
		System.out.println(phone);
		
		
	}
}
