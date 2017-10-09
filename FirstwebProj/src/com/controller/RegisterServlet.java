package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterProcess")
public class RegisterServlet extends GenericServlet {
	
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		System.out.println("**** Registered Successfully:service()");
		String FirstName= request.getParameter("firstname");
		String LastName= request.getParameter("lastname");
		String Email= request.getParameter("email");
		String Phone= request.getParameter("phone");
		String Gender= request.getParameter("gender");
		
		PrintWriter out=response.getWriter();
		
		out.println("<html><body>");
		
			out.println("<h3> YOU ARE REGISTERED SUCCESSFULLY</h3>");
			out.println("<p>");
			out.println("Registration Details:<br>");
			out.println("FirstName:"+FirstName);
			out.println("<br>");
			out.println("LastName:"+LastName);
			out.println("<br>");
			out.println("Email:"+Email);
			out.println("</p>");
			
		out.println("</body></html>");
	}

}
