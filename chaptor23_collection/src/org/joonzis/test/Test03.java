package org.joonzis.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//hashMap을 이용 하여 회원(Member)을 저장하시오.
//key : Member, value : 포인트 점수 
//동일한 회원은 저장될 수 없다.(map 사용시 중복 데이터 방지를 위해 hashCode(), equals()를 오버라이드 해야한다.)
//
//Member 클래스 			필드 :int no, String name, String memberShip
//						memberShip은 "VIP"/"GOLD"/"SILVER" 중 하나
//						메소드 : 생성자, hashCode(), equals(), toString()
//3명의 회원정보를 저장하시오.
//중복 회원도 입력하시오.
class Member {
	private int no;
	private String name;
	private String membership;

	public Member(int no, String name, String membership) {
		this.no = no;
		this.name = name;
		this.membership = membership;
	}

	@Override
	public int hashCode() {
		final int prime = 30;
		int result = 1;
		result = prime * result + ((membership == null)? 0 : membership.hashCode());
		result = prime * result + ((name == null)? 0 : name.hashCode());
		result = prime * result + no;
		return result;
	}
	
	/*해시코드를 더하고 31을 곱하고 있다
	 * 
	 * 31과 1을 사용하는 이유는 소수이면서 홀수이기 때문에
	 * 32로 곱셈을 하게되면 bit shift가 발생해서 한쪽이 0으로 차게 되므로 하지 않느다고 한다
	 * 소수를 사용하는 이점으 분명하지 않지만 전통적으로 널리 사용중*/

	@Override
	public boolean equals(Object obj) {
//		if (obj != null && obj instanceof Member) {
//			Member mem = (Member) obj;
//			if (name.equals(mem.name) && no == mem.no) {
//				return true;
//			}}
		
		//거짓인 경우를 다 걷어내고 난 뒤 true 리턴
		if(!(obj instanceof Member)) {
			return false;
		}
		
		Member other = (Member)obj;
		if(membership == null) {
			if(other.membership != null) {
				return false;
			}
			else if(!(membership.equals(other.membership))) {
				return false;
		}
			if(name == null) {
				if(other.name != null) {
					return false;
				}
				else if(!(name.equals(other.name))) {
					return false;
				}
				if(no != other.no) {
					return false;}
				}
		
		}
		return false;
		}

	@Override
	public String toString() {
		return "회원 이름 : " + name + ", 회원 점수 : " + no + ", 회원 등급 : " + membership;
	}
}

public class Test03 {
	public static void main(String[] args) {
		Map<Member, Integer> map = new HashMap<Member, Integer>();

		map.put(new Member(1, "김군", "Vip"), 100);
		map.put(new Member(2, "최군", "Gold"), 100);
		map.put(new Member(2, "최군", "Gold"), 100);

		Set<Member> set = map.keySet();
		Iterator<Member> itr = set.iterator();

		while (itr.hasNext()) {
			Member key = itr.next();
			Integer value = map.get(key);

			System.out.println("회원 이름 : " + key + ", 회원 점수 : " + value);

		}

	}
}
