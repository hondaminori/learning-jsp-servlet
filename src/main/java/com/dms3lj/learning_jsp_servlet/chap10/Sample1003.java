package com.dms3lj.learning_jsp_servlet.chap10;

import java.sql.Connection;

public class Sample1003 {

	public static void main(String[] args) {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/school";
		String user = "root";
		String password = "root";
		try {
			DBConnector dbConnector = new DBConnector(driver,url,user,password);
			dbConnector.init();
			System.out.println("データベース初期化");
			Connection connection = dbConnector.connect();
			System.out.println("データベース接続");
			dbConnector.close();
			System.out.println("データベースクローズ");
		} catch (RuntimeException e) {
			e.printStackTrace();
		}
	}
}
