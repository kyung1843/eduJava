package org.joonzis.String;

import java.util.Arrays;

public class Q2_MainClass {
	public static void main(String[] args) {
		
		Q2_DataClass dc = new Q2_DataClass();

		
		String con = dc.newsList.get(0).news;
		
		
		String keyword1 = "HTML5";
		String keyword2 = "하이브리드앱";
		
		//위 문자열을 " " 공백으로 잘라 배열화 시킨 후
		//배열 내 문자열을 비교해 결과 출력
		
		String[] arr = con.split(" ");
		int[] resultNum = new int[2];
		//int[] resuletNum = {0,0};
		resultNum[0]=0;   //html5의 노출횟수
		resultNum[1]=0;   //하이브리드의 노출횟수
		
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i].contains(keyword1)) {
				resultNum[0]++;
			}
			if(arr[i].contains(keyword2)) {
				resultNum[1]++;
			}
			}
			System.out.println(keyword1 + ':' + resultNum[0]);
			System.out.println(keyword2 + ':' + resultNum[1]);
		
		System.out.println("===============================================");
		// 문제 2. 위의 str 데이터를 모두 역순(space기준)으로
		// resultStr 변수저장하여 출력
		String[] resultStr=new String[arr.length];
		int index = (arr.length)-1;
			
		for(int i=0; i<arr.length; i++){
			resultStr[i]=arr[index];
			index--;
			}

		// 역순 출력
		for(int i=0; i<resultStr.length; i++){
			System.out.print(resultStr[i] + "/");
		}

		
		
		
		
		
		
		
		
	}
	}


