package org.joonzis.control1;

public class Control01_02 {

	public static void main(String[] args) {
		// 국어 99점, 영어 80점, 수학 96점의 평균 값을 실수형과 정수형으로 출력
		
		
		
		//나 : 배열로 풀이
//		int[] arr = {99, 80, 96};
//		
//		int sum = 0;
//		int avg = 0;
//		
//		for(int i = 0 ; i < arr.length; i++) {
//			sum += arr[i];
//			avg = sum / arr.length;
//		}System.out.println("실수 평균 : " + (double)avg);
//		System.out.println("정수 평균 : " + avg);
		
		
		//강사님 : 그냥 변수로 풀이
		int kor = 99;
		int eng =80;
		int math = 96;
		
		//3으로 나누는 것과 3.0으로 나누는 것과 자료형 타입이 달라진다.
		double avg = (kor + eng + math)/3.0;
		
		System.out.println("평균점수(실수형) = " + avg);
		System.out.println("평균점수(정수형) = " + (int)avg);
		
		
	}

}
