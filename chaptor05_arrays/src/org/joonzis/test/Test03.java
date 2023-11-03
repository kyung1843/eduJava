package org.joonzis.test;

public class Test03 {
 public static void main(String[] args) {
//	 Test02.java 의 값들을 모두 더하고, 총점과 평균을 출력
	 
	 
	 int[] arr = {10, 20, 50, 60, 13, 25, 97};
	 
	 int total = 0;
	 
	 for(int i = 0; i< arr.length; i++) {
		 total += arr[i];
		 
	 } double avg = (double)total / arr.length;
	 
	 	System.out.println("총점 : " + total);
	 	System.out.println("평균 : " +avg);
	 
	 	
	 	
	 	//test02.java의 값들 중 짝수 인덱스의 값을 모두 더하고 총점,평균 출력
	 	
//	 	int[] arr = {10, 20, 50, 60, 13, 25, 97};
//		 
//		 int total = 0;
//		 
//		 for(int i = 0; i< arr.length; i++) {
//			 if(i%2 ==0) {
//				 total = total + arr[i];
//			 }
//			 
//			 
//		 } double avg = (double)total / arr.length;
//		 
//		 System.out.println("총점 : " + total);
//		 	System.out.println("평균 : " +avg);
		 
}
}
