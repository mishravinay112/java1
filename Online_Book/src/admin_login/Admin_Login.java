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
import javax.servlet.http.HttpSession;
@WebServlet("/Admin_Login")
public class Admin_Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       public Admin_Login() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw=response.getWriter();
		String admin_id=request.getParameter("admin_id");
		String password=request.getParameter("password");
		Admin_Service as=new Admin_Service();
		ArrayList al=as.admin_Check();
		Iterator<Admin_Dto>it=al.iterator();
		int count=0;
		HttpSession hs1=null;	
		while(it.hasNext())
		{
			Admin_Dto ad=it.next();
			if(ad.getAdmin_id().equals(admin_id)&&ad.getAdmin_password().equals(password))
				count++;
			
		}		
		if(count>0)
		{
			hs1=request.getSession();
		    hs1.setAttribute("ip",admin_id);
			RequestDispatcher rd=request.getRequestDispatcher("admin_link.jsp");
			rd.forward(request, response);
		}
		else
		{
			hs1=request.getSession(false);
			try{
			hs1.invalidate();
			hs1=null;
			}catch(Exception e)
			{
				System.out.println();
			}
			//pw.print("Your Id or Password Is worng");
			RequestDispatcher rd=request.getRequestDispatcher("admin.jsp");
		    request.setAttribute("msg","Your Id or Password Is worng" );
			rd.include(request, response);
			
		}
	}

}
