package org.joonzis.ex;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Ex04_FileInput {
	public static void main(String[] args) {
		
		File file = null;
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			file = new File("nationalAnthem.txt");
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			
			String line = "";
			
			while(true) {
				line = br.readLine();  // 한줄씩 읽는 메소드
				if(line == null) {
					break;
				}
				System.out.println(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
	}
}
