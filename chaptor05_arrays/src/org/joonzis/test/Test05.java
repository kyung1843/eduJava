package org.joonzis.test;

import java.util.Arrays;
import java.util.Scanner;

public class Test05 {
 public static void main(String[] args) {
//	 int[] arr = {13, 22, -3, 92, 55, 5}
//		배열에서 값을 바꾸고 싶은 인덱스 2개를 선택하여
//		서로 값을 바꾸어 값들을 출력
	 
	 int[] arr = {13, 22, -3, 92, 55, 5};
	 
	 Scanner sc = new Scanner(System.in);
	 
	 //인덱스 2개 선택
	 System.out.println("변경할 첫번째 인덱스 >>");
	 int idx1 = sc.nextInt();
	 System.out.println("변경할 두번째 인덱스 >>");
	 int idx2 = sc.nextInt();
	 
	 //임시변수 선언
	 int temp = 0;
	 
	 System.out.println("변경 전 데이터 : " + Arrays.toString(arr));
	 
	//값 서로 변경
	 temp = arr[idx1];
	 arr[idx1] = arr[idx2];
	 arr[idx2] = temp;
	 
	 //출력
	 System.out.println("변경 후 데이터" + Arrays.toString(arr));
	
	 
	
	 
	 
	 
	 
	 
	 
	 
}
}
