package shareevent;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;






import salebook.SalesDto;

public class EventDao {
	public void insert_Event_Details(EventDto ed) throws Exception
	{
		try{  
			
			Class.forName("com.mysql.jdbc.Driver");  
			java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/online_book","root","root");
			PreparedStatement p1=(PreparedStatement) con.prepareStatement("insert into event_detail(email_id,file_path,event_description,event_name,eventdate) values(?,?,?,?,?)");
			p1.setString(1, ed.getEmail_id());
			p1.setString(2,ed.getFile_path());
			 p1.setString(3, ed.getEvent_description());
			 p1.setString(4, ed.getEvent_name());
			 p1.setDate(5, ed.getEventdate());
			  p1.executeUpdate();
			}catch(Exception e){ 
			 throw new Exception();
			}  
	}

	public ArrayList<EventDto> veiw_Event_Detail() throws Exception
	{ArrayList<EventDto> al=new ArrayList<EventDto>();
		try
		{
		Class.forName("com.mysql.jdbc.Driver");  
		java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/online_book","root","root");
		Statement st=(Statement) con.createStatement();
		
		ResultSet rs=(ResultSet) st.executeQuery("select email_id,event_description,event_name,file_path,event_id,event_status from event_detail");
		while(rs.next())
		{
			EventDto edto=new EventDto();
		
			edto.setEmail_id(rs.getString(1));
			edto.setEvent_description(rs.getString(2));
			edto.setEvent_name(rs.getString(3));
			edto.setFile_path(rs.getString(4));
			edto.setEvent_id(rs.getInt(5));
			edto.setEvent_status(rs.getInt(6));
			
			al.add(edto);
		}
		
		}
		catch(Exception e)
		{
			
		}
		
		return al;
		}

	public boolean delete_event_infodao(String event_id) {
	try
		{
		Class.forName("com.mysql.jdbc.Driver");  
		java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/online_book","root","root");
		Statement st=(Statement) con.createStatement();
		System.out.println(event_id);
		 int n=st.executeUpdate("delete from event_detail where event_id='"+event_id+"'");
		 System.out.println(n);
		 
		}
		catch(Exception e)
		{
		return false;	
		}
		return true;
	}

	public boolean update_disable_status(String event_id) {
		// TODO Auto-generated method stub
		try{
			
			Class.forName("com.mysql.jdbc.Driver");
	    	Connection con=(Connection) DriverManager.getConnection(	"jdbc:mysql://localhost:3306/online_book","root","root");
			PreparedStatement ps=con.prepareStatement("update event_detail set event_status=? where event_id='"+event_id+"'");
		  ps.setInt(1, 0);
			int i=ps.executeUpdate();
			if(i>0)
			{
				return true;
			}
		}catch(Exception e)
		{
			return false;
		}
return true;
	}
	
	public boolean update_event_status(String event_id) {
		try{
			Class.forName("com.mysql.jdbc.Driver");
	    	Connection con=(Connection) DriverManager.getConnection(	"jdbc:mysql://localhost:3306/online_book","root","root");
			PreparedStatement ps=con.prepareStatement("update event_detail set event_status=? where event_id='"+event_id+"'");
		  ps.setInt(1, 1);
			int i=ps.executeUpdate();
			if(i>0)
			{
				return true;
			}
		}catch(Exception e)
		{
		return false;
		}
	return true;
	}

	public ArrayList<EventDto> veiw_UserEvent_Detail() {
        ArrayList<EventDto> al=new ArrayList<EventDto>();
		try
		{
			
			int n=1;
		Class.forName("com.mysql.jdbc.Driver");  
		java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/online_book","root","root");
		Statement st=(Statement) con.createStatement();
		
		ResultSet rs=(ResultSet) st.executeQuery("select event_description,event_name,file_path from event_detail where event_status='"+n+"' order by(eventdate) desc");
		while(rs.next())
		{
			EventDto edto=new EventDto();
		    edto.setEvent_description(rs.getString(1));
			edto.setEvent_name(rs.getString(2));
			edto.setFile_path(rs.getString(3));;
			al.add(edto);
		}
		
		}
		catch(Exception e)
		{
			
		}
		
		return al;
		
	}
	
}
