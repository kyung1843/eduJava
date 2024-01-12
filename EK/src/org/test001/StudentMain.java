package org.test001;

import java.util.Scanner;

public class StudentMain {
	public static void main(String[] args) {
		Student stu = new Student();

		stu.input(new Scanner(System.in));
		stu.output();
	}

}
