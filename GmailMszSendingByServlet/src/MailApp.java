

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 * Servlet implementation class MailApp
 */
@WebServlet("/MailApp")
public class MailApp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MailApp() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 response.setContentType("text/html;charset=UTF-8");
	        PrintWriter out = response.getWriter();
	        
	        String to = request.getParameter("to");
	        String subject = request.getParameter("subject");
	        String message =  request.getParameter("message");
	        //String user = request.getParameter("user");
	        String user="anuprita888@gmail.com";
	        String pass="123456";
	        //String pass = request.getParameter("pass");
	        SendMail.send(to,subject, message, user, pass);
	        out.println("Mail send successfully");

	}

}
