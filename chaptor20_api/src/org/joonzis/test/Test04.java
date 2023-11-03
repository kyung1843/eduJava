package org.joonzis.test;

import java.util.Random;

//Student 클래스				필드 : String no(학번), String name, int[] scores(국,영,수)
//double average, char grade, 상수 int COURSE_COUNT(과목수)
//메소드 : Student(String no, String name)
//  setter{
//	setScores(int kor, int eng, int mat) - 직접 입력
//	setScores(int[] scores) - 랜덤 입력
//	setAverage()
//	setGrade()
//	}
//  toString() 학번, 성명, 평균, 학점 출력
//  equals() 학번이 같으면 같은 학생으로 비교   
class Student{
	private String no, name;
	private int[] scores;
	private double average;
	private char grade;
	public static final int COURSE_COUNT = 3;  //상수는 static final // 값이 변하면 안되기때문에 필드 선언하면서 값 설정해야해
	
	public Student(String no, String name) {
		super();
		this.no = no;
		this.name = name;
		
		scores = new int[COURSE_COUNT];
	}
	

	public void setScores(int kor, int eng, int mat) {
		scores[0] = kor;
		scores[1] = eng;
		scores[2] = mat;
		setAverage();
		setGrade();
	}
	
	public void setScores(int[] scores) {
		this.scores = scores;
		setAverage();
		setGrade();
	}
	
	
	


	public void setAverage() {
		int sum = 0;
		for(int i = 0; i < scores.length; i++ ) {
			sum += scores[i];
		}
		average = (double)sum / COURSE_COUNT;
	}

	public void setGrade() {
		
		if(average >= 90) {
			System.out.println('A');
		}else if(average >= 80 ) {
			System.out.println('B');
		}else if(average >= 70){
			System.out.println('C');
		}else if(average >= 60) {
			System.out.println('D');
		}else {
			System.out.println('F');
		}
	}
	


	@Override
	public boolean equals(Object obj) {
		if(obj != null & obj instanceof Student) {
			Student stu = (Student)obj;
			return no == stu.no; 
			}else {
				return false;
				}
			}

	@Override
	public String toString() {
		return "학생 이름 : " + name + ", 학번 : " + no + ", 평균 : " + average + ", 학점 : " + grade;
	}  
	
}


public class Test04 {
	public static void main(String[] args) {
		
		Student student = new Student("15", "김군");
		student.setScores(90, 80, 70);
		System.out.println(student);
		
		Student student1 = new Student("16", "박군");
		int[] scores = new int[student.COURSE_COUNT];
		Random ran = new Random();
		for(int i = 0; i < scores.length; i++) {
//			scores[i] = (ran.nextInt(100)+1);
			scores[i] = (int)(Math.random()*101);
		}
		student1.setScores(scores);
		System.out.println(student1);
		
	
		
		if(student.equals(student1)) {
			student.toString();
			student1.toString();
			
			System.out.println("같은 학생이다");
			
		}else {
			System.out.println("다른 학생이다");
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
