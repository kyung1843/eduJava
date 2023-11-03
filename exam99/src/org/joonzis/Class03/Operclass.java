package org.joonzis.Class03;

import java.util.Calendar;

public class Operclass {
		
	public Operclass() {	// 기본 생성자
		
	}
	// 평균 재직년수 구하는 메서드
	public void avgHireDate(InfoClass[] ic){
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int sum=0;	
		String hd;	
		String[] s;
		for(int i=0; i<ic.length; i++){
			hd = ic[i].hireDate;
			s = hd.split("-");
			sum += year-Integer.parseInt(s[0]); //현재년도-입사년도
		}
		double avg = sum/(ic.length*1.0);
		System.out.println(avg);
	}
	
	public void search(InfoClass[] ic, String year){
		String hd="";
		String[] h;
		String names="";
		
		for(int i=0; i<ic.length; i++){
			hd = ic[i].hireDate;
			h = hd.split("-");
			if(h[0].equals(year)){
				names=names+ic[i].eName+"_";
			}
		}
		if(names.equals("")){
			System.out.println("해당 사원이 없습니다.");
		}else{
			names = names.substring(0, names.length()-1);
			System.out.println(names);
		}
	}
}
