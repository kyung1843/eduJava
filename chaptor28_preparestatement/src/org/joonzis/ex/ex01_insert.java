package org.joonzis.ex;

import java.sql.Connection;
import java.sql.PreparedStatement;

import org.joonzis.db.DBConnect;

public class ex01_insert {
	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement ps = null;  //사용하는 이유는 sql값을 변수처리 할 수 있기 때문
		
		try {
			
			conn = DBConnect.getConnection();
			
			String sql = "insert into person values(?,?,?)"; //나중에  setter로 값 채워야함
			                                                 //?는 동적으로 원하는 값 그때그때 넣을 수 있게 하는 것
			ps = conn.prepareStatement(sql); //미리 sql 생성해서 던짐
			
			ps.setString(1, "홍길동");  //테이블에서 데이터 타입 확인하고 맞춰줌
			ps.setInt(2, 50);
			ps.setString(3, "busan");
			
			int result = ps.executeUpdate();
			if(result>0) {
				System.out.println("데이터 삽입 성공!");
			}else {
				System.out.println("데이터 삽입 실패ㅜ");
			}
			conn.commit();
			
	
		} catch (Exception e) {
			e.printStackTrace();
			
			try {
				if(conn != null) {
					conn.rollback();
				}
				
			} catch (Exception e2) {
				e2.printStackTrace();
				
				
				
			}finally {
				try {
					if(ps != null) {
						ps.close();
					}
					if(conn != null) {
						conn.close();
					}
				} catch (Exception e3) {
					e3.printStackTrace();
				}
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
