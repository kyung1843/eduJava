package org.joonzis.ex;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex06_FileCopy {
	public static void main(String[] args) {
		try {
			File file = new File("cat.jpg");

			if (file.exists()) {
				FileInputStream fis = new FileInputStream(file);// 파일 객체 접근하기 위해
				BufferedInputStream bis = new BufferedInputStream(fis);

				FileOutputStream fos = new FileOutputStream("cat.jpg");
				BufferedOutputStream bos = new BufferedOutputStream(fos);

				byte[] buffer = new byte[1024];

				long start = System.currentTimeMillis(); // 복사시작 시간 카운트
				while (bis.read(buffer) != -1) { // 더이상 읽어들일 데이터가 없으면 -1이 된다
					bos.write(buffer);
				}
				
				long end = System.currentTimeMillis(); // 복사 종료 시간 카운트

				System.out.println("복사시간  " + (end - start) + "밀리초");
				System.out.println("복사시간  " + (end - start) / 1000.0 + "밀리초");
			} else {
				System.out.println("파일이 존재하지 않습니다");
			}

		} catch (Exception e) {
			e.printStackTrace();

		}
	}
}
