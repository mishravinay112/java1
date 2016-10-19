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

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() 
    {
        super();
       
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String id=request.getParameter("id");
		String password=request.getParameter("password");
		
		/*if(id==null)
		{
			RequestDispatcher r=request.getRequestDispatcher("login.html");
			r.include(request, response);
			out.println("please enter id and password");
		}*/
		
		HttpSession s=request.getSession();
		
		if(s.isNew())
		{
			
			
			LoginValidate lv=new LoginValidate(id,password);
			try 
			{
				if(lv.validate())
				{
					
					DateAndTime sm=new DateAndTime();
					String date=sm.getDate();
					String time=sm.getTime();
					
					
					s.setAttribute("date", date);
					s.setAttribute("time", time);
					s.setAttribute("lv", lv);
					
					out.println("Welcome " + lv.getName() + "<br>");
					out.println("Date : " + date + "<br>");
					out.println("Your Login Time is " + time+"<br>");
					out.println("Total working time : 00:00:00");  
					out.println("<link rel='stylesheet' href='loginServlet.css'>");
					out.println("<form action='LogOut' method='post'>");
					out.println("<p><input type='submit' id='submit' value='Log Out'></p></form>");
				}
				else
				{
					out.println("invalid username or password/n");
					s.invalidate();
					RequestDispatcher rd=request.getRequestDispatcher("login.html");
					rd.include(request, response);
				}
			} 
			
			catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
		
		else
		{
			
			String date=(String) s.getAttribute("date");
			String time=(String) s.getAttribute("time");
			LoginValidate lv=(LoginValidate) s.getAttribute("lv");
			out.println("Welcome " + lv.getName() + "<br>");
			out.println("Date : " + date + "<br>");
			out.println("Your Login Time is " + time+"<br>");
			
			DateAndTime d=new DateAndTime();
			String time2=d.getTime();
			String date2=d.getDate();
			
			TimeDifference td=new TimeDifference(date, time, date2, time2);
			String workTime=td.difference();
			
			out.println("Total working time : "+workTime); 
			
			out.println("<link rel='stylesheet' href='loginServlet.css'>");
			out.println("<form action='LogOut' method='post'>");
			out.println("<p><input type='submit' id='submit' value='Log Out'></p></form>");
		}
	
		
	}

}
