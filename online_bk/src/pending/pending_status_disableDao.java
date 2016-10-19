package pending;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class pending_status_disableDao {
public boolean disable(pending_status_Dto psd)
{
	try{
	System.out.println("gggggg"+psd.getEmail());
		Class.forName("com.mysql.jdbc.Driver");
    	Connection con=DriverManager.getConnection(	"jdbc:mysql://localhost:3306/online_Book","root","root");
		PreparedStatement ps=con.prepareStatement("update salesdetail set pending_status=? where auto='"+psd.getAutoincrement()+"'");
	  ps.setInt(1, 0);
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