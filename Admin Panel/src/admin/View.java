package admin;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/View")
public class View extends HttpServlet
{
	private static final long serialVersionUID = 1L;
    public View() 
    {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/office", "root", "root");
				Statement st=con.createStatement();
				String query="select * from employee ";
				ResultSet rs=st.executeQuery(query);
				
				while(rs.next())
				{	
					if( !rs.getString(2).equals("1061"))
					{	
						if(rs.getInt(4)==1)
						{	
							
							out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+"<a href='Action?status=enable&id="+rs.getString(2)+"'>disable</a><br>");
						}
						else
						{
							out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+"<a href='Action?status=disable&id="+rs.getString(2)+"'>enable</a><br>");
						}
					}
				}
				out.println("<a href='login.html'><h1>Exit<h1></a>");
				
			}
			catch(Exception e)
			{
				e.printStackTrace();
			
			}
		}
		
	

}
