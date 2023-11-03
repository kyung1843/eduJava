package org.joonzis.Class03;

public class info {
	// 멤버변수, 속성, 전역변수
		// default : 접근제한자
		int empNo;         	//사원 식별번호
		String eName;    	//사원이름
		String job;         //직책
		String hireDate;   	//입사일
		int sale;           //급여
		int commission;   	//성과급
		int deptNo;         //부서식별번호
		
		public info() {  // 기본 생성자
		}
		
		// 1001, "송민호", "사원", "2007-03-01", 300, 0, 20
		// 외부로부터 데이터를 전달받는 생성자
		// this : 클래스 자기 자신
		public info(int e, String en, String j, String h, int s, int c, int d){
			this.empNo=e;
			this.eName=en;
			this.job=j;
			this.hireDate=h;
			this.sale=s;
			this.commission=c;
			this.deptNo=d;
		}
}
