package BasicPrograms;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 12, urlPatterns = "/green")
public class GreenServlet extends HttpServlet {

	public GreenServlet() {
		System.out.println("default ColorServrvlet  constructor");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.append("<html><body bgcolor='green'><h2 style='color:black;'>This Is Green</h2></body></html>");
	}

}
