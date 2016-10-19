package first;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/login")
public class login extends HttpServlet {
	
    public login() {
        super();
       
    }

	
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		response.setContentType("text");
		PrintWriter out=response.getWriter();
		out.println("welcome "+name);
		out.println("\nyour password is "+request.getParameter("password"));
	}

	

}
