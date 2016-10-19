package view_registration;

import java.sql.*;
import java.util.ArrayList;



public class View_Reg_Dao {
	
	public ArrayList<View_Reg_Dto> view_Reg_Dao() throws ClassNotFoundException
	{
		ArrayList<View_Reg_Dto> al=new ArrayList<View_Reg_Dto>();
		try
		{
		
		Class.forName("com.mysql.jdbc.Driver");  
		java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/online_Book","root","root");
		Statement st=(Statement) con.createStatement();
		ResultSet rs=(ResultSet) st.executeQuery("select * from registration");
		while(rs.next())
		{
			View_Reg_Dto vrd=new View_Reg_Dto();
			vrd.setName( rs.getString(1));
			vrd.setEmail(rs.getString(2));
			vrd.setMobile(rs.getString(3));
			vrd.setPassword(rs.getString(4));
			vrd.setAddress(rs.getString(5));
			vrd.setGender(rs.getString( 6));
			vrd.setState(rs.getString(7));
			vrd.setCity(rs.getString( 8));
			vrd.setArea(rs.getString( 9));
			vrd.setPincode(rs.getString( 10));
			vrd.setStatus(rs.getInt( 11));
			vrd.setUserid(rs.getInt( 12));
			vrd.setCollege( rs.getString(13));
			al.add(vrd);
		}
		
		}
		catch(Exception e)
		{
			
		}
		
		return al;
	
}

	public String deleteRegDao(String emailid) {
		
		try
		{
		
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/online_Book","root","root");
		Statement st=(Statement) con.createStatement();
		int insertrecord= st.executeUpdate("insert into blockedreguser(select  * from registration where e_mail='"+emailid+"')");
		int deleterecord=st.executeUpdate("delete from registration where e_mail='"+emailid+"'");
	    
		}
		catch(Exception e)
		{
			
		}
		return emailid;
		
		
		
		
	}
}