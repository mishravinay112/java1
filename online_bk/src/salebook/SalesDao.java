package salebook;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;



public class SalesDao {
public void insert_sales_Details(SalesDto sdto)
{
	try{  
		
        Class.forName("com.mysql.jdbc.Driver");  
		java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/online_Book","root","root");
		PreparedStatement p1=(PreparedStatement) con.prepareStatement("insert into salesdetail(photo_path,course_name,course_Stream,course_subject,Writer_name,Edition,Book_name,price,Negotiable_status,book_description,email) values(?,?,?,?,?,?,?,?,?,?,?)");
		  p1.setString(1, sdto.getFile_path());
		  p1.setString(2, sdto.getCourse_name());
		  p1.setString(3,sdto.getCourse_Stream());
		  p1.setString(4, sdto.getCourse_subject());
		   p1.setString(5, sdto.getWriter_name());
		  p1.setString(6,sdto.getEdition());
		  p1.setString(7, sdto.getBook_name());
		  p1.setString(8, sdto.getPrice());
		  p1.setString(9, sdto.getNegotiable_status());
		  p1.setString(10, sdto.getBook_description());
		  p1.setString(11, sdto.getEmail());
		  p1.executeUpdate();
		}catch(Exception e){ 
			System.out.println(e);
			}  
}


}

