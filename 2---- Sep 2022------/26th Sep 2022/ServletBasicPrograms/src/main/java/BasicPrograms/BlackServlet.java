package BasicPrograms;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet (loadOnStartup = 9,urlPatterns = "/black")
public class BlackServlet extends HttpServlet {

	
	public BlackServlet() {
		System.out.println("Inside a default BlackServlet constructor");
	}
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter writer=resp.getWriter();
		writer.append("<html><body bgcolor='black'><h1 style='color:white;'>This is Black</h1></body></html>");
	}
}
