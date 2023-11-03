package org.joonzis.ex;

import java.util.Scanner;

public class Ex02_student {
	
	private String name, dept, score1, score2;
	private double avg;
	private boolean isPass;
	
	
	
	public Ex02_student(String name, String dept) {
		this.name = name;
		this.dept = dept;
		
	}
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("중간고사 점수 입력 >>");
		score1 = sc.next();
		System.out.println("기말고사 점수 입력 >>");
		score2 = sc.next();
		
		avg = getAvg();
		isPass = isPass();
		
	}
	
	
	private double getAvg(){
//		return (Double.parseDouble(score1) + Double.parseDouble(score2))/2;
		double tmp = (Double.parseDouble(score1) + Double.parseDouble(score2))/2;
		return tmp;
		
		
	}
	
	
	private boolean isPass() {
		if(avg >= 80) {
			return true;
		}else {return false;}
		
		
	}
	
	
	public void output() {
		System.out.println("이름 : " + name);
		System.out.println("학과 : " + dept);
		System.out.println("평균 : " + avg);
		System.out.println("합격 여부 : " + isPass);
		
		
		
	}
	
	
	
	
	
	
}
