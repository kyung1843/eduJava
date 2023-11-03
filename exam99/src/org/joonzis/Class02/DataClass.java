package org.joonzis.Class02;

public class DataClass {
	InfoClass[] ic = new InfoClass[6];
	
	public DataClass() {
		ic[0] = new InfoClass("이것이 자바다", 30000, "신용권", "한빛미디어");
		ic[1] = new InfoClass("파이썬", 25000, "홍길동", "길벗");
		ic[2] = new InfoClass("정보처리기사", 35000, "기사", "길벗");
		ic[3] = new InfoClass("HTML", 15000, "꾸미기", "한빛미디어");
		ic[4] = new InfoClass("JSP&Servlet", 23000, "열혈", "길벗출판사");
		ic[5] = new InfoClass("오라클", 21000, "oracle", "A길벗 출판사");
	}
	
	
	
}
