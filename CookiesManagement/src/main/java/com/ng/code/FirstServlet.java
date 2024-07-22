package com.ng.code;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/test1")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	String name=request.getParameter("name");
	String email=request.getParameter("email");
	
	Cookie c1=new Cookie("name",name);
	Cookie c2=new Cookie("email",email);
	response.addCookie(c1);
	response.addCookie(c2);
	request.getRequestDispatcher("index2.html").forward(request, response);
	
	
	}

}
