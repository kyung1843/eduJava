package org.joonzis.control2;

public class Control02_07 {
	public static void main(String[] args) {
		/*피보나치 수열은 앞의 두 수를 더해서 다음 수를 만들어나가는 수열이다.
	예를 들어 앞의 두 수가 1과 1이라면 그 다음 수는 2가 되고
	그 다음 수는 1과 2를 더해서 3이 되어서 1,1,2,3,5,8,13,21...과 같은 식으로 진행된다. 
	1과 1부터 시작하는 피보나치수열의 10번째 수는 무엇인지 계산하시오.*/
		
		
		
		
		int num1 = 1;
		int num2 = 1;
		int count= 0;	//~번째 수 지정
		System.out.print(num1 + " " + num2  + " ");
		for (int i=0; i<8; i++) {	// 2번째 수 까지 정해졌기 때문에 8번만 반복하면 됨
			count = num1 + num2;
			num1 = num2;
			num2 = count;

			System.out.print(count + " ");
		}
		System.out.println("피보나치수열의 10번째 수 : " + count);
		
		
		
		
		
		
		
	}
}


