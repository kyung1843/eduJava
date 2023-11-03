package org.joonzis.test;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test_01 {
	public static void main(String[] args) {
		// 임의의 값 6개(중복제거), 입력받는 값 6개 비교해 맞는 개수와 해당번호 출력 //
		// *로또 및 선택번호는 1~45 사이의 값
		// 1.임의의 값 6개를 배열에 담는다(랜덤 이용)
		// 2.내가 선택한 값 6개를 배열에 담는다(Scanner사용)

		Scanner sc = new Scanner(System.in);

		Random random = new Random();

		System.out.println((random.nextInt() * 45) + 1);

		int[] lotto = new int[6];
		int[] my = new int[6];

		for (int i = 0; i < lotto.length; i++) {

			System.out.println(i + "번 인덱스 값  >> ");
			lotto[i] = (random.nextInt(45) + 1);

			for (int m = 0; m < i; m++) {                  // i전까지만 for문 돌림
				if (lotto[i] == lotto[m]) {                // 배열 내 값이 같은 경우 값이 중복되는 인덱스 뒤로 다시가서 값을 다시 받는다.
					i--;
				}

			}
		}

		System.out.println("6개의 숫자 입력 >>");
		for (int i = 0; i < my.length; i++) {
			my[i] = sc.nextInt();
		}

		System.out.println(Arrays.toString(lotto));
		System.out.println(Arrays.toString(my));

		int ckCount = 0;
//		String ckStr = "";
		int[] result = new int[6];

		for (int i = 0; i < lotto.length; i++) {
			for (int j = 0; j < my.length; j++) {

				if (lotto[i] == my[i]) {

//					ckStr += lotto[i] + " ";
					result[ckCount] += lotto[i];
					ckCount++;
				}
			}
		}
		// System.out.println("로또번호 : " + Arrays.toString(lotto));
		System.out.println("내번호 : " + Arrays.toString(my));
		System.out.println("맞은 개수 : " + ckCount);
//		System.out.println("맞은 번호 : " + ckStr);
		System.out.println("맞은 번호 : ");
		for (int i = 0; i < result.length; i++) {
			if (result[i] != 0) {
				System.out.println(result[i] + " ");
//				System.out.println(Arrays.toString(result));
			}
		}

	}

}
