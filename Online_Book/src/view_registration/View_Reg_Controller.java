package view_registration;

import java.io.IOException;
import java.util.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/View_Reg_Controller")
public class View_Reg_Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       public View_Reg_Controller() {
        super();
      
    }
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doPost(request, response);
	}
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		View_Reg_Service vrs=new View_Reg_Service();
		View_Reg_Dto dddto=new View_Reg_Dto();
		ArrayList<View_Reg_Dto> al = null;
		try {
		al = vrs.view_Reg_Service();
		request.setAttribute( "list",al);
		RequestDispatcher rd=request.getRequestDispatcher("/View_Reg.jsp");
		rd.forward(request, response);
	
	       
		   
		} catch (ClassNotFoundException e) {
		
		e.printStackTrace();
	    }
	}

}
