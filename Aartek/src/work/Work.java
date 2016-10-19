package work;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;

public class Work 
{
	public static void main(String[] args) throws Exception
	{
		File f=new File("C:\\Users\\Vinay\\Pictures\\data.txt");
		InputStream in = new FileInputStream(f);
		ArrayList<Integer> a=new ArrayList<Integer>();
		byte[] buf = new byte[(int) f.length()];//check file size from file property then set here size is 3803 bytes
	    int len;
	    String data="";
	    while ((len = in.read(buf)) !=-1)
	      {	
	    	  String line=new String(buf);
	    	  data=data+line;
	      }
	    
	   
	    String[] line=data.split("\\n");
	  //  System.out.println(line.length);
	    String result="";
	    
	    
	    int checker=1;
	    int count=0;
	    for (int i = 0; i < line.length; i++)
	    {	
	    	count++;
			if(line[i].contains("\"map\": {"))
			{
				line[i]=line[i].replace("\"map\": {", "");
				if(checker!=1)
				{
					a.add(checker-1);
				}
				checker=1;
			}
			
			else if(line[i].contains("{") )
			 {		
				 checker++;
				 
			 }
			else if(line[i].contains("}"))
			 {
				 if(checker==1)
				 {
					 line[i]=line[i].replace("\\}", ""); 
					 System.out.println("removed from line "+count);//check line no in eclipse
					 checker=checker+a.remove(a.size()-1);
				 }
				 else
				 {	
					checker--;
				 }
			 }
			// System.out.println(line[i].length());
			result=result+line[i];
		}
	   
	    System.out.println(result);
	   // System.out.println(a);
	    
	    
	}

	
}
