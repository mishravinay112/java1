package cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public Servlet1() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String name=request.getParameter("firstName");
		Cookie c=new Cookie("first", name);
		response.addCookie(c);
		out.println("<!DOCTYPE html><html><head><meta charset=\"ISO-8859-1\"><title>Name</title><style type=\"text/css\">body{padding-left: 500px;padding-top: 100px;}");
		out.println("p{display: inline;}</style></head><body><form action=\"Servlet2\" method=\"get\">");
		out.println("<p><label for=\"lastName\">Last Name</label>&nbsp&nbsp&nbsp<input type=\"text\" id=\"lastName\" name=\"lastName\" placeholder=\"Last Name\"></p>");
		out.println("<p><input type=\"submit\" value=\"submit\"></p></form></body></html>");
	}

}
