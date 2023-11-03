
package org.joonzis.method;

import java.util.Scanner;

public class Q1_Circle {
	
	static double radius;
	
	
	public static void calcArea(double r){
		System.out.println("원의 넓이 : " + Math.PI * r * r);
	}
	
	public static double calcRound(double r) {
		return 2*Math.PI*r;
	}
	
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("반지름 >> ");
	double radius = sc.nextDouble();
	calcArea(radius);
	System.out.println("원의 둘레 : " + calcRound(radius));
	
	sc.close();
		
		
		
		
	}
	}
