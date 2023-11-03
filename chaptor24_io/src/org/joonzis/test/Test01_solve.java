package org.joonzis.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test01_solve {
	public static void main(String[] args) throws IOException {
		//입력
//		File file = new File("nationalAnthem.txt");
//		BufferedReader br = new BufferedReader(new FileReader(file));
		
		BufferedReader br = new BufferedReader(new FileReader("nationalAnthem.txt"));
		
		
		//출력
		BufferedWriter bw = new BufferedWriter(new FileWriter("nationalAnthem2.txt"));
		
		String line = "";
		while(true) {
			line = br.readLine();
			
			if(line == null) {
				break;
			}
			bw.write(line);
			System.out.println(line);
		}
		
		
		
		
		
		
		
	}
}
