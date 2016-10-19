package pay;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/NewInBank")
public class NewInBank extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
	
    public NewInBank() {
        super();
    }
    
    
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		String id=request.getParameter("id");
		String name=request.getParameter("name");
		String address=request.getParameter("address");
		String contact=request.getParameter("email");
		String balance1=request.getParameter("balance");
		String password=request.getParameter("password");
		int balance=Integer.parseInt(balance1);
		
		try 
		{	
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/paytm","root","root");
			PreparedStatement ps=con.prepareStatement("insert into bank value (?,?,?,?,?,?)");
			ps.setString(1, id);
			ps.setString(2, name);
			ps.setString(3, contact);
			ps.setString(4, address);
			ps.setInt(5, balance);
			ps.setString(6, password);
			ps.executeUpdate();
			out.println("bank account created");
			response.sendRedirect("http://localhost:8080/PayTm/BankLogin.html");
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
		
	}

}
