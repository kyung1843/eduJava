package org.joonzis.ex;

public class Ex01_Rect {

	//필드
	private int width, height;    //
	
	public Ex01_Rect() {
		// TODO Auto-generated constructor stub
	}
	
	
//	public Ex01_Rect(int width, int height) {
//		this.width = width;
//		this.height = height;
//	}
	
	
	
	
	
	
	void output() {
		System.out.println("너비 : " + width);
		System.out.println("높이 : " + height);
	}


	public int getWidth() {
		return width;
	}


	public void setWidth(int width) {
		this.width = width;
	}


	public int getHeight() {
		return height;
	}


	public void setHeight(int height) {
		this.height = height;
	}
	
}
