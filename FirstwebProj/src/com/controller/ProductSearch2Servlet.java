package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.GenericServlet;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import com.DAO.ProductDAO;
import com.vo.Product;

/**
 * Servlet implementation class ProductSearch2Servlet
 */
@WebServlet("/productSearch2")
public class ProductSearch2Servlet extends GenericServlet implements Servlet {
	
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		
		ProductDAO productDAO=new ProductDAO();
		List<Product> products=productDAO.getProducts();
		
		PrintWriter out=response.getWriter();
		out.println("<html><body>");
		out.println("<h2 align= center> All Products Details</h2>");
		out.println("<table border=2 aligh=center>");
		out.println("<tr><th>ProductId</th><th>ProductName</th><th>ProductPrice</th><th>ProductDescription</th>");
		
		for (Product product : products) {
			
		out.println("<tr>");
		out.println("<td>"+product.getId()+"</td>");
		out.println("<td>"+product.getName()+"</td>");
		out.println("<td>"+product.getPrice()+"</td>");
		out.println("<td>"+product.getDescription()+"</td>");
		out.println("</tr>");
		}
		out.println("</table>");
		out.println("</body></html>");
		
	}

}
