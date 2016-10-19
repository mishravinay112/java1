package admin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Admin")
public class Admin extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
    public Admin() 
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
		
		
	
		
			String id=request.getParameter("id");
			String password=request.getParameter("password");
			String userType=request.getParameter("user");
			
			LoginValidate lv=new LoginValidate(id,password,userType);
			if(lv.validate())
			{	
				if(userType.equals("admin"))
				{	
					if(lv.getStatus()==1)
					{out.println("<a href='View'><h1>view all<h1></a>");
					out.println("<a href='login.html'><h1>Exit<h1></a>");}
					else{out.println("your account has been disabled");}
				}
			
				else 
				{	
					if(lv.getStatus()==1)
					{out.println("welcome "+lv.getName());}
					else{out.println("your account has been disabled");}
					
				}
			}
		}
		
		
	

}
