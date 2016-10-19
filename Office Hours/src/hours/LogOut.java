package hours;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LogOut
 */
@WebServlet("/LogOut")
public class LogOut extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LogOut() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<style>p{padding-left:500px;padding-top:100px;}</style>");
		HttpSession hs=request.getSession();
		//String workTime;
		String today=new Date(System.currentTimeMillis()).toString();
		System.out.println(today);
		
		try{
			String id = (String) hs.getAttribute("id");
			String password = (String) hs.getAttribute("password");
			String name=(String) hs.getAttribute("name");
			String date=(String) hs.getAttribute("date");
			String time=(String) hs.getAttribute("time");
			Long time1=Long.parseLong((String) hs.getAttribute("time1"));
			Long time2=System.currentTimeMillis();
			Long work=(time2-time1)/1000;
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/office", "root", "root");
			Statement st=con.createStatement();
			String query="select no_of_hours from details where id='"+id+"' and date='"+date+"'";
			ResultSet rs=st.executeQuery(query);
			int run=0;
			while(rs.next())
			{	
				
				run=1;
				String lastWork=rs.getString(1);
				String part[]=lastWork.split(":");
				long total=(Long.valueOf(part[0])*3600)+(Long.valueOf(part[1])*60)+(Long.valueOf(part[2]));
				work=work+total;
			
			
			
			int hours=(int) (work/3600);
			int minute=(int) ((work%3600)/60);
			int second=(int) ((work%3600)%60);
			
			DecimalFormat f=new DecimalFormat("00");
			String workTime=f.format(hours)+":"+f.format(minute)+":"+f.format(second);
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
			}
			
			PreparedStatement ps=con.prepareStatement("update details set no_of_hours=?, attendance_over=? where id=? and date=?");
			//String query2="update details set no_of_hours='"+workTime+"' and attendance_over='"+performance+"'";
			//ResultSet rs2=st.executeQuery(query2);
			ps.setString(1, workTime);
			ps.setFloat(2, performance);
			ps.setString(3, id);
			ps.setString(4, date);
			ps.executeUpdate();
			hs.invalidate();
			
			}
			
			if(run==0)
			{	
				int hours=(int) (work/3600);
				int minute=(int) ((work%3600)/60);
				int second=(int) ((work%3600)%60);
				
				DecimalFormat f=new DecimalFormat("00");
				String workTime=f.format(hours)+":"+f.format(minute)+":"+f.format(second);
				PreparedStatement ps=con.prepareStatement("insert into details value(?,?,?,?)");
				ps.setString(1, id);
				ps.setString(2, date);
				ps.setString(3,	workTime );
				ps.setFloat(4, 0f);
				ps.executeUpdate();
				out.println("<p>You have Successfully logged out<p>");
				
			}
		//response.sendRedirect("login.html");
		}
		catch(NumberFormatException ne)
		{
			out.println("<p>you have tried to change system time</p>");
			hs.invalidate();
			//response.sendRedirect("login.html");
		}
		
		
		catch(Exception e)
		{
			e.printStackTrace();
			response.sendRedirect("login.html");
		}
		
		
	}
	
	
}

