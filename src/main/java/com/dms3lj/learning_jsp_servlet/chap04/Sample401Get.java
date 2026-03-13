package com.dms3lj.learning_jsp_servlet.chap04;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Sample401Get
 */
@WebServlet("/get_data")
public class Sample401Get extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		String param1 = request.getParameter("param1");
		String param2 = request.getParameter("param2");
		
		request.setAttribute("param1", param1);
		request.setAttribute("param2", param2);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/chap04/result.jsp");
		dispatcher.forward(request, response);
	}
}
