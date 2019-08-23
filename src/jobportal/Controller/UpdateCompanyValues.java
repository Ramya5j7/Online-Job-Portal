package jobportal.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jobportal.DAO.SqlOperation;



/**
 * Servlet implementation class UpdateCompanyValues
 */
@WebServlet("/UpdateCompanyValues")
public class UpdateCompanyValues extends HttpServlet {
private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateCompanyValues() {
        super();
        // TODO Auto-generated constructor stub
    }

/**
* @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
*/
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   String canme=request.getParameter("username");
   String Password=request.getParameter("password");
   String Website=request.getParameter("web");
   String ContactPerson=request.getParameter("contactPerson");
   String ContactPersonNumber=request.getParameter("contactNumber");
   String username=request.getParameter("username");
   HttpSession s=request.getSession();
   String email=(String) s.getAttribute("CompanyName");
   PrintWriter p = response.getWriter();
   SqlOperation obj=new SqlOperation();
   	System.out.println();
    int flag=obj.UpdateCompanyValue(email,canme,Password,Website,ContactPerson,ContactPersonNumber,username);
   if(flag==1) {
   p.println("<script>alert('Profile Updated Successfull.')</script>");
  response.setHeader("Refresh","1;companyDashboard.jsp");
  }else {
   p.println("<script>alert('Profile Updated Failed.')</script>");
   response.setHeader("Refresh","1;companyDashboard.jsp");
}
}

/**
* @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
*/
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
// TODO Auto-generated method stub
doGet(request, response);
}

}

