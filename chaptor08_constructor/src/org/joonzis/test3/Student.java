package org.joonzis.test3;


public class Student {

	String name, dept; 
	Grade grade;
	
	
	private void Studetn() {
		
	}
	
	
	public Student(String n , String d, Grade g) {
		name = n;
		dept = d;
		grade = g;
	}
	
	
	
	
	
	void output() {
		System.out.println("이름 : " + name);
		System.out.println("학과 : " + dept);
		System.out.println("평균점수 : " + grade.getAverage());
		System.out.println("학점 : " + grade.getGrade());
		
		
		
	}
	
}
