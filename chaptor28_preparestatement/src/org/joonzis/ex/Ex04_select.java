package org.joonzis.ex;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.joonzis.db.DBConnect;

public class Ex04_select {
	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			
			conn = DBConnect.getConnection();
			
			String sql = "select * from person";
			
			ps = conn.prepareStatement(sql);
			
			rs = ps.executeQuery(sql);
			
			
			while(rs.next()) {
				System.out.println(rs.getString(1) + ","); //1 = 첫번째 칼럼
				System.out.println(rs.getInt(2) + ",");    //2 = 두번째 칼럼
				System.out.println(rs.getString(3));     
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null) {
					rs.close();
				}
				if(ps != null) {
					ps.close();
				}
				if(conn != null) {
					conn.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
