package com.dms3lj.learning_jsp_servlet.chap04;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Sample401Form
 */
@WebServlet("/Sample401Form")
public class Sample401Form extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		var dispatcher = request.getRequestDispatcher("WEB-INF/chap04/sample401.jsp");
		dispatcher.forward(request, response);		
	}
}
