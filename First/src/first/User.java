package first;


import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/user")
public class User extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public User() {
        super();
    }

    public void service(HttpServletRequest req, HttpServletResponse res)
    {	
    	
    	//res.setContentType("text");
    	String name=req.getParameter("username");
    	System.out.println(name);
    	String password=req.getParameter("password");
    	System.out.println(password);
    	//System.out.println(name + " "+password);
    	try
		{	PrintWriter out=res.getWriter();
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
			Statement s=con.createStatement();
			ResultSet rs=s.executeQuery("select * from log ");
			int check=0;
			while(rs.next())
			{	
				System.out.println(rs.getString(1)+" "+rs.getString(2));
				if(rs.getString(1).equals(name))
				{
					System.out.println("name correct");
					if(rs.getString(2).equals(password))
					{	
						System.out.println("password correct");
						out.println("login Successful");
						check=1;
						break;
					}
				}
			}
			if(check==0)
			{
				
				out.println("<html><body><h1>Invalid username or password<h1>");
				out.println("<p><a href='UserPassword.html'><h2>Try Again<h2></a></p>");
				out.println("<p><a href='NewUser.html'><h2>New User<h2></a></p></body></html>");
				
			}
			
			
		}
    	catch(Exception e)
    	{
    		System.out.println(e);
    	}
    }
	

}
