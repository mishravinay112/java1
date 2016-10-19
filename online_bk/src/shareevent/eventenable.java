package shareevent;



import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/eventenable")
public class eventenable extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public eventenable() {
        super();
        
    }
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String event_id=request.getParameter("email");
	   EventDto edto=new EventDto();
		EventService es=new EventService();
		boolean b=es.enable_event_info(event_id);
		  if(b)
		  {
			 response.sendRedirect("EventAdminControler");  
			
		  }
		 
	}
}

	
