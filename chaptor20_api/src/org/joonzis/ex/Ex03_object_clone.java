package org.joonzis.ex;


class Person implements Cloneable{
	private String name;
	private int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public Object clone() {// protected -> public 변경
		//예외처리는 clone()메소드 내에서 처리 try-catch
		
		Object obj = null;
		
		
		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return obj;
	}

	@Override
	public String toString() {
		return "이름 : " + name + ", 나이 : " + age;
	}
	
	
	
	
	
}



public class Ex03_object_clone {
	public static void main(String[] args) {
		
		Person woman = new Person("김옥분", 88);
		System.out.println(woman);
		
		//객체생성 없이 객체 복사하여 사용
		Person cloneWoman = (Person)woman.clone();  
		System.out.println(cloneWoman);
		
		
	}
}
