package org.joonzis.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/*Q1. nationalAnthem 데이터파일을 읽어들여 화면에 출력하고, 
 * nationalAnthem2.txt 파일명으로 복사하는 프로그램 작성*/

public class Test01 {
	public static void main(String[] args) {

//		File file = null;
		FileReader fr = null; // 문자 입력 스트림
		BufferedReader br = null; // 입력 스트림 저장되는 버퍼

		FileWriter fw = null; // 문자 출력 스트림
		BufferedWriter bw = null; // 출력 스트림 저장되는 버퍼

		try {
//			file = new File("nationalAnthem.txt");  //헷갈리면 File 안써도 돼
			fr = new FileReader("nationalAnthem.txt"); // 복사할 파일
			br = new BufferedReader(fr);
			fw = new FileWriter("nationalAnthem2.txt"); // 붙여넣을 파일
			bw = new BufferedWriter(fw);

			String line = "";

			while (true) {
				line = br.readLine();
				if (line == null) { // 더이상 내용 없으면 멈추고, ()
					break;
				}
				bw.write(line + "\n"); // 그렇지 않으면 붙여넣을 파일에 내용 넣고 출력버퍼 비우기 BufferedWriter - 객체.flush
//				bw.write(line);   //\n과 동일내용
//				bw.newLine();
				System.out.println(line);

			}
			bw.flush();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null) { // 입력 버퍼 닫고
					br.close();
				}
				if (fr != null) {
					fr.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}
}
