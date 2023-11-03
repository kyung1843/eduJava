package org.joonzis.test;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

//Up-Down 게임
//1 ~ 100 사이의 난수를 발생시켜 해당 값을 맞출때까지 게임을 진행하시오.
//다음의 경우 예외를 발생시키시오.
//1) 사용자가 1 ~ 100 이외의 값을 입력한 경우 NumberOutOfBoundsException 클래스를 이용하여 예외 처리
//2) 정수대신 다른 데이터 (예: 실수, 문자) 등을 입력한 경우
//3)class UpDown
class NumberOutOfBoundsException extends Exception {
	private static final long serialVersionUID = 1L;

	public NumberOutOfBoundsException(String message) {
		super(message);
	}
}

class Updown {

	private int answer;  //정답
	private int count;   //몇번안에 맞췄는지
	private Scanner scanner = new Scanner(System.in);

	public Updown() {
		answer = (int) ((Math.random() * 100) + 1);  //정답 = 1~100사이 난수
	}

	public int challenge() throws NumberOutOfBoundsException, InputMismatchException { // 이미 만들어진 예외는 따로 던질필요가없다.
		count++;  //돌때마다 횟수 증가
		System.out.print("1 ~ 100 사이의 정수 입력>>");
		int user = scanner.nextInt();
		if (user < 1 || user >100) {
			throw new NumberOutOfBoundsException ("1 ~100 사이의 정수를 입력하세요!");
		}
		return user;
	}

	public void play() {

		while (true) {     //무한반복문
			try {

				int user = challenge();   //횟수증가, 내가 입력한 숫자
				if (user > answer) {
					System.out.println("Down ↓↓");
				} else if (user < answer) {
					System.out.println("Up ↑↑");
				} else {
					System.out.println("정답 : " + answer + " ( " + count + "회 만에 성공 !! )");
					break;
				}
			} catch (NumberOutOfBoundsException e) {
				System.out.println(e.getMessage());
			} catch (InputMismatchException e) {
				System.out.println("정수만 입력하세요!");
				clearInputBuffer(); // 버퍼비우기
			}

		}
	}

	public void clearInputBuffer() {
		scanner.next();
	}

}

public class Test05 {
	public static void main(String[] args) {
		Updown game = new Updown();
		game.play();
		}

	
	
	

	}
