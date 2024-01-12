package org.Test02;
//1. 이름을 입력받아 파일(name.txt)에 저장하고 출력하는 프로그램
//- 이름 입력받기
//- 파일에 저장하기
//- 파일 내용 화면에 출력하기
//
//* 완료된 java 파일을 제출
//* 모든 java 파일들을 압축하여  이름.zip  형식으로 제출 

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하시오");
		String name = sc.next();
		
		String msg = name;  //스캐너 등을 이용해 입력받은 내용 저장 가능
		
		File file = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			file = new File("name.txt");
			fw = new FileWriter(file, false);  
			bw = new BufferedWriter(fw);
			
			bw.write(msg);
			bw.flush();
			
			System.out.println(".text 파일을 생성합니다");
			
			
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
