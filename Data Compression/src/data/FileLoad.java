package data;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.io.ObjectInputStream;
import java.util.Scanner;

public class FileLoad 
{	
	//ObjectInputStream ois;
	FileInputStream fis;
	InputStreamReader isr;
	private Scanner s;
	BufferedReader br;
	public FileLoad() throws IOException
	{
		s = new Scanner(System.in);
		System.out.print("specify the path : ");
		String input=s.next();
		input.replace('\\', '/');
		File f=new File(input);
		fis=new FileInputStream(f);
		isr=new InputStreamReader(fis);
		br=new BufferedReader(isr);
		//ObjectInputStream ois=new ObjectInputStream(fis);
	}
}
