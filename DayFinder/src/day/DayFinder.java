package day;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/DayFinder")
public class DayFinder extends HttpServlet
{
	private static final long serialVersionUID = 1L;
       
  
    public DayFinder() 
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
			String date=request.getParameter("date");
			System.out.println(date);
			String time=request.getParameter("time");
			System.out.println(time);
			DoWork dw=new DoWork(date,time);
			
			out.println("<link rel='stylesheet' href='response.css'>");
			out.println("<body><h1>Welcome to Day Finder</h1>");
			out.println("<h2>-----------------------------------------</h2>");
			out.println("Day : "+dw.day()+"<br>");
			out.println("Total Days : "+dw.days()+"<br>");
			out.println("Total Time : "+dw.time()+"<br>");
			out.println("Total Hour : "+dw.totalhours()+"<br>");
			out.println("Total Minute : "+dw.totalminutes()+"<br>");
			out.println("Total Second : "+dw.totalseconds()+"<br>");
			out.println("<h2>-----------------------------------------</h2>");
			out.println("</body>");
			/*System.out.println(date);
			System.out.println(time);*/
			
	}

}
