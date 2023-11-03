package org.joonzis.ex;

import java.sql.Connection;
import java.sql.PreparedStatement;

import org.joonzis.db.DBConnect;

public class Ex02_update {
	public static void main(String[] args) {
		
		
		Connection conn = null;
		PreparedStatement ps = null;
		
		try {
			
			conn = DBConnect.getConnection();
			
			String sql = "update person set name = ? , age = ?, region = ? where name = '홍길동'";
			
	        ps = conn.prepareStatement(sql); //미리 sql 생성해서 던짐
			
			ps.setString(1, "홍길동");  //테이블에서 데이터 타입 확인하고 맞춰줌
			ps.setInt(2, 100);
			ps.setString(3, "mapo");
			
			int result = ps.executeUpdate();
			
			if(result > 0) {
				System.out.println("데이터 업데이트 성공");
			}else {
				
				System.out.println("실패");
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
					if( ps != null) {
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
