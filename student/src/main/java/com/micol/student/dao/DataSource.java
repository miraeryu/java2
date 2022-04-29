package com.micol.student.dao;

import java.sql.Driver;
import java.sql.DriverManager;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public class DataSource {  //싱글턴 class 패턴
	//DAO
	private static DataSource dataSource = new DataSource();
	private DataSource() {};
	
	private Connection conn;
	//db연동 부분
	private String driver;
//	= "oracle.jdbc.driver.OracleDriver";
	private String url;
//	= "jdbc:oracle:thin:@localhost:1521:xe";
	private String user;
//	= "micol";
	private String password;
//	= "1234";
	public static DataSource getInstance() {
		return dataSource;
	}
	//여기까지 싱글턴의 기본
	
	public Connection getConnection() {
		dbconfiguration();
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("****DB 연결 성공****");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			System.out.println("****DB 연결 실패****");
		}
		return conn;
	}
	
	private void dbconfiguration() {
		Properties properties = new Properties();
		String resource = getClass().getResource("/db.properties").getPath();
		try {
			properties.load(new FileReader(resource));
			driver = properties.getProperty("driver");
			url = properties.getProperty("url");
			user = properties.getProperty("user");
			password = properties.getProperty("password");
		} catch (IOException e) {
			e.printStackTrace();
		} 
				
	}

}
