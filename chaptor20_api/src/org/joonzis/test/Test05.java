package org.joonzis.test;

import java.util.Scanner;


class Name{
	
}
//성(lastName), 이름(firstName)을 각각 입력 받아
//하나의 이름(fullName)을 완성하시오. StringBuffer 클래스를 이용하시오.
//위의 방식으로 두 이름을 입력 받아 두 이름(fullName)의 동등 비교를 진행하시오.
public class Test05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StringBuffer name = new StringBuffer();
		
		System.out.println("last Nama(성) 입력 >>");
		String lm = sc.next();
		System.out.println("first name(이름) 입력 >>");
		String fm = sc.next();
		
		name = name.append(lm).append(fm);
		System.out.println(name);
		
		
		
		System.out.println("============================");
		
		
		StringBuffer name1 = new StringBuffer();
		System.out.println("last Nama(성) 입력 >>");
		name1.append(sc.next());
		System.out.println("first name(이름) 입력 >>");
		name1.append(sc.next());
		
		
		
		System.out.println(name);
		System.out.println(name1);
		
		
		if(name.toString().equals(name1.toString())) {
			System.out.println("같은 사람");
		}else {System.out.println("다른 사람");}
		
		
		
	}

	}
