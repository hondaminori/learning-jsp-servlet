package com.dms3lj.learning_jsp_servlet.chap11;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.dms3lj.learning_jsp_servlet.chap11.dbaccess.DBConnector;


public class StudentDAOImpl {
	private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String JDBC_URL = "jdbc:mysql://localhost:3306/school";
	private static final String JDBC_USER = "root";
	private static final String JDBC_PASSWORD = "root";
	
	private DBConnector dbConnector = null;
	PreparedStatement statement = null;
	ResultSet resultSet = null;

	public StudentDAOImpl() {
		dbConnector = new DBConnector(JDBC_DRIVER, JDBC_URL, JDBC_USER, JDBC_PASSWORD);
		dbConnector.init();
	}
	
	private Connection connect() {
		statement = null;
		resultSet = null;
		Connection connection = null;
		connection = dbConnector.connect();
		return connection;
	}
	
	private void close() {
		try {
			if(resultSet != null && !statement.isClosed()) {
				resultSet.close();
			}
		} catch (SQLException e) {
				throw new RuntimeException("ResultSetのクローズ処理に失敗しました");
		}
		try {
			if(statement != null && !statement.isClosed()) {
				statement.close();
			}
		} catch (SQLException e) {
			throw new RuntimeException("Statementのクローズ処理に失敗しました");
		}
	}
	
	public Student getStudentById(int id) {
		Student student = null;
		try {
			Connection connection = connect();
			String query = "SELECT * FROM student where id = ?";
			statement = connection.prepareStatement(query);
			statement.setInt(1, id);
			resultSet = statement.executeQuery();
			if (resultSet.next()) {
				String name = resultSet.getString("name");
				int grade = resultSet.getInt("grade");
			}
			close();
		} catch(SQLException e) {
			throw new RuntimeException("クエリの実行に失敗しました");
		}
		return student;
	}
}
