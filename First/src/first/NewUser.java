package first;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.*;
@WebServlet("/newuser")
public class NewUser extends HttpServlet
{
	private static final long serialVersionUID = 1L;
    public NewUser() {
        super();
    }
    
    public  void service(HttpServletRequest req, HttpServletResponse res) throws IOException
    {		
    		String name=req.getParameter("name");
    		String password=req.getParameter("password");
    		String username=req.getParameter("username");
        	String email=req.getParameter("email");
        	String mobile=req.getParameter("mobile");
        	PrintWriter out=res.getWriter();
        	
        	if(mobile!=null && mobile.length()==10)
        	{	
        			char digit[]=mobile.toCharArray();
        			int check=0;
        			for (int i = 0; i < digit.length; i++) {
						try
						{
							int j=digit[i]-0;
						}
						catch(Exception e)
						{
							
							out.println("Mobile Number never contain characters");
		        			res.sendRedirect("http://localhost:8080/First/NewUser.html");
		        			
						}
					}
        			
        		
        		
        	}
        	else
        	{
        		out.println(" Wrong Mobile number");
        		res.sendRedirect("http://localhost:8080/First/NewUser.html");
        	}
        	
        	
        	
        	if(name!=null && password!=null && username!=null && email!=null){
        	try
        	{
        		
    			Class.forName("com.mysql.jdbc.Driver");
    			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
    			Statement st=con.createStatement();
    			ResultSet rs=st.executeQuery("select username from log");
    			int check=0;
    			while(rs.next())
    			{
    				if(rs.getString(1).equals(username))
    				{
    					check=1;
    					break;
    				}
    			}
    			if(check==0)
    			{
    				PreparedStatement ps=con.prepareStatement("insert into log value(?,?,?,?,?)");
    				ps.setString(1, username);
    				ps.setString(2, password);
    				ps.setString(3, name);
    				ps.setString(4, email);
    				ps.setString(5,mobile);
    				int update=ps.executeUpdate();
    				//res.sendRedirect("http://localhost:8080/First/UserPassword.html");
    				out.println("Registration successfull");
    				
    			}
    			else
    			{
    				out.println("Username already exist");
    				Thread.sleep(1000);
    				res.sendRedirect("http://localhost:8080/First/NewUser.html");
    			}
        	}
        	
        	catch(Exception e)
        	{	
        		res.sendRedirect("http://localhost:8080/First/NewUser.html");
        		System.out.println(e);
        	}
        }
        	
        else
        {
        	out.println("fields can't be empty");
        	res.sendRedirect("http://localhost:8080/First/NewUser.html");
        }
        	
        	
    }
	
	
}
