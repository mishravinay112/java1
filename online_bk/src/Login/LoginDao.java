package Login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



public class LoginDao {
	public String loginInsert(LoginDto sd)
	{
		int status=0,count1=0,count2=0,count3=0,count4=0;
		try{
		
			Class.forName("com.mysql.jdbc.Driver");
	
        	Connection con=DriverManager.getConnection(	"jdbc:mysql://localhost:3306/online_Book","root","root");
    		java.sql.Statement stmt=con.createStatement();
    		ResultSet rs=((java.sql.Statement) stmt).executeQuery("select e_mail,password from Registration");
    		java.sql.Statement stmt1=con.createStatement();
    		ResultSet rs1=((java.sql.Statement) stmt1).executeQuery("select status from Registration where e_mail='"+sd.getUserId()+"'");
    		String s1=sd.getUserId();
    		String s2=sd.getPassword();
    		
    		if(rs1.next())
    		{
    			status=rs1.getInt(1);
    		}
    			while(rs.next())
    				{  	
    			     
    			      String user_id =rs.getString(1);
    			      String password=rs.getString(2);
    			      if((user_id.equals(s1)))
    			      {
    			        if((password.equals(s2)))
    			    	  {
    			    		  if(status==1)
    			    			  count1++;
    			    		  else
    			    		   count4++;
    			    	  }
    			    	  else
    			    	  {
    			    		  count2++;
    			    	
    			    	  }
    			      }
    			      else
    			      {
    			    	  count3++;
    			    	 
    			      }
       				}

			
			}catch(Exception e){ 
				
				System.out.println(e);
				}
	  if(count1>0)
		  {
	      return "Your login has Done";
		  }
		 else if(count2>0)
		  {
			return  "your password is wrong"; 
		  }
		
		 else if(count4>0) 
		 {
			 return "you email is not verified";  
		 }
		 else
		 {
			 return "Your E-mail id is wrong"; 
		 }
	
	
		
 		
	}
	
	public String username(LoginDto sd)
	{
		String name=null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
        	Connection con=DriverManager.getConnection(	"jdbc:mysql://localhost:3306/online_Book","root","root");
    		java.sql.Statement stmt=con.createStatement();
    		ResultSet rs=((java.sql.Statement) stmt).executeQuery("select name from Registration where e_mail='"+sd.getUserId()+"'");
    		if(rs.next())
    		{
    			name=rs.getString(1);
    			System.out.println("user name="+name);
    		}
    		
	}
		catch(Exception e)
		{
			
		}
		return name;
	
	}
}
