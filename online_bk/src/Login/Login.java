package Login;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.mail.Session;
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
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw=response.getWriter();
		String email=request.getParameter("userId");
		String password=request.getParameter("password");
		LoginDto sd=new LoginDto();
		sd.setUserId(email);
		sd.setPassword(password);
		LoginService rs=new LoginService();
		
		String msg=rs.check(sd);
		String username=rs.username(sd);
		HttpSession hs=null;	
		if(msg.equals("Your login has Done"))
		{
		hs=request.getSession();
	    hs.setAttribute("ip",email);
	    hs.setAttribute("username",username);

			RequestDispatcher rd=request.getRequestDispatcher("home.jsp");
			rd.forward(request, response);
		}
		else
		{
			hs=request.getSession(false);
			try{
			hs.invalidate();
			hs=null;
			}catch(Exception e)
			{
				System.out.println();
			}
		
			RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
			request.setAttribute("msg", msg);
			rd.include(request, response);
		
			
			
		}
	
	  	
		
		
	} 
	  	
		
		
	
	


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	//protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	/*	PrintWriter pw=response.getWriter();
		String userId=request.getParameter("userId");
		String password=request.getParameter("password");
	//	LoginDto sd=new LoginDto();
	//	sd.setUserId(userId);
	//	sd.setPassword(password);
	//	LoginService rs=new LoginService();
		
	//	String msg=rs.check(sd);
		
		RequestDispatcher r=request.getRequestDispatcher("home.jsp");
		if(true)
		{
			
			HttpSession sc=request.getSession();
			sc.invalidate();
			System.out.println(sc);
			r.forward(request, response);
		}
		
		else
		{
			System.out.println("invalid user or password");
			r.include(request, response);
		}
		
	  //	  request.setAttribute("msg",msg);
	  	
		
		
	}*/

}

