package com.dms3lj.learning_jsp_servlet.chap03;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Sample303
 */
@WebServlet("/Sample303")
public class Sample303 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/chap03/sample303.jsp");
		
		List<String> list = new ArrayList<String>();
		list.add("Servlet");
		list.add(" And ");
		list.add("JSP");
		
		request.setAttribute("data", list);
		dispatcher.forward(request, response);
	}
}
