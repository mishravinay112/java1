package pending;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;




@WebServlet("/enable")
public class enable extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public enable() {
        super();
        
    }
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter p=response.getWriter();
		String email=request.getParameter("email");
		int email1=Integer.parseInt(email);
		pending_status_Dto psd=new pending_status_Dto();
		pending_status_enableService ps=new pending_status_enableService();
		psd.setAutoincrement(email1);
		  if(ps.enable(psd))
		  {
			
			  response.sendRedirect("pending_statusServlet");
				

		  }
		  else
		  {
			 
			  p.println("not enable");
		  }
	}
}

	
