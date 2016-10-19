package shareevent;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.servlet.*;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import salebook.SalesService;

@WebServlet("/EventControler")
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 2, 	// 2MB
maxFileSize = 1024 * 1024 * 10, 		// 10MB
maxRequestSize = 1024 * 1024 * 50)	
public class EventControler extends HttpServlet {
	private static final long serialVersionUID = 1L;
	File saveFile=null;
	private String file_path;
   
    public EventControler() {
        super();
       
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		HttpSession ss=request.getSession();
		String email_id=(String)ss.getAttribute("ip");
	
		 String Event_description = request.getParameter("event_description");
		
		String Event_Name=request.getParameter("eventname");
		java.util.Date now = new java.util.Date();
		Date eventdate=new java.sql.Date(now.getTime());
		List<File> uploadedFiles = saveUploadedFiles(request);
		
			String file_path1=saveFile.getAbsolutePath();
			String file_path="C:\\Users\\vicky143\\Desktop\\Aartek\\Online_Book\\Online_Book"+saveFile+"";
			
			EventDto edto=new EventDto();
			edto.setFile_path(file_path);
			edto.setEvent_name(Event_Name);
			edto.setEmail_id(email_id);
			edto.setEventdate(eventdate);
			EventService es=new EventService();
			boolean b=es.check(edto);
			edto.setEvent_description(Event_description);
			
			try
			{
			if(b==true)
			{
				
				
				boolean b1 = false;
				
					b1 = es.check_EventDetail(edto);
				  {
					
				
				}
				if(b1)
				{
					 
				        RequestDispatcher rd=request.getRequestDispatcher("Share_Event.jsp");  
				        request.setAttribute("msg", "please fill all the entries!");
				        rd.include(request, response);
				       
				}
				else
				{
					    
				       RequestDispatcher rd=request.getRequestDispatcher("Share_Event.jsp"); 
				       request.setAttribute("msg", "Your Event was successfully posted!");
				       rd.include(request, response); 
				}
			}
			else
			{
				  RequestDispatcher rd=request.getRequestDispatcher("Share_Event.jsp"); 
			       request.setAttribute("msg", "This file name is already inserted");
			       rd.include(request, response); 
		
			}
		}
			catch(Exception e)
			
			{
			System.out.println(e);
			}
		}
	private List<File> saveUploadedFiles(HttpServletRequest request)
			throws IllegalStateException, IOException, ServletException {
		//Part part=null;
		
		List<File> listFiles = new ArrayList<File>();
		byte[] buffer = new byte[4096];
		int bytesRead = -1;
		Collection<Part> multiparts = request.getParts();
		if (multiparts.size() > 0) {
			for (Part part : request.getParts()) {
			
				String fileName = extractFileName(part);
				if (fileName == null || fileName.equals("")) {
					// not attachment part, continue
					continue;
				}
				try{
			 saveFile = new File(fileName);
				}
				catch(Exception e)
				{
					System.out.println("please upload file");
				}
				
				FileOutputStream outputStream = new FileOutputStream("C:\\Users\\vicky143\\Desktop\\Aartek\\Online_Book\\Online_Book"+saveFile+"");
				
				// saves uploaded file
				InputStream inputStream = part.getInputStream();
				while ((bytesRead = inputStream.read(buffer)) != -1) {
					outputStream.write(buffer, 0, bytesRead);
				}
				outputStream.close();
				inputStream.close();
				
				listFiles.add(saveFile);
			}
		}
		return listFiles;
	}
	
	
	private String extractFileName(Part part) {
		String contentDisp = part.getHeader("content-disposition");
		String[] items = contentDisp.split(";");
		for (String s : items) {
			if (s.trim().startsWith("filename")) {
				return s.substring(s.indexOf("=") + 2, s.length() - 1);
			}
		}
		return null;
	}
	

}
