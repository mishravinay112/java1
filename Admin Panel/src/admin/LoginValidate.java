package admin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class LoginValidate 
{
	private String name;
	private String password;
	private String id;
	private String userType;
	private int status;
	private String email;
	public LoginValidate(String id, String password,String userType) 
	{
		this.id=id;
		this.password=password;
		this.userType=userType;
	}
	
	public boolean validate()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/office", "root", "root");
			Statement st=con.createStatement();
			String query;
			if(userType.equals("admin"))
			{
				query="select * from admin where id='"+id+"' and password='"+password+"'";
			}
			else
			{
				query="select * from employee where id='"+id+"' and password='"+password+"'";
			}
			
			ResultSet rs=st.executeQuery(query);
			
			
			while(rs.next())
			{
				
				name=rs.getString(1);
				status=rs.getInt(4);
				email=rs.getString(5);
				return true;
			}
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		
		}
		return false;
	}
	
	public String getName()
	{
		return name;
	}
	public int getStatus()
	{
		return status;
	}
	public String getEmail()
	{
		return email;
	}
}
