package pending;

import java.io.IOException;
import java.io.PrintWriter;

import javax.mail.SendFailedException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/disable")
public class disable extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public disable() {
        super();
        }
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
PrintWriter p=response.getWriter();
    String email=request.getParameter("email");
    int email1=Integer.parseInt(email);
    pending_status_Dto psd=new pending_status_Dto();
	pending_status_disableService ps=new pending_status_disableService();
	psd.setAutoincrement(email1);
	  if(ps.disable(psd))
	  {
		  response.sendRedirect("pending_statusServlet");
	
	  }
	  else
	  {
		  p.print("not disable");
	  }
		
	}

}
