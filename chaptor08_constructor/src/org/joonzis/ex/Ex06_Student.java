package org.joonzis.ex;

import java.util.Scanner;

public class Ex06_Student {

	String name, dept, score1, score2;
	double avg;
	boolean isPass;
	
	public Ex06_Student(String n, String d) {
		name = n;
		dept = d;
		
	}
	
	void input(Scanner sc) {
		
		System.out.println("중간고사 점수 >>");
		score1 = sc.next();
		
		System.out.println("기말고사 점수 >>");
		score2 = sc.next();
		
		avg = (Double.parseDouble(score1) + Double.parseDouble(score2))/2;
		isPass = avg >= 80 ? true : false;
		
		
		if(avg >= 80) {
			isPass = true;
		}
		
		
		
	}
	
	
	
	void output() {
		System.out.println("이름 : " + name);
		System.out.println("학과 : " + dept);
		System.out.println("평균 : " + avg);
		
		if(isPass) {System.out.println("합격");
			
		}else {System.out.println("불합격");}
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
