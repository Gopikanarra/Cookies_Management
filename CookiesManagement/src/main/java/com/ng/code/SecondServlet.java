package com.ng.code;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/test2")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String phone=request.getParameter("ph");
		String college=request.getParameter("clg");
		
		Cookie c3=new Cookie("phone",phone);
		Cookie c4=new Cookie("college",college);
		response.addCookie(c3);
		response.addCookie(c4);
		
		request.getRequestDispatcher("index3.html").forward(request, response);
	
	}

}
