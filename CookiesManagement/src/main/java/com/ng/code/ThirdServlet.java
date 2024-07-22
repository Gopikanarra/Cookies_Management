package com.ng.code;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Cookie;

@WebServlet("/test3")
public class ThirdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	String marks=request.getParameter("marks");
	
	Cookie [] cookies= request.getCookies();
	
	String name=cookies[0].getValue();
	String email=cookies[1].getValue();
	String phone=cookies[2].getValue();
	String college=cookies[3].getValue();
	response.setContentType("text/html");
	PrintWriter pw=response.getWriter();
	
	
	pw.print("<center>");
	pw.print("<table border='1'>");
	pw.print("<tr><th>name</th><td>"+name+"</td></tr>");
	pw.print("<tr><th>email</th><td>"+email+"</td></tr>");
	pw.print("<tr><th>phone</th><td>"+phone+"</td></tr>");
	pw.print("<tr><th>college</th><td>"+college+"</td></tr>");
	pw.print("<tr><th>marks</th><td>"+marks+"</td></tr>");
	pw.print("</center");
	
	
	
	
	}
}
