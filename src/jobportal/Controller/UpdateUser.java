package jobportal.Controller;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jobportal.Bean.Employee;
import jobportal.DAO.SqlOperation;




@WebServlet("/UpdateUser")
public class UpdateUser extends HttpServlet {
private static final long serialVersionUID = 1L;
   
    public UpdateUser() {
        super();
        // TODO Auto-generated constructor stub
    }


protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      response.setContentType("text/html");  
      HttpSession s=request.getSession();
      String email=(String) s.getAttribute("username");
      System.out.println("Session Value "+email);
      Employee e =SqlOperation.fetchEmployee(email);
      System.out.println("From Servlet :: "+e);
      request.setAttribute("UpdatedEmpObj",e);
      request.getRequestDispatcher("UpdateUser.jsp").forward(request, response);

}




protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

              doGet(request, response);
}
}