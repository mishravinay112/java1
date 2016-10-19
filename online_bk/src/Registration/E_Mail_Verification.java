package Registration;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/E_Mail_Verification")
public class E_Mail_Verification extends HttpServlet {
	private static final long serialVersionUID = 1L;
       public E_Mail_Verification() {
        super();
       
    }
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");  
        PrintWriter out = response.getWriter();  
          
       
        String n=request.getParameter("userid");  
        int userid=Integer.parseInt(n);
        int status=0;
        try{  
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/online_Book","root","root");
					java.sql.Statement stmt=con.createStatement();
	            ResultSet rs=((java.sql.Statement) stmt).executeQuery("select status from Registration where user_id='"+userid+"'"); 
		
			 if(rs.next())  
			   status=rs.getInt(1);
			  
  
			  
			}catch(Exception e){ System.out.println(e);} 
        if(status==0)
        {
        	 try{  
     			Class.forName("com.mysql.jdbc.Driver");
     			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/online_Book","root","root");
     					java.sql.Statement stmt=con.createStatement();
     	            int i=((java.sql.Statement) stmt).executeUpdate("update Registration set status='"+1+"' where user_id='"+userid+"'"); 
     	
     	        
     			if(i>0)
     			{
     				RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
     				request.setAttribute("msg","your email id is verified you can login");
     				rd.include(request, response);
     			}
     			else
     			{
     			
     				RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
     				request.setAttribute("msg","your email id is  not verified ");
     				rd.include(request, response);
     			}
       
     			  
     			}catch(Exception e){ System.out.println(e);} 
        	
        	
        }
        else
        {

				RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
				request.setAttribute("msg","your email id has already verified ");
				rd.include(request, response);
        }
        }
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
