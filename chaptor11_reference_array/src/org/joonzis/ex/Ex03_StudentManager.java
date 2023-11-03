package org.joonzis.ex;

import java.util.Scanner;

public class Ex03_StudentManager {
	//필드
		Ex03_Student[] arr;
		Scanner sc = new Scanner(System.in);
		int idx;
		
	//메소드 	
		public Ex03_StudentManager() {}
		
		public Ex03_StudentManager(int numOfStudent) {
			arr = new Ex03_Student[numOfStudent];
		}
		//학생 정보 입력 메소드
		
		 Ex03_Student input() {
			System.out.println("학생이름 >>");
			String name = sc.next();
			System.out.println("학과이름 >>");
			String dept = sc.next();
			System.out.println("중간 점수 >>");
			String score1 = sc.next();
			System.out.println("기말 점수 >>");
			String score2 = sc.next();
			
			
			return new Ex03_Student(name, dept, score1, score2);
		}
		//배열에 학생 객체 대입 메소드
		void addNewStudent(Ex03_Student student) {
			arr[idx] = student;
			idx++;
		}
		
		//전체 학생 정보 출력 메소드
		void outputAllStudent(Ex03_Student student) {
			for(int i = 0; i< arr.length; i++) {
				System.out.println((i+1) + "번 학생 정보 출력 ========");
				arr[i].output();
			}
		}
		
		//학생 전체 평균값 출력 메소드
		void outputAverage() {
			//학생들의 평균들의 평균 출력
			Ex03_Student s1 = new Ex03_Student();
			
			double sum = 0;
			double avg = 0;
			for(int i = 0; i < arr.length; i++) {      //arr.length 대신 idx 써도 가능
				sum += arr[i].getAverage();
			}
			avg = sum / arr.length;
			System.out.println("전체평균 : " + avg);
		}
		
		//특정 학생의 이름으로 학생 찾기
		void findStudent() {
			//찾는 학생 있으면 해당학생정보 출력
			//찾는 학생 없으면 "해당 학생이 존재하지 않습니다" 출력
			System.out.println("찾을 학생의 이름 입력 >>");
			String fname = sc.next();
			
			int cnt = 0;
			for(int i = 0; i< arr.length; i++) {   
				if(fname.equals(arr[i].name)) {
					arr[i].output();
					cnt++;
					
				}
				
			}
			if(cnt == 0) {
				System.out.println("학생이 존재하지 않습니다");
			}
			
		}
	






















}

