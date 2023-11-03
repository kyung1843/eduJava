package org.joonzis.ex;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex05_FileCopy {
	public static void main(String[] args)throws IOException {
		
		//파일 복사
		//파일을 읽어와 내용 그대로 다른 파일로 출력하는 것
		
		
		//파일 읽어오기
//		FileInputStream fis = new FileInputStream("alphabet.txt");
//		BufferedInputStream bis = new BufferedInputStream(fis);
		//위 코드와 동일
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("alphabet.txt"));
		
		
		//복사본 파일 생성
//		FileOutputStream fos = new FileOutputStream("alphabet3.txt");
//		BufferedOutputStream bos = new BufferedOutputStream(fos);
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("alphabet2.txt"));
		
		//읽어와서 내보낸다
		int data;
		while((data = bis.read())!= -1) {
			bos.write(data);
			
			
		}
		bos.close();
		bis.close();
		
		
	}
}
