package salebook;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;
@WebServlet("/SaleControler")
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 2, 	// 2MB
maxFileSize = 1024 * 1024 * 10, 		// 10MB
maxRequestSize = 1024 * 1024 * 50)		
public class SaleControler extends HttpServlet {
	private static final long serialVersionUID = 1L;
	File saveFile=null;
	private String file_path;
   
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		String photo_path=request.getParameter("photo_path");
		String course_name=request.getParameter("category");
		String course_Stream=request.getParameter("subcategory");
		String course_subject=request.getParameter("subcategory1");
		
		String Writer_name=request.getParameter("Writer_Name");
		String Edition =request.getParameter("Edition_Name");
		String Book_name=request.getParameter("Book_Name");
		String price=request.getParameter("Prise");
		String book_description=request.getParameter("book_description");
		HttpSession sc=request.getSession();
		String email=(String)sc.getAttribute("ip");
		String Negotiable_status=request.getParameter("yes");
		
		SalesDto sdto=new SalesDto();
		sdto.setCourse_name(course_name);
		sdto.setCourse_Stream(course_Stream);
		sdto.setCourse_subject(course_subject);
		
		sdto.setWriter_name(Writer_name);
		sdto.setEdition(Edition);
	
		sdto.setBook_name(Book_name);
		sdto.setPrice(price);
		sdto.setNegotiable_status(Negotiable_status);
		sdto.setEmail(email);
		sdto.getCourse_name();
		PrintWriter out=response.getWriter();
		SalesService ss=new SalesService();
		
		List<File> uploadedFiles = saveUploadedFiles(request);
			String file_path1=saveFile.getAbsolutePath();
			String file_path="http://localhost:8080/Online_Book/file1/"+saveFile+"";
			sdto.setFile_path(file_path);
			sdto.setBook_description(book_description);
			SalesService ser=new SalesService();
			boolean b=ser.check(sdto);
			
			if(b==true)
			{
			    boolean b1=ss.cheak_Sales_Detail(sdto);
				if(b1)
				{
					  String s1="please fill all the entries!";  
				        RequestDispatcher rd=request.getRequestDispatcher("/sale.jsp");
				        request.setAttribute("msg",s1);
				        rd.include(request, response);  
				}
				else
				{
					  String s2="your book information has been submitted successfully!";  
				        RequestDispatcher rd=request.getRequestDispatcher("sale.jsp");
				        request.setAttribute("msg",s2);
				        rd.include(request, response);  
				}
			}
			else
			{
				out.print("This file name is already inserted");
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
					
					continue;
				}
				try{
			 saveFile = new File(fileName);
				}
				catch(Exception e)
				{
					System.out.println("please upload file");
				}
				
				FileOutputStream outputStream = new FileOutputStream("C://Users//vicky143//Desktop//Aartek//Online_Book//Online_Book//Online_Book//WebContent//file1//"+saveFile+"");
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