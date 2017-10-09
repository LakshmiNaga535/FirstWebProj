package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import com.DAO.ProductDAO;
import com.vo.Product;

/**
 * Servlet implementation class ProductSearchServlet
 */
@WebServlet("/productSearch")
public class ProductSearchServlet extends GenericServlet implements Servlet {
	
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		
		int Id=Integer.parseInt(request.getParameter("productid"));
		
		ProductDAO productDAO=new ProductDAO();
		
		Product product=productDAO.getProductById(Id);
		
		PrintWriter out= response.getWriter();
		out.println("<html><body>");
		out.println("<h2 align= center>Product Details</h2>");
		out.println("<table border=2 aligh=center>");
		out.println("<tr><th>ProductId</th><th>ProductName</th><th>ProductPrice</th><th>ProductDescription</th>");
		out.println("<tr>");
		out.println("<td>"+product.getId()+"</td>");
		out.println("<td>"+product.getName()+"</td>");
		out.println("<td>"+product.getPrice()+"</td>");
		out.println("<td>"+product.getDescription()+"</td>");
		out.println("</tr>");
		out.println("</table>");
		out.println("</body></html>");
	}

}
