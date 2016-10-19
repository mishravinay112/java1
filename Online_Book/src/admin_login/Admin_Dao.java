package admin_login;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.util.ArrayList;

	

	public class Admin_Dao {
		public ArrayList<Admin_Dto> fatch()
		{
		
			
			ArrayList <Admin_Dto> al=new ArrayList<Admin_Dto>();

		try{
			int status=0;
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/online_Book","root","root");
					java.sql.Statement stmt=con.createStatement();
	ResultSet rs=((java.sql.Statement) stmt).executeQuery("select * from salesdetail where pending_status='"+status+"'");
	System.out.println("dao12"+rs.next());
	
	while(rs.next())
			{  	
		   
		   Admin_Dto sd=new Admin_Dto();
		 sd.setPhoto_path(rs.getString(1));
		 sd.setCourse_name(rs.getString(2));
		 sd.setCourse_Stream(rs.getString(3));
		 sd.setCourrse_subject(rs.getString(4));
		 sd.setYear(rs.getString(5));
		 sd.setWriter_name(rs.getString(6));
		 sd.setEdition(rs.getString(7));
		 sd.setBook_name(rs.getString(8));
		 sd.setPrice(rs.getString(9));
		 sd.setNegotiable_status(rs.getString(10));
		 sd.setBook_description(rs.getString(11));
		     al.add(sd);
		 
			}
		}catch(Exception e)
		{
		 System.out.println(e);
		}
		return al;
		}
		
		public ArrayList<Admin_Dto> admin_Check()
		{
			
			ArrayList <Admin_Dto> al1=new ArrayList<Admin_Dto>();
			try{
				
				
				Class.forName("com.mysql.jdbc.Driver");
				
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/online_book","root","root");
				java.sql.Statement stmt1=con.createStatement();
				
		ResultSet rs1=((java.sql.Statement) stmt1).executeQuery("select * from admin_login");
		
		while(rs1.next())
		{  	
			
	   
	    Admin_Dto sd=new Admin_Dto();
	   sd.setAdmin_id(rs1.getString(1));
	   sd.setAdmin_password(rs1.getString(2));
	   al1.add(sd);
	    }
		
	}catch(Exception e)
	{    
		
		System.out.println("catch hh");
		System.out.println(e);
	}
			return al1;
		}

}



