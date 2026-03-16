package com.dms3lj.learning_jsp_servlet.chap04;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Sample403Post
 */
@WebServlet("/post_params")
public class Sample403Post extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String[] languages = request.getParameterValues("languages");
		request.setAttribute("languages", languages);
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/chap04/sample403_result.jsp");
		dispatcher.forward(request,  response);
	}
}
