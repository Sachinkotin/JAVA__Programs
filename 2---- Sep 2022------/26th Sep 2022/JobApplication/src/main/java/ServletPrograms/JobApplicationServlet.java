package ServletPrograms;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(loadOnStartup = 1, urlPatterns = "/job")
public class JobApplicationServlet extends HttpServlet {

	private ArrayList<JobApplicationDTO> dtos=new ArrayList<JobApplicationDTO>();
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String phone=req.getParameter("phone");
		String altPhone=req.getParameter("altPhone");
		String gender=req.getParameter("gender");
		String qualification=req.getParameter("qualification");
		String passOut=req.getParameter("pass out");
		String university=req.getParameter("university");
		String address=req.getParameter("address");
		String skill=req.getParameter("skill");
		String salary=req.getParameter("salary");
		String experience=req.getParameter("experience");
		String idProof=req.getParameter("id proof");
		String idNumber=req.getParameter("id number");

		System.out.println("Name is :  "+name);
		System.out.println("Email is :  "+email);
		System.out.println("Phone number is :  "+phone);
		System.out.println("Alternative Phone Number is :  "+altPhone);
		System.out.println("Gender is :  "+gender);
		System.out.println("Qualification is :  "+qualification);
		System.out.println("Passout Year is :  "+passOut);
		System.out.println("University is :  "+university);
		System.out.println("Address is :  "+address);
		System.out.println("Skills are :  "+skill);
		System.out.println("Salary is :  "+salary);
		System.out.println("Experience is :  "+experience);
		System.out.println("IdProof is :  "+idProof);
		System.out.println("Id Number is :  "+idNumber);
		
		resp.setContentType("text/html");
		
		
		PrintWriter writer=resp.getWriter();
		writer.append("<html>").append("<body>").append("<h1>").append("Registration is Successful,Check details")
		.append("</h1>").append("<br><br>").append("Name is :  ").append(name).append("<br><br>").append("Email is :  ")
		.append(email).append("<br><br>").append("Phone number is :  ").append(phone).append("<br><br>")
		.append("Alternative Phone Number is :  ").append(altPhone).append("<br><br>")
		.append("Gender is :  ").append(gender).append("<br><br>")
		.append("Qualification is :  ").append(qualification).append("<br><br>").append("Passout Year is :  ").append(passOut)
		.append("<br><br>").append("University is :  ").append(university).append("<br><br>").append("Address is :  ").append(address)
		.append("<br><br>").append("Skills are :  ").append(skill).append("<br><br>").append("Salary is :  ")
		.append(salary).append("<br><br>").append("Experience is :  ").append(experience).append("<br><br>").append("IdProof is :  ").append(idProof)
		.append("<br><br>").append("Id Number is :  ").append(idNumber).append("<br><br>").append("</body>").append("</html>");
		
		
		JobApplicationDTO dto=new JobApplicationDTO(name, email, phone, altPhone, gender, qualification, passOut, university, address, skill, salary, experience, idProof, idNumber);
		dtos.add(dto);
		
		System.out.println(dtos);
	
	}
	
}



















