package first;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;


@WebServlet("/Download")
public class Download extends GenericServlet implements Servlet {
	private static final long serialVersionUID = 1L;
   
    public Download() {
        super();
    }


	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		String link=request.getParameter("value");
		response.setContentType("application/octet-stream");
	//	PrintWriter out=response.getWriter();
		//out.println(link);
		//out.println(link.length());
		
		if(link=="mysql")
		{
			//out.println(" your DOWNLOAD for "+ link +" has been initialized ");
			File f=new File("F:\\SOFTWARE\\my sql\\Setup");
			//out.println("<html><head><title>jdk</title></head><body><a href='"+f.getPath()+"'>click here to download</a></body></html>");
		}
		else if(link.equals("eclipse"))
		{
			//out.println(" your DOWNLOAD for "+ link +" has been initialized ");
			File f=new File("F:\\SOFTWARE\\Eclipse\\eclipse-jee-mars-1-win32-x86_64");
			//FileOutputStream fos=new FileOutputStream(f);
			//out.println(fos);
			//out.println("<html><head><title>jdk</title></head><body><a href='"+f.getPath()+"'>click here to download</a></body></html>");
		}
		else if(link.equals("jdk"))
		{
			//out.println(" your DOWNLOAD for "+ link +" has been initialized ");
			File f=new File("F:\\SOFTWARE\\Java\\jdk.exe");
			int length=(int)f.length();
			byte b[]=new byte[length];
			
			//out.println("<html><head><title>jdk</title></head><body><a href='"+f.getPath()+"'>click here to download</a></body></html>");
			
			FileInputStream fis=new FileInputStream(f);
			BufferedInputStream bis=new BufferedInputStream(fis);
			System.out.println("jjjjjjjjjjjjjjjjdddkkkkkkkkkkk");
			bis.read(b);
			
			OutputStream os=response.getOutputStream();
			
			os.write(b);
			bis.close();
			
		}
		
		
		else if(link.equals("vlc"))
		{
			//out.println(" your DOWNLOAD for "+ link +" has been initialized ");
			File f=new File("F:\\SOFTWARE\\vlc-2.1.5-win32");
			//out.println("<html><head><title>jdk</title></head><body><a href='"+f.getPath()+"'>click here to download</a></body></html>");
			
			
		}
	}

}
