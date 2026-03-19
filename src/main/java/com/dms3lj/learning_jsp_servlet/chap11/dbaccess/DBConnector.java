package com.dms3lj.learning_jsp_servlet.chap11.dbaccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
	private String driver;
	private String url;
	private String user;
	private String password;
	private Connection connection = null;
	
	public DBConnector(String driver, String url, String user, String password) {
		this.driver = driver;
		this.url = url;
		this.user = user;
		this.password = password;
	}
	
	public void init() {
		try {
			Class.forName(driver);
		} catch(ClassNotFoundException e) {
			throw new RuntimeException("ドライバのロードに失敗しました");
		}
	}
	
	public Connection connect() {
		try {
			connection = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			throw new RuntimeException("データベースへの接続に失敗しました", e);
		}
		return connection;
	}
	
	
	public void close() {
		try {
			if(connection != null && !connection.isClosed()) {
				connection.close();
			}
		} catch(SQLException e) {
			throw new RuntimeException("接続のクローズに失敗しました", e);
		} finally {
			connection = null;
		}
	}
}
