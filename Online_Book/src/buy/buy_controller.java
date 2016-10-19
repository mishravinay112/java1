package buy;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Login.LoginDto;


@WebServlet("/buy_controller")
public class buy_controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public buy_controller() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter ps=response.getWriter();
		String course=request.getParameter("category");
		String subject=request.getParameter("subcategory1");
		String state=request.getParameter("state");
		String city=request.getParameter("city");
		buy_Dto bd=new buy_Dto();
		bd.setCity(city);
		bd.setCourse(course);
		bd.setSubject(subject);
		bd.setState(state);
		buy_Service bs=new buy_Service();
	boolean b1=bs.buySearch(bd);
	if(b1==false)
	{
		String msg="you hava to fill all text box";
		 RequestDispatcher rd=request.getRequestDispatcher("search.jsp");
			request.setAttribute("msg", msg);
			rd.include(request, response);
	}
	else
	{
		
	 ArrayList al=bs.getSearch(bd);
	if(al.isEmpty())
	{
	
	String msg="Sorry!! This book is not available";	
    RequestDispatcher rd=request.getRequestDispatcher("search.jsp");
	 request.setAttribute("msg",msg);
	 rd.forward(request, response);
	}
	else
	{
	
	 RequestDispatcher rd=request.getRequestDispatcher("show_book_information.jsp");
	 request.setAttribute("list",al);
	 rd.forward(request, response);
	}	
	}	
	}

}
