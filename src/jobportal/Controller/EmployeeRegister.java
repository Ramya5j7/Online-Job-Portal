package jobportal.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jobportal.DAO.SqlOperation;


@WebServlet("/EmployeeRegister")
public class EmployeeRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public EmployeeRegister() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
       System.out.println("Emp register Servlet called");
       PrintWriter p=response.getWriter();
		 String email = request.getParameter("email");
		 String faname = request.getParameter("firstName");
		 String laname = request.getParameter("lastName");
		 String mobileno = request.getParameter("mobileno");
		 String username = request.getParameter("userName");
		 String pass = request.getParameter("passwd");
		 String gender = request.getParameter("gender");
		 String technicalskills = request.getParameter("keySkills");
		 String currentrole = request.getParameter("currentRole");
		 String company = request.getParameter("company");
		 String experience = request.getParameter("expirence");
		 System.out.println(email+""+faname+""+laname+"" +mobileno+""+username+""+pass+""+gender+""+technicalskills+"" +currentrole+" "+company+" "+experience);
		 

     SqlOperation dao=new SqlOperation();
        if(dao.addUser(email, faname, laname, mobileno, username, pass, gender, technicalskills, currentrole, company, experience)==1)  {
        	p.println("<script>alert('registration successfull! ')</script>");
              response.sendRedirect("index.html");
    }
   else
   {
//Registration failed
	   p.println("<script>alert('registration failed! Try again')</script>");
   response.sendRedirect("index.html");	
   }


	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
