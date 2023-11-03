package org.test001;

import java.util.Scanner;

public class Student {
	private String name;
	
	private int kor, eng, mat;
	private int sum;
	private double avg;
	private String isPass;

	public void input(Scanner sc) {
		System.out.println("학생 이름 입력>>");
		name = sc.next();
		System.out.println("국어 점수 입력>>");
		kor = sc.nextInt();
		System.out.println("영어 점수 입력>>");
		eng = sc.nextInt();
		System.out.println("수학 점수 입력>>");
		mat = sc.nextInt();

		sum += kor + eng + mat;
		avg = sum / 3.0;

		isPass = (avg >= 80) ? "합격" : "불합격";

	}

	public double getAvg() {
		return avg ;
	}

	public void setPass(String isPass) {
		this.isPass = isPass;
	}

	public void output() {
		System.out.println("학생 이름 : " + name);
		System.out.println("평균 성적 : " + avg);
		System.out.println("합격 유무  : " + isPass);

	}

}
