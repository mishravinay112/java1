package pending;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;


public class pending_statusDao {
public ArrayList<pending_status_Dto> view()
{
  ArrayList<pending_status_Dto> al=new ArrayList<pending_status_Dto>();
		try{
			Class.forName("com.mysql.jdbc.Driver");
     	Connection con=DriverManager.getConnection(	"jdbc:mysql://localhost:3306/online_Book","root","root");
 		java.sql.Statement stmt1=con.createStatement();
 		ResultSet rs1=((java.sql.Statement) stmt1).executeQuery("select photo_path, course_name,course_Stream,course_subject,year,Writer_name,Edition,Book_name,price,Negotiable_status,book_description,pending_status,email,auto from salesdetail ");
 		while(rs1.next())
 		{
 			pending_status_Dto r=new pending_status_Dto();
 			r.setFile_path(rs1.getString(1));
 			r.setCourse_name(rs1.getString(2));
 			r.setCourse_Stream(rs1.getString(3));
 			r.setCourse_subject(rs1.getString(4));
 			r.setYear(rs1.getString(5));
 			r.setWriter_name(rs1.getString(6));
 			r.setEdition(rs1.getString(7));
 			r.setBook_name(rs1.getString(8));
 			r.setPrice(rs1.getString(9));
 			r.setNegotiable_status(rs1.getString(10));
 			r.setBook_description(rs1.getString(11));
 			r.setPending_status(rs1.getString(12));
 			r.setEmail(rs1.getString(13));
 			r.setAutoincrement(rs1.getInt(14));
 			
 			al.add(r);
 			
 		}
 		}catch (Exception e) {
			 System.out.println(e);
			}
	 return al;	
}
}
