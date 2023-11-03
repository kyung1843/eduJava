package org.joonzis.ex;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import org.joonzis.db.DBConnect;

public class Ex04_select {
	public static void main(String[] args) {
		
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;  //select 의 결과
		try {
			conn = DBConnect.getConnection();
			st = conn.createStatement();
			
			String sql = "select * from person";
	//*************executeQuery :  select문에서만 사용**********
			rs = st.executeQuery(sql);
			
			//rs에 저장된 데이터 출력
			//1. rows단위로 데이터 읽어들인다
			//2. 남아있는 row확인 - next()메소드 이용(true = 남아있다)
			//3.row는 컬럼의 집합이므로 각 컬럼 별로 뷴리하기 위한 getter 존재
			//name varchar2(10): rs.getString(1)  또는 rs.getString("name")
			//  ==> 컬럼의 인덱스는 1부터 시작
			//age int : rs.getInt(2) 또는 rs.getInt("age")
			//region varchar2(20) : rs.getString(3) 또는 rs.getString("region")
			
			while(rs.next()) {
				//CREATE TABLE PERSON(
//			    NAME VARCHAR2(10),
//			    AGE NUMBER,
//			    REGION VARCHAR2(20));
				System.out.println(rs.getString(1) + ","); //1 = 첫번째 칼럼
				System.out.println(rs.getInt(2) + ",");    //2 = 두번째 칼럼
				System.out.println(rs.getString(3));       //3 = 세번째 칼럼  즉 가져올 타입(칼럼 순서)

			}
			
			//select는 commit 필요 없다
			
		} catch (Exception e) {
			e.printStackTrace();
			
			
			}finally {
				try {
					if(rs!=null) {
						rs.close();
					}
					if(st!=null) {
						st.close();
					}
					if(conn != null) {
						conn.close();
					}
		
				
					}catch (Exception e) {
				e.printStackTrace();
	}
	}
  }
}

		
				

