package pay;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/BankLogin")

public class BankLogin extends HttpServlet 
{	
	
	
	private static final long serialVersionUID = 1L;
    public BankLogin() throws Exception
    {
        super();
    }
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	{
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response) 
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String id=request.getParameter("id");
		String password=request.getParameter("password");
		String amount=(String) request.getAttribute("amount");
		//System.out.println("Bank Amount="+amount);
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
        	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/paytm","root","root");
        	Statement st=con.createStatement();
        	String query="select id,password from bank where id='"+id+"' and password='"+password+"'";
			ResultSet rs = st.executeQuery(query);
			
			int run=0;
			
			while (rs.next()) 
			{	
				//System.out.println(rs.getString(1)+" "+rs.getString(2));
				
							
								
								run=1;
								//Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/paytm","root","root");
								//Statement st1=con1.createStatement();
								String query1="SELECT recharge FROM recharge_details WHERE customer_no=(SELECT MAX(customer_no) FROM recharge_details)";
								ResultSet rs1 = st.executeQuery(query1);
								while(rs1.next())
								{
								//System.out.println("amount deducted= "+rs1.getString(1));
								
								out.println("<!DOCTYPE html><html><head><meta charset=\"ISO-8859-1\"><title>Welcome To Bank</title>");
								out.println("<style type=\"text/css\">div{padding-left: 500px;padding-top: 100px;} form{display:inline;}");
								out.println("");
								out.println("</style></head><body><div><h1>Welcome to Bank</h1>");
								out.println("<h2>---------------------------------------------</h2>");
								out.println("<form action=\"Banking\" method=\"post\">");
								out.println("<input type='hidden' name='id' value='"+id+"'>");
								out.println("<input type='hidden' name='password' value='"+password+"'>");
								out.println("&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<input type='text' name='amount'  value='"+rs1.getString(1)+"'readonly>");
								out.println("&nbsp&nbsp<input type=\"submit\" value=\"proceed\"></form><form action=\"Cancel\" method='post' >");
								out.println("&nbsp&nbsp<input type=\"submit\" value=\"cancel\" '></form></div></body></html>");
								break;
								}
								break;
				}
				if(run==0)
					{
						RequestDispatcher rd=request.getRequestDispatcher("BankLogin.html");
						rd.forward(request, response);
					}
				
			
			
		}
		catch (SQLException | ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
		
		
	}

}
