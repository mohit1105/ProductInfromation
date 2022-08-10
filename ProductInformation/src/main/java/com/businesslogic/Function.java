package com.businesslogic;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/submit")
public class Function extends HttpServlet{

	static int id=1;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		

			String name=req.getParameter("productname");
			String price=req.getParameter("productprice");
			
			LocalDate date = LocalDate.now();
			String str=date.toString();
			Product obj=new Product(1,name,price,str);
		
		
		HttpSession session=req.getSession();
			
		
		session.setAttribute("obj", obj);
		
		resp.sendRedirect("Details.jsp");
		
	}
	

}