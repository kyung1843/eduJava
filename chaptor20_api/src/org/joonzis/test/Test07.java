package org.joonzis.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

//현재 날짜를 StringBuffer, Calendar 클래스를 이용하여
//"2019년 10월 21일 월요일 오후 1시 10분" 과 같은 형식으로 완성하고 출력하시오.
//StringBuffer.append() 이용
//String[] weeks = {"","일","월","화","수","목","금","토"};
public class Test07 {
	public static void main(String[] args) {
		String[] weeks = {"","일","월","화","수","목","금","토"};  //요일은 숫자로 나오기 때매 편하게 인덱스로 사용
		StringBuffer sb = new StringBuffer();
		Calendar cal = Calendar.getInstance();
		
		sb.append(cal.get(Calendar.YEAR) + "년");
		sb.append((cal.get(Calendar.MONTH )+1) + "월");
		sb.append(cal.get(Calendar.DATE) + "일");
		sb.append(weeks[cal.get(Calendar.DAY_OF_WEEK)] + "요일");  //weeks 배열의 [번호]
		sb.append(cal.get(Calendar.AM_PM) ==0 ?  "오전" : "오후");
		sb.append(cal.get(Calendar.HOUR) + "시");
		sb.append(cal.get(Calendar.MINUTE) + "분");
		
		System.out.println(sb.toString());  //문자열 출력할때 toString() 습관처럼 쓰는게 좋다
		
		
		
		
	}
}
