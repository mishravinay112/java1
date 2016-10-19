package IpchangeInDb;

import java.net.InetAddress;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Change 
{
	public static void main(String[] args)
	{	
		ArrayList<String>url=new ArrayList<String>();
		ArrayList<Integer>primary=new ArrayList<Integer>();
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/online_book","root","root");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select photo_path,auto from salesdetail");
			while(rs.next())
			{
				//System.out.println(rs.getString(1));
				String data=rs.getString(1);
				String part[]=data.split("/");
				//System.out.println(part[2]);
				//System.out.println(InetAddress.getLocalHost().getHostAddress()+":8080");
				part[2]=InetAddress.getLocalHost().getHostAddress()+":8080";
				//part[2]="localhost:8080";
				String newData="";
				for (int i = 0; i < part.length; i++)
				{	
					if(i<part.length-1)
					newData+=part[i]+"/";
					else
					newData+=part[i];
						
				}
				url.add(newData);
				primary.add(rs.getInt(2));
			}
			for (int i = 0; i < url.size(); i++)
			{
				PreparedStatement ps=con.prepareStatement("update salesdetail set photo_path=? where auto=? ");
				ps.setString(1, url.get(i));
				ps.setInt(2, primary.get(i));
				ps.executeUpdate();
			}
			System.out.println("data successfully updated............");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}
}
