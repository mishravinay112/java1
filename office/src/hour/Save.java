package hour;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Save
{
	LoginValidate lv;
	Connection con;
	String date;
	String time;
	String workTime;
	public boolean isSave=false;
	
	DateAndTime today=new DateAndTime();
	
	public Save(LoginValidate lv, String date, String time) 
	{	
		this.lv=lv;
		con=lv.con;
		this.date=date;
		this.time=time;
		
	}
	
	public void doWork()
	{
		
		String date2=today.getDate();
		String time2=today.getTime();
		TimeDifference td=new TimeDifference(date, time, date2, time2);
		workTime=td.difference();
		try {
			Statement st=con.createStatement();
			String query="select * from details where id='"+lv.getId()+"' and date='"+date+"'";
			ResultSet rs=st.executeQuery(query);
			int run=0;
			while(rs.next())
			{	
				run=1;
				long puraneSecond=td.getTotalSeconds(rs.getString(3));
				long nayeSeconds=td.getTotalSeconds(workTime);
				long total=puraneSecond+nayeSeconds;
				String workDone=td.secondToTime(total);
				PreparedStatement ps=con.prepareStatement("update details set no_of_hours=? where id=? and date=?");
				ps.setString(2, lv.getId());
				ps.setString(3, date);
				ps.setString(1,workDone);
				ps.executeUpdate();
				isSave=true;
			}
			if(run==0)
			{	
				connection();
			}
			
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
	}
	
	private void connection() 
	{
		try
		{	
			if(date.equals(today.getDate()))
			{
				dataInsert(date,workTime);
			}
			else
			{
				TimeDifference td=new TimeDifference(date, time, today.getDate(), today.getTime());
				String totalTime=td.difference();
				int days=td.days();
				long starting=td.getTotalSeconds("24:00:00")-td.getTotalSeconds(time);
				String day1work=td.secondToTime(starting);
				dataInsert(date, day1work);
				for (int i = 2; i < days; i++) 
				{
					dataInsert(td.nextDate(date), "24:00:00");
				}
				dataInsert(td.nextDate(date), today.getTime());
				
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	private float performance(String workTime)
	{	
		String timePart[]=workTime.split(":");
		int hours=Integer.parseInt(timePart[0]);
		float performance=0.0f;
		if(hours<4)
		{
			performance=0.0f;
		}
		else if(hours>=4 && hours<8)
		{
			performance=0.5f;
		}
		else if(hours>=8 && hours<=12)
		{
			performance=1.0f;
		}
		return performance;
	}
	
	
	public void dataInsert(String date,String workTime) throws Exception
	{
		PreparedStatement ps=con.prepareStatement("insert into details value (?,?,?,?)");
		ps.setString(1, lv.getId());
		ps.setString(2,date);
		ps.setString(3, workTime);
		ps.setFloat(4, performance(workTime));
		ps.executeUpdate();
		isSave=true;
	}
	
}
