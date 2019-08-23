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


@WebServlet("/LoginEmp")
public class LoginEmp extends HttpServlet {
private static final long serialVersionUID = 1L;
       
    
    public LoginEmp() {
        super();
        // TODO Auto-generated constructor stub
    }


protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   PrintWriter p = response.getWriter();
    response.setContentType("text/html");
   String username = request.getParameter("username");
       String password = request.getParameter("password");
      HttpSession session = request.getSession();
      System.out.println("Mail id "+username);
    System.out.println("Password "+password);

  SqlOperation dao = new SqlOperation();
   if (dao.validateUser(username, password)) {

//Session Creation

   

//role-check

if (dao.validateUser(username, password)) {
session.setAttribute("username", username);
if (username.equals("HR@jobportal.com")) {
response.sendRedirect("Admin.jsp");
} else {
String redirectURL = "employeeDashboard.jsp";
   response.sendRedirect(redirectURL);
//response.sendRedirect("EmpDashboard.jsp");
}

} else if (username != "" && password != "") {

p.println("<script>alert('Login  Failed.')</script>");
response.setHeader("Refresh","1;index.html");

} else {
p.println("<script>alert('Login  Failed.')</script>");
response.setHeader("Refresh","1;index.html");
}
}


}

protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
// TODO Auto-generated method stub
doGet(request, response);
}

}