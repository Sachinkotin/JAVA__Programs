package com.xworkz.companyServlet.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.companyServlet.CompanyDTO;


@WebServlet(loadOnStartup = 5,urlPatterns = {"/company","/show"})
public class CompanyServlet extends HttpServlet {

	private ArrayList<CompanyDTO> dtos = new ArrayList<CompanyDTO>();
	
	public CompanyServlet() {

		System.out.println("CompanyServlet default constructor");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		String name = req.getParameter("name");
		String founder = req.getParameter("founder");
		String since = req.getParameter("since");
		String employee = req.getParameter("employee");
		String address = req.getParameter("address");
		String business = req.getParameter("business");

		System.out.println("Company Name :" + name);
		System.out.println("Founder :" + founder);
		System.out.println("Since :" + since);
		System.out.println("Employees :" + employee);
		System.out.println("Address :" + address);
		System.out.println("Business :" + business);
		
		PrintWriter writ = resp.getWriter();
		writ.append("<html>")
		.append("<body>")
		.append("<h1>")
		.append("Displaying Company Details")
		.append("</h1>")
		.append("Company Name :" + name)
		.append("<br>")
		.append("Founder :" + founder)
		.append("<br>")
		.append("Since :" + since)
		.append("<br>")
		.append("Employees :" + employee)
		.append("<br>")
		.append("Address :" + address)
		.append("<br>")
		.append("Business :" + business)
		.append("</body>")
		.append("</html>");

		CompanyDTO dto = new CompanyDTO(name, founder, since, employee, address, business);
		dtos.add(dto);
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		resp.setContentType("text/html");
		PrintWriter write = resp.getWriter();
		write.append("<html>")
		.append("<body>")
		.append("Company details")
		.append("<br>")
		.append("<table>");
		for (CompanyDTO companyDTO : dtos) {
			write.append("<tr>")
			.append("<td>")
			.append(companyDTO.getName())
			.append("</td>")
			.append("<td>")
			.append(companyDTO.getFounder())
			.append("</td>")
			.append("<td>")
			.append(companyDTO.getSince())
			.append("</td>")
			.append("<td>")
			.append(companyDTO.getNoOfEmployees())
			.append("</td>")
			.append("<td>")
			.append(companyDTO.getAddress())
			.append("</td>")
			.append("<td>")
			.append(companyDTO.getBusiness())
			.append("</td>")
			.append("</tr>");

		}
		write.append("<table>")
		.append("</body>")
		.append("</html>");

	}

	}
	


















