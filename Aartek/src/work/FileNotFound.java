package work;

import java.io.FileNotFoundException;

public class FileNotFound
{
	public static void main(String[] args)
	{
		try
		{
			throw new FileNotFoundException();
		}
		catch(Exception e)
		{
			//e.printStackTrace();
			System.out.println("vinay");
			System.out.println(Long.MAX_VALUE);
			System.out.println(Integer.MAX_VALUE);
			System.out.println(Short.MAX_VALUE);
		}
	}
}
