package jobportal.Controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jobportal.Bean.jobs;
import jobportal.DAO.SqlOperation;

import java.util.ArrayList;
import java.util.List;

@WebServlet("/JobApply")
public class JobApply extends HttpServlet {
private static final long serialVersionUID = 1L;
       
    
    public JobApply() {
        super();
        // TODO Auto-generated constructor stub
    }


protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
response.setContentType("text/html");  
try {

	List<jobs> jobs =SqlOperation.list();
request.setAttribute("JobList",jobs);
request.getRequestDispatcher("JobApply.jsp").forward(request, response);

} catch (SQLException e) {System.out.println(e);}

}

/**
* @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
*/
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
// TODO Auto-generated method stub
doGet(request, response);
}

}

