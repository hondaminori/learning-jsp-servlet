package com.dms3lj.learning_jsp_servlet.chap06;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class Sample601
 */
@WebServlet("/Sample602")
public class Sample602 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		request.setAttribute("data", "abc");
		HttpSession session = request.getSession(true);
		session.setAttribute("data", "あいうえお");
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/chap06/sample602.jsp");
		dispatcher.forward(request, response);
	}
}
