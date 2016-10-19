package hours;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateIssue 
{	
	
	public static void main(String[] args) throws ParseException 
	{	
		DecimalFormat df=new DecimalFormat("00");
		int month=00;
		
		String today=new Date(System.currentTimeMillis()).toString();
		String part[]=today.split(" ");
		/*for (int i = 0; i < part.length; i++)
		{
			System.out.println(part[i]);
		}*/
		
		
			if(part[1].equals("jan"))
			{
				month=1;
				
			}
			
			 else if(part[1].equals("Feb"))
			{
				month=2;
				
			}
			
			 else if(part[1].equals("Mar"))
			{
				month=3;
				
			}
			
			else if(part[1].equals("Apr"))
			{
				month=4;
				
			}
			
			else if(part[1].equals("May"))
			{
				month=5;
				
			}
			
			else if(part[1].equals("Jun"))
			{
				month=6;
				
			}
			
			else if(part[1].equals("Jul"))
			{
				month=7;
				
			}
			
			else if(part[1].equals("Aug"))
			{
				month=8;
				
			}
			
			else if(part[1].equals("Sep"))
			{
				month=9;
				
			}
			
			
			else if(part[1].equals("Oct"))
			{
				month=10;
				
			}
			
			else if(part[1].equals("Nov"))
			{
				month=11;
				
			}
			
			else if(part[1].equals("Dec"))
			{
				month=12;
				
			}
			String time=part[3];
			//System.out.println("date = "+part[2]+":"+df.format(month)+":"+part[5]);
			String date=part[5]+"-"+df.format(month)+"-"+part[2];
			System.out.println(time);
			//System.out.println(date);
			DateFormat df1=new SimpleDateFormat("yyyy-mm-dd");
			Date d=df1.parse(date);
			System.out.println((d));
			
		
	}
}
