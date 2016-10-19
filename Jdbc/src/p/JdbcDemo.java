package p;
import java.sql.*;
public class JdbcDemo 
{
	
	public static void main(String[] args) {
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
			PreparedStatement s=con.prepareStatement("insert into emp value(?,?,?)"); //pre compiled query
			s.setInt(1, 6);
			s.setString(2, "amit");
			s.setInt(3, 50000);
			int rs=s.executeUpdate();
			System.out.println("no of rows updated"+rs);
			/*while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
			}*/
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
