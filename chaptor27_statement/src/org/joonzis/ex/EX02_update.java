package org.joonzis.ex;

import java.sql.Connection;
import java.sql.Statement;

import org.joonzis.db.DBConnect;

import oracle.jdbc.driver.DBConversion;

public class EX02_update {
	public static void main(String[] args) {
		
		
		
		//수정 조건
		//'스콧'의 나이를 21살로 변경
		//0 보다 크면 데이터 수정 성공 
		
//		1.Connection 객체 생성
//		  Connection 객체로 부터 쿼리 날릴 Statement 객체 생성
//
//		 2.쿼리 문구 작성
//		 3.쿼리 날리기
//		 4.데이터 수정 조건식 :  0 보다 크면 데이터 수정 성공 
//		 5.commit
//		3.catch문 - 에러내용 출력후 안에 
//		  3-1. 데이터 수정 실패시 롤백 예외처리문
//		
		Connection conn = null;
		Statement st = null;
		
		try {
			conn = DBConnect.getConnection();
			st = conn.createStatement();
			
			String sql = "update person set age = 21";
			
			int result = st.executeUpdate(sql);
			
			if(result > 0) {
				System.out.println("데이터 수정 성공");
			}else {
				System.out.println("데이터 수정 실패");
			}
			conn.commit();
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
			
			try {
				if(conn != null) {
					
				}
				conn.rollback();
			} catch (Exception e2) {
				e2.printStackTrace();
			}finally {
				try {
					if(st!=null) {
						st.close();
					}
					if(conn!=null) {
						conn.close();
					}
				} catch (Exception e3) {
					// TODO: handle exception
				}
			}
		}
		
		
		
		
		
		
		
		
	}
}
