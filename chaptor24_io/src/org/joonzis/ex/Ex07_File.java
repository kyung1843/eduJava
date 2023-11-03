package org.joonzis.ex;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class Ex07_File {
	public static void main(String[] args) {
		
		
		File file = null;   //File 클래스 추가하면 파일 관련 메소드 사용할 수 있다
		BufferedOutputStream bos = null;
		
		try {
			file = new File("myFile.txt");
			
			if(file.exists()) {
				bos = new BufferedOutputStream(new FileOutputStream(file));
				
				char ch = 'a';
				while(true) {
					bos.write(ch);
					if(ch == 'z') {
						break;
					}
					ch++;
				}
				
				System.out.println("파일 명 : " + file.getName());
				System.out.println("파일 경로1(절대 경로) : " + file.getAbsolutePath());
				System.out.println("파일 경로2(상대 경로) : " + file.getPath());
				
			}else {
				System.out.println("파일이 존재하지 않음");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(bos != null) {
					bos.close();
				}
				//파일 삭제
				//stream을 close() 한 후 삭제해야함
				if(file.delete()) {    //파일 삭제 했음으로 다시 실행시 실행X
					System.out.println("해당 파일을 삭제함");
				}else {
					System.out.println("해당 파일을 삭제하지 못했습니다");
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		
		
		
		
		
	}
}
