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
import javax.servlet.http.HttpSession;
@WebServlet("/ViewEventControler")
public class ViewEventControler extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ViewEventControler() {
        super();
       
    }
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 HttpSession sc=request.getSession();
		String ip=(String)sc.getAttribute("ip");
		if(ip!=null)
		{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		EventService es=new EventService();
		try {
			ArrayList<EventDto> al=es.view_userevent_service();
			RequestDispatcher rd1=request.getRequestDispatcher("view_user_eventdetail.jsp");
			 request.setAttribute("al1", al);
			 rd1.include(request, response);
		} catch (Exception e) {
		
			e.printStackTrace();
		}
		}
		else
		{
			RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
			request.setAttribute("key","you are not login first you have to login");
			rd.include(request, response);
		}
	}

	
	

}
