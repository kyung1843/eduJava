package org.joonzis.test;
//User 클래스 					필드 : String id, password
//메소드 : Constructor, toString(), equals()
//User 인스턴스를 2개 생성하고, 동등 비교(id, password 모두 같으면 동등) 결과 출력
//각 인스턴스 정보는 toString 메소드를 통해 출력				

class User{
	//필드
	String id;
	String password;
	
	
	//method
	public User() {}
	
	public User(String id, String password) {
		super();
		this.id = id;
		this.password = password;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof User) {
			User u = (User)obj;
			if((id.equals(u.id) ) && (password.equals(u.password))){
				return true;
			}else {
				return false;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		
		
		
		
		return "id : " + id + ", 비밀번호 : " + password;
	}
	
	
	
}

public class Test02 {
	public static void main(String[] args) {
		User u1 = new User("kyung1843", "1234");
		User u2 = new User("kyung1843", "1234");
		
		if(u1.equals(u2)) {
			System.out.println("일치합니다");
			System.out.println(u1.toString());
			System.out.println(u2.toString());
		}else {
			System.out.println("일치하지 않습니다");
		}
		
	}
}
