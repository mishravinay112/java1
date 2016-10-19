package hour;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/LogOut")
public class LogOut extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
   
    public LogOut() 
    {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		doPost(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		HttpSession hs=request.getSession(false);
		
		if(hs==null)
		{	
			RequestDispatcher r=request.getRequestDispatcher("login.html");
			r.forward(request, response);
		}
		else
		{

			
			String date=(String) hs.getAttribute("date");
			String time=(String) hs.getAttribute("time");
			LoginValidate lv=(LoginValidate) hs.getAttribute("lv");
			Save s=new Save(lv,date,time);
			s.doWork();
			if(s.isSave)
			{	
				out.println("<p>Your data is saved<p>");
				out.println("<p>You have Successfully logged out<p>");
				hs.invalidate();
			}
			else
			{
				out.println("<p>Your data is not saved<p>");
			}
		}
		
	}

}
