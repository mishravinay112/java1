package pay;

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

/**
 * Servlet implementation class Banking
 */
@WebServlet("/Banking")
public class Banking extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
   
    public Banking() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String amount1=request.getParameter("amount");
		int amount=Integer.parseInt(amount1);
		String id=request.getParameter("id");
		String password=request.getParameter("password");

		try {
			Class.forName("com.mysql.jdbc.Driver");
        	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/paytm","root","root");
        	Statement st=con.createStatement();
        	String query="select balance from bank where id='"+id+"' and password='"+password+"'";
        	int balance;
			ResultSet rs = st.executeQuery(query);
			while(rs.next())
			{
				 balance=rs.getInt(1);
				if(balance>=amount)
				{
					balance=balance-amount;
				}
				else
				{
					
				}
				
			}
		
			}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}
}