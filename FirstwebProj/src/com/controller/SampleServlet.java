package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SampleServlet
 */
@WebServlet("/sampleServ")
public class SampleServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		out.println("<h2>This is a sample HttpServlet</h2>");
		Enumeration<String> headerNames=request.getHeaderNames();
		
		while (headerNames.hasMoreElements()) {
			String headerName = headerNames.nextElement();
			out.println(headerName+"::"+request.getHeader(headerName));
			out.println("<br>");
			
		}
	}

}
