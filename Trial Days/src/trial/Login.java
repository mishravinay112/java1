package trial;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Login() {
        super();
       }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		String id=request.getParameter("id");
		String password=request.getParameter("password");
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
        	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
        	Statement st=con.createStatement();
        	String query="select * from trial where id='"+id+"' and password='"+password+"'";
			ResultSet rs = st.executeQuery(query);
			
			int run=0;
			String name="";
			String doj="";
			
			while (rs.next()) 
			{	
				run=1;
				name=rs.getString(1);
				doj=rs.getString(3);
				
			}
			if(run==1)
			{
				String query1="SELECT DATEDIFF(NOW(),(SELECT doj FROM trial WHERE id='"+id+"'))";
				ResultSet rs1 = st.executeQuery(query1);
				int dayLeft=0;
				
				while(rs1.next())
				{
					dayLeft=rs1.getInt(1);
				}
				if(dayLeft<=30)
				{
					out.println("Welcome "+name+" only "+(30-dayLeft)+" days left please buy licence");
				}
				else
				{	if(dayLeft<0)
					{
						out.println("please check your date setting");
					}
					else
					{
						out.println("dear, "+name+" your free trial days had been over please buy licence!!!");
					}
				}
			}
				if(run==0)
					{
						RequestDispatcher rd=request.getRequestDispatcher("login.html");
						rd.forward(request, response);
					}
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
