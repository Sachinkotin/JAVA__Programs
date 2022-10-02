package jspprograms;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet(loadOnStartup = 2,urlPatterns = "/pmdetail")
public class PMservlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	resp.setContentType("text/html");
	String name=req.getParameter("Name");
	String country=req.getParameter("Country");
	String status=req.getParameter("Status");
	String party=req.getParameter("Party");
	String age=req.getParameter("Age");
	String gender=req.getParameter("Gender");
	String period=req.getParameter("Period");
	String times=req.getParameter("Times");
	
	req.setAttribute("Name", name);
	req.setAttribute("Country", country);
	req.setAttribute("Status", status);
	req.setAttribute("Party", party);
	req.setAttribute("Age", age);
	req.setAttribute("Gender", gender);
	req.setAttribute("Period", period);
	req.setAttribute("Times", times);

	RequestDispatcher dispatcher=req.getRequestDispatcher("/pmdetails.jsp");
	dispatcher.forward(req, resp);
	

	}
	
}
