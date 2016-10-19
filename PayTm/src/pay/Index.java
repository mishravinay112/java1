package pay;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Connection;
@WebServlet("/index")
public class Index extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Index() {
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
		String mobileNo=request.getParameter("mobile");
		String amount=request.getParameter("amount");
		System.out.println("payTm amount="+amount);
		String serviceProvider=request.getParameter("provider");	
		//request.setAttribute("amount", amount);
		
		java.sql.Connection con;
		try 
		{	Class.forName("com.mysql.jdbc.Driver");
		 	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/paytm","root","root");
			PreparedStatement ps=con.prepareStatement("INSERT INTO recharge_details(mobile_no,recharge,provider) VALUE(?,?,?);");
			ps.setString(1, mobileNo);
			ps.setString(2, amount);
			ps.setString(3, serviceProvider);
			//ps.setString(4, "NO");
			ps.executeUpdate();
			System.out.println("updation done ");
			con.close();
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
		} 
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
		
		RequestDispatcher rd=request.getRequestDispatcher("/BankLogin.html");
		rd.forward(request, response);
		
		
		/*String ipAddress = request.getHeader("X-FORWARDED-FOR");  
		if (ipAddress == null) {  
		   ipAddress = request.getRemoteAddr();  
		}
		System.out.println(ipAddress);
		response.sendRedirect("BankLogin.html");*/
		
		
	}

}
