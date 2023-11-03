package org.joonzis.ex;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class Ex02_FileInput {
	public static void main(String[] args) {

		FileInputStream fis = null; // 주 스트림
		BufferedInputStream bis = null; // 보조 스트림

		try {
			fis = new FileInputStream("alphabet.txt");
			bis = new BufferedInputStream(fis);
			
			//A~z
			int ch = 0;   //char ch가 아님 주의!! 읽을 때에 int
			
			while(true) {
				ch = bis.read();  //read() 메소드의 리턴이 int 타입(아스키 코드 10진수 값)
				                  //파일이 끝나면 -1을 리턴
				
				if(ch == -1) {
					break;
				}
				System.out.print((char)ch);
			}
		} catch (Exception e) {

			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(bis != null) {     //닫을 땐 역순으로 닫는다 1 2 3 생성 ==>  3 2 1 순서로 close
					bis.close();
				}
				if(fis != null) {
					fis.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

}
