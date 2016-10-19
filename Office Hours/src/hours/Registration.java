package hours;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Registration")
public class Registration extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
   
    public Registration() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String name=request.getParameter("name");
		String id=request.getParameter("id");
		String password=request.getParameter("password");
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
        	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/office","root","root");
        	PreparedStatement ps=con.prepareStatement("insert into employee value (?,?,?)");
        	ps.setString(1, name);
        	ps.setString(2, id);
        	ps.setString(3, password);
        	ps.executeUpdate();
        	response.sendRedirect("login.html");
        	
		}
		catch(Exception e)
		{
			
			RequestDispatcher rd=request.getRequestDispatcher("Registration.html");
			rd.include(request, response);
			out.println("ID already allocated, Please choose different one");
			
		}
	}

}
