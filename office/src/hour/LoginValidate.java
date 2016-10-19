package hour;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class LoginValidate 
{
	private String id;
	private String password;
	private String name;
	Connection con;
	
	public LoginValidate(String id,String password) 
	{
		this.id=id;
		this.password=password;
		try{
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/office", "root", "root");
			}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	public boolean validate() throws Exception
	{
		
		Statement st=con.createStatement();
		String query="select id,password,name from employee where id='"+id+"' and password='"+password+"'";
		ResultSet rs=st.executeQuery(query);
		while(rs.next())
		{	
			name=rs.getString(3);
			return true;
		}
		return false;
	}
	
	
	public String getName()
	{
		return name;
	}
	
	public String getId()
	{
		return id;
	}
	
}
