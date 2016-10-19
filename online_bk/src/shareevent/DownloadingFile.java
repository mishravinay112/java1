package shareevent;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/DownloadingFile")
public class DownloadingFile extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public DownloadingFile() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		String filename=request.getParameter("filename");
		System.out.println(filename);
		response.setHeader("Content-Disposition","attachment; filename=\"" + filename + "\""); 

		FileInputStream fileInputStream = new FileInputStream(filename);
				  
		int i; 
		while ((i=fileInputStream.read()) != -1) {
		pw.write(i); 
		} 
		fileInputStream.close(); 
		pw.close(); 
		}
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
