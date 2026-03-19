package com.dms3lj.learning_jsp_servlet.chap10;

public class Sample1001 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("ドライバのロードに成功しました");
		} catch (ClassNotFoundException e) {
			System.out.println("ドライバのロードに失敗しました");
		}
	}
}
