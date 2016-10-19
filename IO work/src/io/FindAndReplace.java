package io;

import java.io.File;
import java.io.FileInputStream;

public class FindAndReplace 
{
	public static void main(String[] args) throws Exception
	{
		File f=new File("C:\\Users\\Vinay\\Documents\\hello.txt");
		FileInputStream fis=new FileInputStream(f);
		byte[] buf = new byte[(int) f.length()];
		int i=0;
		String data="";
		while((i=fis.read(buf))!=-1)
		{
			String line=new String(buf);
			System.out.println(line);
			break;
			//data+=line;
			//System.out.println(data);
		}
	}
}
