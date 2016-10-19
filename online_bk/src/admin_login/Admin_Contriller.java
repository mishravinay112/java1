package admin_login;

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


@WebServlet("/Admin_Contriller")
public class Admin_Contriller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Admin_Contriller() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter ps=response.getWriter();
		
	
		Admin_Service rs=new Admin_Service();
		ArrayList<Admin_Dto> al=new ArrayList<Admin_Dto>();
				 al=rs.fatch();
				 System.out.println("Vikas");
				 RequestDispatcher rd=request.getRequestDispatcher("viewPendingUser.jsp");
				 request.setAttribute("list",al);
				 rd.include(request, response);
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
