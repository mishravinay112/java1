package buy;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
public class buy_Dao {
	public ArrayList<buy_Dto> bookSearch(buy_Dto bd)
	{
		int count1=0,count2=0;
		{
			ArrayList <buy_Dto> al=new ArrayList<buy_Dto>();

		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/online_Book","root","root");
			java.sql.Statement stmt=con.createStatement();
			java.sql.Statement stmt1=con.createStatement();
			java.sql.Statement stmt6=con.createStatement();
		ResultSet rs=((java.sql.Statement) stmt).executeQuery("select e_mail from registration where city='"+bd.getCity()+"'");
	    ResultSet rs6=((java.sql.Statement) stmt6).executeQuery("select e_mail from registration where state='"+bd.getState()+"'");
 while(rs.next())
    	{  
	 System.out.println("first while");
	 count1++;	
		 ResultSet rs1=((java.sql.Statement) stmt1).executeQuery("select photo_path,Book_name,price,email,auto from salesdetail where course_name='"+bd.getCourse()+"'&&course_subject='"+bd.getSubject()+"'&& email='"+rs.getString(1)+"'&&pending_status='"+1+"'");
		 while(rs1.next())
		 {
			
			 count2++;
	  	buy_Dto sd=new buy_Dto();
		sd.setPhoto_path(rs1.getString(1));
		 sd.setBook_name(rs1.getString(2));
		 sd.setPrice(rs1.getString(3));
		 sd.setEmail(rs1.getString(4)); 
		 sd.setAuto(rs1.getInt(5)); 
		 
		     al.add(sd);
		    
		 } 
   }
 int count3=0,count4=0;
 if(count1==0&&rs6.next())
 {
	
 	
	ResultSet rs2=((java.sql.Statement) stmt).executeQuery("select e_mail from registration where state='"+bd.getState()+"'");
	while(rs2.next())
	{  
    	count3++;	
	 ResultSet rs3=((java.sql.Statement) stmt1).executeQuery("select photo_path,Book_name,price,email,auto from salesdetail where course_name='"+bd.getCourse()+"'&&course_subject='"+bd.getSubject()+"'&& email='"+rs2.getString(1)+"'&&pending_status='"+1+"'");
	 while(rs3.next())
	 {	
		 
		 count4++;
	
	 buy_Dto sd=new buy_Dto();
	 sd.setPhoto_path(rs3.getString(1));
	 sd.setBook_name(rs3.getString(2));
	 sd.setPrice(rs3.getString(3));
	 sd.setEmail(rs3.getString(4)); 
	 sd.setAuto(rs3.getInt(5));
	     al.add(sd);
	     
	 } 
   } 
 }

 else if(count3==0&&count1==0&&count2==0)
 {
		
	 ResultSet rs4=((java.sql.Statement) stmt).executeQuery("select e_mail from registration");
	    while(rs4.next())
		{  
	    
	    ResultSet rs5=((java.sql.Statement) stmt1).executeQuery("select photo_path,Book_name,price,email,auto from salesdetail where course_subject='"+bd.getSubject()+"'&& email='"+rs4.getString(1)+"'&&pending_status='"+1+"'");
		 while(rs5.next())
		 {	
			 
		 buy_Dto sd=new buy_Dto();
		 sd.setPhoto_path(rs5.getString(1));
		 sd.setBook_name(rs5.getString(2));
		 sd.setPrice(rs5.getString(3));
		 sd.setEmail(rs5.getString(4)); 
		 sd.setAuto(rs5.getInt(5));
		     al.add(sd);
		     
		 } 
	   } 
	 
 }
 

		}catch(Exception e)
		{
		 System.out.println(e);
		}
		return al;
		}
		
	}	
	public ArrayList<buy_Dto> sellerDetailsDao(buy_Dto bd)
       	{
			ArrayList <buy_Dto> al=new ArrayList<buy_Dto>();
            try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/online_Book","root","root");
			java.sql.Statement stmt=con.createStatement();
	ResultSet rs=((java.sql.Statement) stmt).executeQuery("select course_name,course_Stream,course_Subject,year,Writer_name,Edition,Book_name,price,Negotiable_status,book_description,email from salesdetail where email='"+bd.getSaler_email()+"'&& auto='"+bd.getAuto()+"'");
	java.sql.Statement stmt1=con.createStatement();
	ResultSet rs1=((java.sql.Statement) stmt1).executeQuery("select name,mobile_number,city from registration where e_mail='"+bd.getSaler_email()+"'");
while(rs.next()&&rs1.next())
	{  	
		buy_Dto sd=new buy_Dto();
		 sd.setCourse(rs.getString(1));
		 sd.setCourseStream(rs.getString(2));
		 sd.setSubject(rs.getString(3));
		 sd.setYear(rs.getString(4));
		 sd.setWriter_name(rs.getString(5));
		 sd.setEdition(rs.getString(6));
		 sd.setBook_name(rs.getString(7));
		 sd.setPrice(rs.getString(8));
		 sd.setNegotiable_status(rs.getString(9));
		 sd.setBook_description(rs.getString(10));
		 sd.setEmail(rs.getString(11));
		 sd.setName(rs1.getString(1));
		 sd.setCity(rs1.getString(2));
		 sd.setMobile_number(rs1.getString(3));
		 al.add(sd);
		
}
            }catch(Exception e)
		{
		 System.out.println(e);
		}
		return al;
		}
		
		}

