package org.joonzis.ex;

import java.sql.Connection;
import java.sql.Statement;

import org.joonzis.db.DBConnect;

//CREATE TABLE PERSON(
//	    NAME VARCHAR2(10),
//	    AGE NUMBER,
//	    REGION VARCHAR2(20));
public class EX01_insert {
	public static void main(String[] args) {
		Connection conn = null;

		Statement st = null; // 오라클에서처럼 쿼리문 출력 시키기 위한 객체

		try {

			conn = DBConnect.getConnection(); //커넥션 객체

			// 커넥션 객체로부터 statement 객체 생성
			st = conn.createStatement();

			// 쿼리 문구 작성
			String sql = "insert into person values('스콧',99, 'incheon')";
			// 세미콜론 없음(!!!!!주의!!!!) - JDBC에서 쿼리를 작성할 때는 세미콜론(;)을 빼고 작성한다

			// 쿼리 날리기(DB로 sql 전달)
//			executeUpdate : insert, update, delete문 날릴때 사용
//			(메소드읠 리턴타입이 int)
			int result = st.executeUpdate(sql); // 결과 성공하면 1 실패하면 0으로 숫자 값으로 출력하기 때문에 int타입

			// 삽입 성공시 1, 실패시 0이 반환
			if (result == 1) {
				System.out.println("데이터 삽입 성공!");
			} else {
				System.out.println("데이터 삽입 실패ㅜㅜ");
			}

			conn.commit();

		} catch (Exception e) {
			e.printStackTrace();

			// 롤백 - 예외 발생한다면 롤백 해줘야지
			try {
				if (conn != null) {
					conn.rollback();

				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}finally {                    //객체 닫아주기
				
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
