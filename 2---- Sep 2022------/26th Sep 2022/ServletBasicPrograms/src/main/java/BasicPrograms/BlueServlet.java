package BasicPrograms;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet (loadOnStartup = 6,urlPatterns = "/blue")
public class BlueServlet extends HttpServlet{

	public BlueServlet() {

		System.out.println("Inside a BlueServlet constructor");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	
		res.setContentType("text/html");
		PrintWriter writer=res.getWriter();
		writer.append("<html><body bgcolor='blue'><h1>This Is Blue</h1></body></html>");
	}
	
}
