package org.joonzis.ex;

import java.io.*;   //파일안에 있는 모든 내용 가능

public class Ex03_FileOutput {
	public static void main(String[] args) {
		
		String msg = "가나다라마바사아자차카타파하";  //스캐너 등을 이용해 입력받은 내용 저장 가능
		
		//문자 기반 스트림(파일 작성시 주로 사용)
		
		File file = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		//저용량 파일 저장시 FileWriter만 사용해도 무방
		
		try {
			file = new File("Hanguel.txt");
			fw = new FileWriter(file, false);  //true : 이어쓰기, false : 덮어쓰기
			bw = new BufferedWriter(fw);
			
			bw.write(msg);
			bw.flush();
			
			System.out.println("Haguel.text 파일을 생성합니다");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(bw != null) {
					bw.close();
				}
				if(fw != null) {
					fw.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
