package org.joonzis.ex;

import java.sql.Connection;
import java.sql.Statement;

import org.joonzis.db.DBConnect;

public class Ex03_delete {
	public static void main(String[] args) {
		Connection conn = null;
		Statement st = null;
		
		try {
			conn = DBConnect.getConnection();
			st = conn.createStatement();
			
			String sql = "delete from  person where region = 'incheon'";
			
			int result = st.executeUpdate(sql);
			
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
