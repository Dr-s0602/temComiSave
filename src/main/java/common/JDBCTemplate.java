package common;

import java.io.FileReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class JDBCTemplate {
	
	public static Connection getConnection() {
		Connection conn = null;
		
		try {
			//context.xml에 설정된 <Resource> 엘리먼트의 값들을 이용해서 
			//DBCP를 통해서 Connection을 얻어옴
			//톰캣의 DBCP를 통해서 Connection을 얻어옴
			Context initContext = new InitialContext();
			DataSource ds = (DataSource) initContext.lookup("java:comp/env/jdbc/oraDB");
			
			conn = ds.getConnection();
			conn.setAutoCommit(false);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return conn;
	}
	
	
	public static void commit(Connection conn) {
		try {
			if(conn != null && !conn.isClosed()) conn.commit();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void rollback(Connection conn) {
		try {
			if(conn != null && !conn.isClosed()) conn.rollback();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void close(Connection conn) {
		try {
			if(conn != null && !conn.isClosed()) conn.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static void close(Statement stmt) {
		try {
			if(stmt != null && !stmt.isClosed()) stmt.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void close(ResultSet rset) {
		try {
			if(rset != null && !rset.isClosed()) rset.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
