package data;
import java.io.IOException;

public class Algorithm 
{
	public static void main(String[] args) throws IOException 
	{
		FileLoad fl=new FileLoad();
		String print;
		String total="";
		while((print=fl.br.readLine())!=null)
		{
			System.out.print(print+" ");
			total=total+print;
		}
		System.out.println("\n"+total);
	}	
}
