package pending;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class pending_status_enableDao {
	public boolean enable(pending_status_Dto psd)
	{    
		try{
			Class.forName("com.mysql.jdbc.Driver");
	    	Connection con=DriverManager.getConnection(	"jdbc:mysql://localhost:3306/online_Book","root","root");
			PreparedStatement ps=con.prepareStatement("update salesdetail set pending_status=? where auto='"+psd.getAutoincrement()+"'");
		  ps.setInt(1, 1);
			int i=ps.executeUpdate();
			if(i>0)
			{
				return true;
			}
		}catch(Exception e)
		{
			System.out.println(e);
		}
	return false;
}
}