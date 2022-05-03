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
	//자기자신을 객체로 인스턴스를 하나 생성/ 프라이빗으로 나의 생성자도 하나 생성 (다른 애들이 나를 생성하지 못하게끔 만들기 위해)
	
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
	//나를 호출해서 사용할 인스턴스를 하나 생성 -> stack의 데이터객체를 참조할 수 있도록 //참조로 올라갈 경우 - class 공유 - static
	//여기까지 싱글턴의 기본
	
	public Connection getConnection() {
		dbconfiguration();
		try {
			Class.forName(driver); //오라클 드라이버 로드
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("****DB 연결 성공****");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			System.out.println("****DB 연결 실패****");
		}
		return conn;
	}
	
	private void dbconfiguration() { //외부 파일을 읽어들이는 방법
		Properties properties = new Properties();
		String resource = getClass().getResource("/db.properties").getPath(); //db.properties 파일을 읽어옴
		try {
			properties.load(new FileReader(resource));
			driver = properties.getProperty("driver"); //properties는 property들의 집합. property를 호출하면 이에 대한 value값(주소 등)을 불러옴
			url = properties.getProperty("url");
			user = properties.getProperty("user");
			password = properties.getProperty("password");
			//왜 이렇게 만드는가? 서버에는 컴파일러가 없다. 여기에 쓰면 편하지만 수정할 경우 컴파일이 필요하다. 그러나 따로 파일을 만들어서 저장하면 수정하고 리스타트만 해주면 된다.
		} catch (IOException e) {
			e.printStackTrace();
		} 
				
	}

}
