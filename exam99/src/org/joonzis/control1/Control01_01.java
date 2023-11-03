package org.joonzis.control1;

public class Control01_01 {
	public static void main(String[] args) {
		//세개의 과목 국어 89점, 영어 99점, 수학 78점인 점수와 총 점을 출력
		
		
		
		//내가 쓴 코드(배열)
//		int[] arr = {89, 99, 78};
//		
//		int sum = 0;
//		
//		for(int i = 0; i < arr.length; i++) {
//			sum+=arr[i];
//			System.out.println(arr[i]);
//		}System.out.println("총점 : " + sum);
//		
		
		
		//강사님 코드(변수)
		int kor = 89;
		int eng = 99;
		int mat = 78; 
		
		int total = kor + eng + mat;
		
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + mat);
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + (double)total/3);
		
		
		
		
		
		
	}
}
