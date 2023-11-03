
package org.joonzis.ex;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex01_FileOutput {
	public static void main(String[] args) {
		
		//바이트 기반 스트림
		FileOutputStream fos = null;      //주 스트림    
		BufferedOutputStream bos = null;  //보조 스트림
		
		try {
			/*
			 * FileOutputStream(생성할 파일의 경로 및 파일 이름)
			 * -경로 지정을 안하면 혀재 디렉토리에 파일 생성(상대 경로 : 현재 위치로 부터 파일의 위치) 
			 * -ex) c:/file/test.text(절대 경로 : 파일,사이트가 가진 고유 주소)
			 * */
			
			fos = new FileOutputStream("alphabet.txt");  //파일 //객체 생성하는 new 가 붙으면 예외 발생하므로 try-catch문
			bos = new BufferedOutputStream(fos); //보조스트림 생성자에 주스트림 던져줌
			
			char ch = 'A';       //아스키 코드 시작 문자
			while(true) {
				bos.write(ch);
				if(ch =='z') {   //아스키 코드 종료 문자
					break;
				}
				ch++;            //아스키코드 다음 문자
			}
			
			
			bos.flush();    //중요!  버퍼 비워주기
			
			System.out.println("alphabet.text 파일 생성!!");
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			//버퍼를 사용한 클래스는 finally에서 객체 소멸시켜 효과적으로 메모리 관리 할 수 있다
			
				try {
					if(bos != null) {
						bos.close();
				}
					if(fos != null) {
						fos.close();
					}} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
	}

