package hours;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession hs = request.getSession();
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		if(!hs.isNew())
		{	try{
			String id = (String) hs.getAttribute("id");
			String password = (String) hs.getAttribute("password");
			String name=(String) hs.getAttribute("name");
			String date=(String) hs.getAttribute("date");
			String time=(String) hs.getAttribute("time");
			Long time1=Long.parseLong((String) hs.getAttribute("time1"));
			Long time2=System.currentTimeMillis();
			Long work=(time2-time1)/1000;
			
			int hours=(int) (work/3600);
			int minute=(int) ((work%3600)/60);
			int second=(int) ((work%3600)%60);
			
			/*String workTime=hours+":"+minute+":"+second;
			float performance=0.0f;
			if(hours<4)
			{
				performance=0.0f;
			}
			else if(hours>=4 && hours<8)
			{
				performance=0.5f;
			}
			else if(hours>=8 && hours<=12)
			{
				performance=1.0f;
			}*/
			/*Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/office", "root", "root");*/
			
			
			/*DateFormat dt = new SimpleDateFormat("HH:MM:SS YYYY-MM-DD");
			Date d = new Date();
			String getDateAndTime = dt.format(d);
			String dnt[] = getDateAndTime.split(" ");
			String newTime = dnt[0];
			String newDate = dnt[1];*/
			System.out.println(time + " and " + date);
			out.println("Welcome " + name + "<br>");
			out.println("Date : " + date + "<br>");
			/*HttpSession hs = request.getSession();
			hs.setAttribute("id", rs.getString(2));
			hs.setAttribute("password", password);
			hs.setAttribute("time", time);
			hs.setAttribute("date", date);*/
			out.println("Your Login Time is " + time+"<br>");
			out.println("Total time you worked : "+hours+":"+minute+":"+second);
			out.println("<link rel='stylesheet' href='loginServlet.css'>");
			out.println("<form action='LogOut' method='post'>");
			out.println("<p><input type='submit' id='submit' value='Log Out'></p></form>");
			}
			catch(Exception e)
			{
				hs.invalidate();
				response.sendRedirect("login.html");
			}
		}
		
		else 
		{
			int i = 0;
			long work=0;
			response.setContentType("text/html");
			String id = request.getParameter("id");
			String password = request.getParameter("password");
			if (id != null && password != null)
			{
				try
				{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/office", "root", "root");
				Statement st = con.createStatement();
				String query = "select * from employee where id='" + id+ "' and password='" + password + "'";
				ResultSet rs = st.executeQuery(query);
				int run = 0;
				while (rs.next())  
				{
					run = 1;
					 DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
					 Date d = new Date();
					String getDateAndTime = dateFormat.format(d);
					
					String dnt[] = getDateAndTime.split(" ");
					
					String today=new Date(System.currentTimeMillis()).toString();
					String part[]=today.split(" ");
					
					String time=part[3];
					String date = dnt[0];
					System.out.println(time + " and " + date);
					out.println("Welcome " + rs.getString(1) + "<br>");
					out.println("Date : " + date + "<br>");
					//HttpSession hs = request.getSession();
					hs.setAttribute("id", id);
					hs.setAttribute("password", password);
					hs.setAttribute("name", rs.getString(1));
					hs.setAttribute("time", time);
					hs.setAttribute("date", date);
					String time1=String.valueOf(System.currentTimeMillis());
					hs.setAttribute("time1",time1 );
					//String workTime=0+":"+0+":"+0;
					/*PreparedStatement ps=con.prepareStatement("insert into details value(?,?,?,?)");
					ps.setString(1, id);
					ps.setString(2, date);
					ps.setString(3,workTime );
					ps.setFloat(4, 0f);
					ps.executeUpdate();*/
					
					
					
					out.println("Your Login Time is " + time+"<br>");
					out.println("Total working time : 00:00:00");
					out.println("<link rel='stylesheet' href='loginServlet.css'>");
					out.println("<form action='LogOut' method='post'>");
					out.println("<p><input type='submit' id='submit' value='Log Out'></p></form>");
					//con.close();
					
				}
				
				if (run == 0)
				{

					RequestDispatcher rd = request.getRequestDispatcher("login.html");
					rd.include(request, response);
					out.println("Wrong Id Or Password, Try Again");
				}

			} 
				
			
			catch (Exception e)
			{	
				e.printStackTrace();
				RequestDispatcher rd = request.getRequestDispatcher("login.html");
				rd.forward(request, response);
			}
		}
			
			/*else
			{
				RequestDispatcher rd = request.getRequestDispatcher("login.html");
				rd.forward(request, response);
			}*/
		}
	}
}
