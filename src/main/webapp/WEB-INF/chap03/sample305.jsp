<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.dms3lj.learning_jsp_servlet.chap03.Employee" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>sample305</title>
</head>
<body>
	<h1>sample305</h1>
	<% List<Employee> employees = (List<Employee>)request.getAttribute("employees"); %>
	<% for(Employee employee: employees) {%>
		<p>名前：<%= employee.getName() %></p>
		<p>年齢：<%= employee.getAge() %></p>
	<% } %>
</body>
</html>