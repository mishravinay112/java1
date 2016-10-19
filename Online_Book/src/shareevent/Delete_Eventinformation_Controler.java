package shareevent;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Delete_Eventinformation_Controler")
public class Delete_Eventinformation_Controler extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Delete_Eventinformation_Controler() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		EventService es=new EventService();
		String event_id=request.getParameter("uname");
		boolean b=es.delete_event_info(event_id);
		if(b)
		{
			response.sendRedirect("EventAdminControler");
		}
		else
		{
			out.println("please fill correct info");
		}
		
	}

}
