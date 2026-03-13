package com.dms3lj.learning_jsp_servlet.chap03;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Sample305
 */
@WebServlet("/Sample305")
public class Sample305 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		var dispatcher = request.getRequestDispatcher("WEB-INF/chap03/sample305.jsp");
		List<Employee> list = new ArrayList<>();
		list.add(new Employee("氏名1", 10));
		list.add(new Employee("氏名2", 20));
		list.add(new Employee("氏名3", 30));
		
		request.setAttribute("employees", list);
		
		dispatcher.forward(request, response);
	}
}
