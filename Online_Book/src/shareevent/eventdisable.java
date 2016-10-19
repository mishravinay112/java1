package shareevent;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/eventdisable")
public class eventdisable extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public eventdisable() {
        super();
        }
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
PrintWriter p=response.getWriter();
    String event_id=request.getParameter("email");
    EventDto edto=new EventDto();
	EventService es=new EventService();
	boolean b=es.disable_event_info(event_id);
	if(b)
	  {
		 
		response.sendRedirect("EventAdminControler");
	  }
	 
		
	}

}
