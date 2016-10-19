package view_registration;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Deletet_Reg_Controller")
public class Deletet_Reg_Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email=request.getParameter("ugmail");
        View_Reg_Service drs=new View_Reg_Service();
		drs.deletetRegService(email);
        RequestDispatcher rd=request.getRequestDispatcher("/View_Reg_Controller");
		rd.forward(request, response);
	
	    }
}
