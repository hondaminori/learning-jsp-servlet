<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.dms3lj.learning_jsp_servlet.chap03.Employee" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>sample304</title>
</head>
<body>
	<h1>sample304</h1>
	<% Employee employee = (Employee)request.getAttribute("empData"); %>
	<p>名前：<%= employee.getName() %></p>
	<p>年齢：<%= employee.getAge() %></p>
</body>
</html>