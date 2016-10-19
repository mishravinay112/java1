package dictionary;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Dictionary 
{	
	static Connection con;
	static
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/entries","root","root");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	
	public static void main(String[] args) throws Exception 
	{
		Scanner s=new Scanner(System.in);
		/*System.out.println("Enter the paragraph : enter 'done!' to quit");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String paragraph="";
		String str;
		do
		{
			str=br.readLine();
			if(!str.equals("done!"))
			paragraph+=str;
		}
		while(!str.equals("done!"));*/
		System.out.print("enter word for meaning : ");
		String word=s.next();
		Statement st=con.createStatement();
		String query="select * from entries where word like '"+word+"%'";
		ResultSet rs=st.executeQuery(query);
		int run=0;
		while(rs.next())
		{
			System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
			run++;
		}
		if(run==0)
		{
			System.out.println("no meaning available for entered word...........check online");
		}
		else
		{
			System.out.println(run+" results found");
		}
		
				
	
		
		
	}
}
