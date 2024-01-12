package org.test001;

import java.util.Scanner;

public class Triangle {
	static double width;
	static double height;

	static void input(Scanner sc) {
		System.out.println("너비 입력>>");
		width = sc.nextDouble();
		System.out.println("높이 입력>>");
		height = sc.nextDouble();
	}

	static void output() {
		System.out.println("너비 : " + width);
		System.out.println("높이 : " + height);
		System.out.println("삼각형의 크기 : " + calcArea());
	}

	static double calcArea() {
		double result = (width * height) / 2;
		return result;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Triangle.input(sc);
		Triangle.output();

	}

}
