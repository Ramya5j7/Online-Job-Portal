package jobportal.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jobportal.DAO.SqlOperation;


@WebServlet("/CompanyRegistration")
public class CompanyRegistration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public CompanyRegistration() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter p=response.getWriter();
		String canme = request.getParameter("canme");
		String email = request.getParameter("email");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String website = request.getParameter("web");
		String contactperson = request.getParameter("contactPerson");
		String contactpersonname = request.getParameter("contactNumber");
		SqlOperation dao=new SqlOperation();
		if(dao.addcompany(canme, email,username, password, website, contactperson, contactpersonname )==1) {
			p.println("<script type=\"text/javascript\">"); 
	    	p.println("alert(\"register Successfully \")");
	    	p.println("</script>");
	          response.sendRedirect("companyLogin.html");
	    }
	   else
	   {
	//Registration failed
		   p.println("<script type=\"text/javascript\">"); 
	    	p.println("alert(\"register failed \")");
	    	p.println("</script>");
	   response.sendRedirect("companyLogin.html");	
	   }
		}
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
