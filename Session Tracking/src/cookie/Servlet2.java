package cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Servlet2")
public class Servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public Servlet2() 
    {
        super();
      
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		doPost(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String last=request.getParameter("lastName");
		Cookie c[]=request.getCookies();
		for (int i = 0; i < c.length; i++) 
		{	
			//out.println(c[i]);
			if(c[i].getName().equals("first"))
			{
				String first=c[i].getValue();
				out.println("HELLO "+first+" "+last);
			}
		}
		
		
		
	}
	
	@Override
	public String toString() {
		
		return super.toString();
	}

}
