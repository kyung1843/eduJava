package org.joonzis.ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ex01_connection {
	public static void main(String[] args) {
		
		//1.connection 인스턴스
		Connection conn = null;
		
		
		try {
			
			//2.oracle jdbc 드라이브 로드  class.forName("드라이버 종류");
			 Class.forName("oracle.jdbc.driver.OracleDriver");//그냥 암기
			//Class.forName("com.mysql.jdbc.Driver");
			 //Class.forName("oracle.microsoft.jdbc.sqlserver.SQLServerDriver");
			
			 //3. 접속 정보 생성
			  String user = "scott";
			  String password = "tiger";
			  String url = "jdbc:oracle:thin:@LOCALhost:1521:xe";  //그냥 암기  //1521 : 포트번호, xe : 오라클 버전
			  /*Oracle : jdbc:oracle://localhost:1521:SID
			   * MYSQL : jdbc:mysql://localhost*/
			  
			//4.DriverManager : 자바를 오라클 jdbc에 연결시켜 주는 클래스
			  conn = DriverManager.getConnection(url, user, password);
			  
			  //5. 연결 확인 메세지
			  System.out.println("DB 연결 성공!!");
			  
			  //6. 연결 확인 후 접속 종료
			  conn.close();
			  
		} catch (ClassNotFoundException e) {
			System.out.println("jdbc 드라이버 오류");
		}catch(SQLException e) {
			
		System.out.println("DB 연결 오류");
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
