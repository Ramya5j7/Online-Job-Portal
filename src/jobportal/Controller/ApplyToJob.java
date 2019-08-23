package jobportal.Controller;



import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ApplyToJob")
public class ApplyToJob extends HttpServlet {
private static final long serialVersionUID = 1L;
       
   
    public ApplyToJob() {
        super();
        
    }


protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
String Jtitle=request.getParameter("id");
String Company=request.getParameter("comp");

System.out.println("id"+Jtitle);
System.out.println("c-mail"+Company);

request.setAttribute("Jtitle",Jtitle);
request.setAttribute("Jcompany",Company);
request.getRequestDispatcher("SubmitJob.jsp").forward(request, response);
}

/**
* @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
*/
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
// TODO Auto-generated method stub
doGet(request, response);
}

}