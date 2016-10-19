package Registration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class RegistrationDao {
	public boolean insert(RegistrationDto s2) throws Exception
	{
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(	"jdbc:mysql://localhost:3306/online_book","root","root");
			java.sql.Statement s=con.createStatement();
			ResultSet rs=s.executeQuery("select email from blockedreguser");
			while(rs.next())
			{
				if(s2.getEmail().equals(rs.getString(1)))
				return false;
			}
			PreparedStatement stmt=con.prepareStatement("insert into Registration(name,e_mail,mobile_number,password,address,gender,state,city,area,pincode,status,college) values(?,?,?,?,?,?,?,?,?,?,?,?)");
			
			stmt.setString(1,s2.getUser_name());
			stmt.setString(2,s2.getEmail());
			stmt.setString(3,s2.getMobile());
			stmt.setString(4,s2.getUser_password());
			stmt.setString(5,s2.getAddress());
			stmt.setString(6,s2.getGender());
			stmt.setString(7,s2.getState());
			stmt.setString(8,s2.getCity());
			stmt.setString(9,s2.getArea());
			stmt.setString(10,s2.getPincode());
			stmt.setInt(11,0);
			stmt.setString(12,s2.getCollege());
			
			int i=stmt.executeUpdate();
			if(i>0)
			{
				return true;
			}
			else
			{
				return false;
			}
			}catch(Exception e){ 
				
				throw new Exception(e);
				}
 	//	return false;	
	}
	public int fatch(RegistrationDto s3) throws ClassNotFoundException, SQLException 
	
	{
		int id=0;
		try{  
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/online_Book","root","root");
					java.sql.Statement stmt=con.createStatement();
	            ResultSet rs=((java.sql.Statement) stmt).executeQuery("select user_id from Registration where e_mail='"+s3.getEmail()+"'"); 
	  if(rs.next())  
			   id=rs.getInt(1);
			 }catch(Exception e){ System.out.println(e);} 
		
		return id;
	}

}
