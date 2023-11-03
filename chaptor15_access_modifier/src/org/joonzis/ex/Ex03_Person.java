package org.joonzis.ex;

public class Ex03_Person {

	private String name;
	private int age;
	private double height;
	private char gender;
	
	
	public Ex03_Person() {
		// TODO Auto-generated constructor stub
	}


	public Ex03_Person(String name, int age, double height, char gender) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.gender = gender;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		//나이는 1~150살 사이만 입력 가능
				if(age >=1 && age < 150) {
					this.age = age;
				}else {System.out.println("범위 내 나이 값으로 입력 해주세요");}
	}


	public double getHeight() {
		return height;
	}


	public void setHeight(double height) {
		this.height = height;
	}


	public char getGender() {
		return gender;
	}


	public void setGender(char gender) {
		if(gender=='남'|| gender == '여' ) {
			this.gender = gender;
		}
		
	}
	
	
	
	
	
	
	
	
	
}
