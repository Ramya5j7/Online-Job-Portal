package jobportal.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jobportal.DAO.SqlOperation;


@WebServlet("/AddJobs")
public class AddJobs extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public AddJobs() {
        super();
        // TODO Auto-generated constructor stub
    }

	
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	PrintWriter p = response.getWriter();
    	String jobtitle=request.getParameter("jobtitle");
    	String jobdescription=request.getParameter("jobdescription");
    	String salary=request.getParameter("salary");
    	String skills=request.getParameter("skills");
    	String joblocation=request.getParameter("joblocation");
    	String contactperson=request.getParameter("contactperson");
    	String contactpersonnumber=request.getParameter("contactpersonnumber");
    	String companyname=request.getParameter("companyname");
    	String companyemail=request.getParameter("companyemail");


    	SqlOperation dao=new SqlOperation();
    	if(dao.addJob(jobtitle,jobdescription,salary,skills,joblocation,contactperson,contactpersonnumber,companyname,companyemail)==1) {
    	p.println("<script type=\"text/javascript\">"); 
    	p.println("alert(\"Job Posted Successfully \")");
    	p.println("</script>");
    	response.setHeader("Refresh", "1;companyDashboard.jsp");
    	}else {
    	p.println("<script type=\"text/javascript\">"); 
    	p.println("alert(\"Job Post Failed\")");
    	p.println("</script>");
    	response.setHeader("Refresh", "1;companyDashboard.jsp");


    	}


    	}


	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
