package org.joonzis.test;

import java.util.Scanner;

public class Q3_WeekScheduler {
	Q3_Day[] days; //스케줄 정보 // Day 를 각각 week배열 인덱스 번호당 하나씩 넣는다.
	Scanner scanner = new Scanner(System.in);
	String[] week = { "일", "월", "화", "수", "목", "금", "토" };

//	menu() : 목록 (1. 스케줄 생성, 2. 삭제, 3. 수정, 4. 보기, 0. 종료)
//	 makeSchedule() : 요일과 스케쥴을 입력 받아 해당 요일에 스케쥴 저장
//	 removeSchedule() : 요일을 입력 받아해당 요일의 스케쥴 삭제
//	 modifySchedule() : 요일과 스케쥴입력받아 해당  요일의 스케쥴수정
//	   					기존 스케쥴이 없는 경우에는 새로운 스케쥴 저장
//	 output() : 일주일간의 스케쥴전체출력
//	 exit() : 스케쥴러 종료(종료 명령 전까지계속 스케쥴러는 작동해야함)
//	 run() : 스케쥴러 실행
	public Q3_WeekScheduler() {
		days = new Q3_Day[7];
		for (int i = 0; i < days.length; i++) {
			days[i] = new Q3_Day(); // days 배열 초기화
		}
	}

	void menu() {
		System.out.println("*******************");
		System.out.println("1.스케줄 생성");
		System.out.println("2.스케줄 삭제");
		System.out.println("3.스케줄 수정");
		System.out.println("4.스케줄 보기");
		System.out.println("0.종료");
		System.out.println("*******************");
	}

	void makeSchedule() {
//		System.out.println("makeSchedule() 메소드 호출");           //제대로 동작하는지 검토용 출력

		// 무슨 요일에 스케줄 등록할 것인지
		// 해당 요일에 맍는 Q3_Day클래스에 스케줄이 있는 지 없는 지 판단
		// 스케줄 없으면 새로운 내용 입력해 저장
		// 스케줄 있으면 이미 스케줄이 존재한다고 출력

		System.out.println("스케줄 등록할 요일 선택 (일~토)>>");
		String weekday = scanner.next();

		for (int i = 0; i < week.length; i++) {
			if (weekday.equals(week[i])) {
				// 입력한 요일과 배열 내 인덱스의 값이 같으면
				if (days[i].getSchedule() == null) {
					// 스케줄이 비어있으면
					System.out.println("등록할 스케줄 입력");
					String schedule = scanner.next();
					days[i].setSchedule(schedule);
				} else {// 기존 스케줄이 있으면
					System.out.println(week[i] + "해당 요일에 스케줄이 있습니다");
				}
			}
		}
	}

	void removeSchedule() {
//		System.out.println("makeSchedule() 메소드 호출");
		// 스케줄 삭제 : 값 --> null 값 으로 변경되는것

		// 스케줄 삭제할 요일 입력받기
		System.out.println("스케줄 삭제할 요일 입력 >>");
		String weekday = scanner.next();

		for (int i = 0; i < days.length; i++) {
			if (weekday.equals(week[i])) {
				if (days[i].getSchedule() != null) {
					days[i].setSchedule(null);
					System.out.println(week[i] + "요일은 삭제할 스케줄이 없습니다");
				} else {
					System.out.println(week[i] + "요일의 스케줄을 삭제 했습니다");
				}

				// 요일에 해당하는 스케줄 저장 위치 찾기
				// 해당 요일에 스케줄이 있는지 없는지 판단
				// 스케줄 잇으면 "?요일의 스케줄을 삭제 했습니다" 출력
				// 스케줄 없으면 "?요일은 삭제할 스케줄이 없습니다"

			}
		}
	}

	void modifySchedule() {
//		System.out.println("makeSchedule() 메소드 호출");
		
		//스케줄 수정할 요일 선택
		System.out.println("스케줄 수정할 요일 선택(일~토) >>");
		String weekday = scanner.next();
		//입력값과 요일배열 데이터 비교
		for(int i = 0; i< week.length; i++) {
			if(weekday.equals(week[i])){
				if(days[i].getSchedule() == null){
					System.out.println("요일의 기존 스케줄이 없습니다");
					System.out.println("새 스케줄을 입력 하시겠습니까  > yes / no");
					String yes = scanner.next();
					
					if(yes.equalsIgnoreCase("yes")) {
						System.out.println("등록할 스케줄 입력 >>");
						String schedule = scanner.next();
						days[i].setSchedule(schedule);
						System.out.println(schedule);
					}else {System.out.println("변경된 스케줄이 없습니다.");}
				}else {System.out.println("변경할 스케줄 입력 >>");
						String schedule = scanner.next();
						days[i].setSchedule(schedule);
				}
			}
		}
		//스케줄 없으면 "요일의 기존 스케줄이 없습니다."
		//" 새 스케줄을 등록 하시겠습니까?  > yes / no"
		//yes 입력시 스케줄 등록, no입력시 "변경된 스케줄이 없습니다."
		//스케줄이 있으면 "변경할 스케줄 입력" --> 수정
		
		//next();  : 띄어쓰기 전까지
		//nextLine()  : 엔터 칠때까지
	}

	void exit() {
		System.out.println("<스케줄러 종료>");
		scanner.close();
		System.exit(0); // 시스템 끄기 = run(ctrl + f11)창의 빨간 불 꺼짐
	}

	void run() {
		while (true) {
			menu();
			System.out.println("작업 선택 >>");
			int choice = scanner.nextInt();
			scanner.nextLine(); // 개행 문자 날려주는 코드

//			if(choice == 1) {         //if문 써도 되고 while문 써도 된다
//				
//			}

			switch (choice) {
			case 1:
				makeSchedule();
				break;
			case 2:
				removeSchedule();
				break;
			case 3:
				modifySchedule();
				break;
			case 4:
				output();
				break;
			case 0:
				exit();
				break;
			default:
				System.out.println("다시 입력 하세요");
			}

		}
	}

	void output() {
		System.out.println("일주일의 전체 스케줄 출력 >>");
		for (int i = 0; i < week.length; i++) {
			System.out.println(week[i] + "요일 스케줄 : ");
			days[i].output();
		}
	}

}
