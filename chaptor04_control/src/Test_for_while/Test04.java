package Test_for_while;

public class Test04 {

	public static void main(String[] args) {
		
//		Q. 전체 구구단 출력하기_2
//		ex) 2x1 = 2 	3x1 = 3 	...		9x1 = 9
//			2x2 = 4		3x2 = 6		...		9x2 = 18
//			...
//			2x9 = 18	3x9 = 27 	...		9x9 = 81
	
		
		for(int j = 1; j<= 9; j++) {
			for(int i = 2; i < 10; i++) {
				System.out.print(i + "x" + j + "=" + (i * j) + "\t" );
				}
		System.out.println();	}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	}

