package org.joonzis.ex;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


class User{
	private String id, pw;

	public User(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "아이디 : " + id;
	}

	@Override
	public int hashCode() {
		//return 1;              //해시코드값 저장하는 방법은 다양하다
		//return id.length();
		//return id.cahrAt(0);
		return id.charAt(0) + pw.length();
	}

	@Override
	public boolean equals(Object obj) {
		//id가 같으면 같은 user
		if(obj!=null && obj instanceof User) {
			User user = (User)obj;
			if(id.equals(user.id)) {
				return true;
			}
		}return false;
		
	}
	
	
}


public class Ex05_Hashset {
	public static void main(String[] args) {
		Set<User> set = new HashSet<User>();
		
		set.add(new User("admin", "1234"));
		set.add(new User("admin", "1234")); //인스턴스는 다르지만 내부 데이터가 동일하므로 1개만 저장
		
		Iterator<User> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("set의 총 객체 수 : " + set.size());
		
		
	}
}
