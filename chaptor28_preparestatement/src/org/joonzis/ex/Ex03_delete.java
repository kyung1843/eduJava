package org.joonzis.ex;

import java.sql.Connection;
import java.sql.PreparedStatement;

import org.joonzis.db.DBConnect;

public class Ex03_delete {
	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement ps = null;
		
		try {
			
			conn = DBConnect.getConnection();
			
			String sql = "delete from person where name = '홍길동'";
			
			ps = conn.prepareStatement(sql);
			
			int result = ps.executeUpdate(sql);
			
			if(result > 0) {
				System.out.println("데이터 삭제 성공");
			}else {
				System.out.println("데이터 삭제 실패");
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
