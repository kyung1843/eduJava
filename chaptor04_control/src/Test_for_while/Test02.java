package Test_for_while;

import java.util.Scanner;


public class Test02 {

	
	public static void main(String[] args) {
		
		
		
		/*Q. 입력받은 구구단만 출력하기
			ex) 4X1=4
				4X2=8
				4X3=12
				4X4=16
				...*/
		
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("구구단 수 입력>>");
//		int dan = sc.nextInt();
//		System.out.println(dan + "단");
//		
//		
//		for(int i = 2; i < 10; i++) {
//			for(int j = 2; j < 10; j++) {
//				System.out.println(i +  "x" + j + "=" + (i*j));
//				if(j > 10) {break;}		
//				}
//				break;}
//		
//		for(int i = 2; i <= 9; i++) {
//			System.out.println(dan + "x " + i + '=' + (i * dan));
//		}
//			
//		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("단수 입력 >> ");
		int dan = sc.nextInt();
		
		for(int i=1; i<=9; i++) {
			System.out.println(dan + "X" + i + "=" + (dan*i));
		}
		
//		int num = 1;
//		while(num < 10) {
//			System.out.println(dan + "X" + num + "=" + (dan*num));
//			num++;
//		}
//		
		
		
		
		
	}
}
