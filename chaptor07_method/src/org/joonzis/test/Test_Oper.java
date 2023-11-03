package org.joonzis.test;

public class Test_Oper {
	//필드
	
	double val1;
	double val2;
	
	//메소드
	
	void plus(double num1, double num2) {
		System.out.println(num1 + num2);
		
		
	}
	void minus() {
		System.out.println(val1 - val2);
	}
	
	void multiplication(){
		System.out.println(val1*val2);
		
	}
	
	double division() {
		return val1 / val2;     //출력을 메인에서 하겠다
	}
}
