package com.xworkz.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 2,urlPatterns = "/kelu")
public class FireServlet extends HttpServlet {

	public FireServlet() {

		System.out.println("Inside a Default FireServlet constructor ");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		String name=req.getParameter("Aliasname");
		String company=req.getParameter("Companyname");
		String salary=req.getParameter("Packagename");
		
		resp.setContentType("type/html");
		PrintWriter writer=resp.getWriter();
		writer.append("<html>")
		.append("<body>")
		.append("<h1>")
		.append("Your Details Are")
		.append("</h1>")
		.append("<br>").append("<br>")
		.append("Name: "+" ").append(name)
		.append("<br>").append("<br>")
		.append("Company: "+" ").append(company)
		.append("<br>").append("<br>")
		.append("Package: "+" ").append(salary)
		.append("</body>")
		.append("</html>");
		
	}
	
	
}
