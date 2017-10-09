package com.controller;

import java.io.IOException;
import javax.servlet.GenericServlet;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import com.DAO.ProductDAO;
import com.vo.Product;

/**
 * Servlet implementation class AddProductServlet
 */
@WebServlet("/addProduct")
public class AddProductServlet extends GenericServlet implements Servlet {
	
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {

		int Id=Integer.parseInt(request.getParameter("productid"));
		String Name=request.getParameter("productname");
		float Price = Float.parseFloat(request.getParameter("productprice"));
		String Description=request.getParameter("productdescription");
		
		ProductDAO productDAO=new ProductDAO();
		
		AddProductServlet addProductServlet=new AddProductServlet();
		
		
		
	}

}
