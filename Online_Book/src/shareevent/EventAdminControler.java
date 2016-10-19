package shareevent;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/EventAdminControler")
public class EventAdminControler extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public EventAdminControler() {
        super();
       
    }
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		EventService es=new EventService();
		try {
			ArrayList<EventDto> al=es.view_event_service();
			RequestDispatcher rd1=request.getRequestDispatcher("View_Event_Detail.jsp");
			 request.setAttribute("al1", al);
			 rd1.include(request, response);
		} catch (Exception e) {
		
			e.printStackTrace();
		}
	}

}
