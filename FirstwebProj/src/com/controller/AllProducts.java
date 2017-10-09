package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DAO.ProductDAO;
import com.vo.Product;

/**
 * Servlet implementation class AllProducts
 */
@WebServlet("/allProducts")
public class AllProducts extends HttpServlet {
	
	private ProductDAO productDAO ;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		
		productDAO= new ProductDAO();
	}
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Product> products= productDAO.getProducts();
		
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("<h2 align= center>Products Details</h2>");
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
