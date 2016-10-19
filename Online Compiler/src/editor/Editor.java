package editor;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Editor")
public class Editor extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Editor() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	doPost(request, response);
	}

	
	@SuppressWarnings("resource")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String code=request.getParameter("code");
		//out.println(code);
		File f=new File("C:\\Users\\Vinay\\Documents\\Test.java");
		FileWriter fw=new FileWriter(f);
		fw.write(code);
		fw.flush();
		Process p=Runtime.getRuntime().exec("javac C:\\Users\\Vinay\\Documents\\Test.java");
		InputStream is=p.getErrorStream();
		InputStreamReader isr=new InputStreamReader(is);
		BufferedReader br=new BufferedReader(isr);
		int run=0;
		while(br.readLine()!=null)
		{
			out.println(br.readLine());
			run++;
		}
		
		if(run==0)
		{
			return;
		}
		Process p1=Runtime.getRuntime().exec("java C:\\Users\\Vinay\\Documents\\Test");
		InputStream is1=p1.getErrorStream();
		InputStreamReader isr1=new InputStreamReader(is1);
		BufferedReader br1=new BufferedReader(isr1);
		int run1=0;
		while(br1.readLine()!=null)
		{
			out.println(br1.readLine());
			
			run1++;
		} 
		if(run1==0)
		{
			InputStream is2=p1.getInputStream();
			InputStreamReader isr2=new InputStreamReader(is2);
			BufferedReader br2=new BufferedReader(isr2);
			while(br2.readLine()!=null)
			{
				out.println(br1.readLine());
			}
		}
		br.close();
		fw.close();
	}

}
