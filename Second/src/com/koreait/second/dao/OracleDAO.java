package com.koreait.second.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class OracleDAO {
	
	public static void main(String[] args) {
		OracleDAO dao = new OracleDAO();
		try {
			dao.getConn();
		} catch(Exception e) {
			
		}
		
	}
	
	public Connection getConn() throws Exception { // try catch문 대신 throws Exception로 예외 넘기기도 가능 
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String userName = "hr";
		String password = "koreait2020";
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(url, userName, password);
		System.out.println("접속 성공!!!");
		
		return con;
	}
}
