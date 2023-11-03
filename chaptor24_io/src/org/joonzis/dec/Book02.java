package org.joonzis.dec;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Book02 {
	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream("파일 위치");

			byte[] data = new byte[100];

			while (true) {
				int num = is.read(data);
				if (num == -1) {
					break;
				}

				for (int i = 0; i < num; i++) {
					System.out.println(i);
				}

			}
			System.out.println(data);

			is.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
