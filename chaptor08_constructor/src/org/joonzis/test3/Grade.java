package org.joonzis.test3;

public class Grade {

	int kor;
	int eng;
	int mat; 
	double average; 
	char grade;
	
	
	public Grade(int k, int e, int m) {
		kor = k;
		eng = e;
		mat = m;
	    average = getAverage();
		grade = getGrade();
	}
	
	double getAverage() {
		return (kor + eng + mat) / 3.0;
	}
	
	char getGrade() {
		
		char tmp;
		if(average >= 90) {
			tmp = 'A';
			}else if(average >= 80) {
				tmp = 'B';
			}else if(average >= 70) {
				tmp = 'C';
			}else {
				tmp = 'D';
			}
		return tmp; }
			
	
	//필드를 가져오려면 setter, 결과 가져가려면 getter
	
	
}
