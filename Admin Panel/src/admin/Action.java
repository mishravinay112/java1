package admin;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Action")
public class Action extends HttpServlet
{
	private static final long serialVersionUID = 1L;

    public Action()
    {
        super();
        
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		//PrintWriter out=response.getWriter();
		String status=request.getParameter("status");
		String id=request.getParameter("id");
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/office", "root", "root");
			Statement st=con.createStatement();
			String sql="select * from employee where id='"+id+"'";
			if(status.equals("enable"))
			{
				PreparedStatement ps=con.prepareStatement("update employee set status=0 where id=?");
				ps.setString(1, id);
				ps.executeUpdate();
				ResultSet rs=st.executeQuery(sql);
				while(rs.next())
				{
					
					//SendMailTLS s= new SendMailTLS(rs.getString(5),rs.getString(1),rs.getInt(4));
					//s.main(null);
				}
				
				RequestDispatcher rd=request.getRequestDispatcher("View");
				rd.include(request, response);
			}
			else
			{
				PreparedStatement ps=con.prepareStatement("update employee set status=1 where id=?");
				ps.setString(1, id);
				ps.executeUpdate();
				ResultSet rs=st.executeQuery(sql);
				while(rs.next())
				{
				
					//SendMailTLS s= new SendMailTLS(rs.getString(5),rs.getString(1),rs.getInt(4));
					//s.main(null);
				}
				
				RequestDispatcher rd=request.getRequestDispatcher("View");
				rd.forward(request, response);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
