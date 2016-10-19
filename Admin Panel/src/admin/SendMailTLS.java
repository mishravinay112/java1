package admin;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.*;
import javax.mail.internet.*;



public class SendMailTLS 
{
	static String email;
	static String name;
	static int status;
	
	 SendMailTLS(String email,String name,int status)
	 {
		System.out.println("mail start......");
		this.email=email;
		this.name=name;
		this.status=status;
		
	 }
	 
	 
	synchronized void mail(String email,String name,int status)
	{	
	
		final String username = "vymishra112@gmail.com";
		final String password = "mishravinay112";

		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");

		Session session = Session.getInstance(props,
		  new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		  });

		try {
			
			System.out.println("sending......");
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(username));
			message.setRecipients(Message.RecipientType.TO,
				InternetAddress.parse(email));
			message.setSubject("Account Update");
			if(status==0)
			{
				message.setText("Dear "+name+","
				+ "\n\n your account has been Disabled, please contact admin for any query!");
			}
			else
			{
				message.setText("Dear "+name+","
						+ "\n\n your account has been Activated, have a nice day!");
			}

			Transport.send(message);

			System.out.println("email sent!");

		} 
		
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void main(String args[])
	{
		SendMailTLS s=new SendMailTLS(email,name,status);
		s.mail(email, name, status);
	}
}

		
		
	
	
