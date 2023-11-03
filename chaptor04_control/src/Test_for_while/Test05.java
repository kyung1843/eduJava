package Test_for_while;

public class Test05 {

	public static void main(String[] args) {
		
		
		//Q. 1 ~ 100 사이의 모든 정수 합계 출력하기
			//공식처럼 외워
		
		int sum = 0;          //변수 초기화
		
		for(int i = 1; i <= 100; i++) {
			sum = sum + i
					;   //누적 방법 1
			//sum += i;		//누적방법 2	(골라서 사용해)
			}
		
		System.out.println(sum);
		
	
		//1~100사이의 모든 정수 중 '짝수'의 합과 '홀수'의 합을 각각 구하여 출력하시오
		int sumOdd = 0;   //홀수 합의 변수
		int sumEven = 0;	//짝수 합의 변수
		
		int sum1 = 0;
		
		for(int i = 1; i <= 100; i++) {        
			if(i %2 == 0) {
				sumEven = sumEven + i;
			}else {
				sumOdd = sumOdd + i;
			}
			
		}	
			System.out.println("1~100 사이의 정수 중 짝수의 합은 = " + sumEven);
			System.out.println("1~100 사이의 정수 중 홀수의 합은 = " + sumOdd);
	
		
		
		
		
		
		
		
		
		
		
		
		}
	}	
