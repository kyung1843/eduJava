package org.joonzis.test;

//Score 클래스 					필드 : int kor, eng, mat
//메소드 : Constructor, toString(), equals()
//Score 인스턴스를 2개 생성하고, 동등 비교(세과목이 모두 같으면 동등) 결과 출력
//각 인스턴스 정보는 toString 메소드를 통해 출력

class Score{
	//필드
	private int kor;
	private int eng;
	private int mat;
	
	//method
	public Score() {}
	
	public Score(int kor, int eng, int mat) {
		super();
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof Score) {     //형 변환 가능한지 확인
			Score other =(Score)obj;          //다운캐스팅
				if((kor ==(other.kor)) && (eng ==(other.eng)) &&(mat == (other.mat)))                          {
					return true;
				}
		}else {
			return false;
		} 
		return false; 
	}

	@Override
	public String toString() {
		return "국어 점수 : " + kor + ", 영어점수 : " + eng + ", 수학 점수 : " + mat;
	}
	
	
	
	
	
}
public class Test01 {
	public static void main(String[] args) {
		Score s1 = new Score(50,100,80);
		Score s2 = new Score(50,100,80);
		
		
		if(s1.equals(s2)) {
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println("일치합니다");
		}else {
			System.out.println("일치하지 않습니다");
		}
	}
}
