package jobportal.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jobportal.DAO.SqlOperation;




@WebServlet("/CompanyLogin")
public class CompanyLogin extends HttpServlet {
private static final long serialVersionUID = 1L;
    
    public CompanyLogin() {
        super();
        
    }


protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
PrintWriter p = response.getWriter();
response.setContentType("text/html");
String email = request.getParameter("mail");
String password = request.getParameter("passwd");
HttpSession session = request.getSession();
System.out.println("Mail id "+email);
System.out.println("Password "+password);
SqlOperation dao = new SqlOperation();

if(dao.validatecompany(email, password)) {
	session.setAttribute("CompanyName", email);
response.sendRedirect("companyDashboard.jsp");

}else
if (email != "" && password != "") {

//dont leave blank
response.sendRedirect("companyLogin.html");

}
else {
//failed
response.sendRedirect("companyLogin.html");
}

}


protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

doGet(request, response);
}

}



