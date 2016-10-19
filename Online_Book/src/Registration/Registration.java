package Registration;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Registration")
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Registration() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		String user_name=request.getParameter("username");
		String user_password=request.getParameter("userpassword");
		String email=request.getParameter("useremail");
		String mobile=request.getParameter("mobileno");
		String state=request.getParameter("state");
		String city=request.getParameter("city");
		String college=request.getParameter("college");
		String area=request.getParameter("area");
		String address=request.getParameter("address");
		String gender=request.getParameter("gender");
		String pincode=request.getParameter("pincode");
		RegistrationService rs=new RegistrationService();
		
	
	RegistrationDto rd=new RegistrationDto();
	rd.setAddress(address);
	rd.setCity(city);
	rd.setArea(area);
	rd.setEmail(email);
	rd.setGender(gender);
	rd.setMobile(mobile);
	rd.setCollege(college);
	rd.setPincode(pincode);
	rd.setState(state);
	rd.setUser_name(user_name);
	rd.setUser_password(user_password);
	String s1=null;
	try{
	s1=rs.insertService(rd);
    if(s1.equals("true"))
	{
		int user_id=0;
		try {
			user_id=rs.fatch(rd);
		} catch (ClassNotFoundException | SQLException e1) {
			
			e1.printStackTrace();
		}
		RequestDispatcher r=request.getRequestDispatcher("registration.jsp");
	  	  request.setAttribute("msg","Your Registration has been done  and confirmed your link");
	  	  r.include(request, response);
			 Properties props = new Properties();
		  	  props.put("mail.smtp.host", "smtp.gmail.com");
		  	  props.put("mail.smtp.socketFactory.port", "465");
		  	  props.put("mail.smtp.socketFactory.class",
		  	        	"javax.net.ssl.SSLSocketFactory");
		  	  props.put("mail.smtp.auth", "true");
		  	  props.put("mail.smtp.port", "465");
		  	 
		  	  Session session = Session.getDefaultInstance(props,
		  	   new javax.mail.Authenticator() {
		  	   protected PasswordAuthentication getPasswordAuthentication() {
		  	   return new PasswordAuthentication("vikasharle123@gmail.com","vickyharle");//change accordingly
		  	   }
		  	  });
		  	 
		  	 
		  	  try {
		  	   MimeMessage message = new MimeMessage(session);
		  	   message.setFrom(new InternetAddress(email));//change accordingly
		  	   message.addRecipient(Message.RecipientType.TO,new InternetAddress(email));
		  	  message.setSubject("from online books event and notes share");
		  	   message.setText("");
		  	  message.setContent("<h1><a href='http://127.0.0.1:8080/Online_Book/E_Mail_Verification?userid="+user_id+"'>Pls Click Here for Verifcation</a></h1>","text/html");
		  	   Transport.send(message);
		      } catch (Exception e) {System.out.println("Exception");}
			
			  

	}
    else
    {
    	pw.print("you hava been blocked");
    }
  
  
	}catch(Exception e)
	{
		RequestDispatcher r=request.getRequestDispatcher("registration.jsp");
	  	  request.setAttribute("msg","This email id is already Registered");
	  	  r.forward(request, response);

	}	
		
	}		
	}

