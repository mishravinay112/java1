package day;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class DateAndTime 
{	
	private DateFormat df;
	
	public String getDate()
	{
		df=new  SimpleDateFormat("dd-MM-yyyy");//MM mean month && m---->minute
		Date date=new Date();
		String d=df.format(date).toString();
		return d;
	}
	 
	public String getTime()
	{	
		//h-------->12 hour format
		//H-------->24 hour format
		
		df=new  SimpleDateFormat("HH:mm:ss");//small s------>second && capital S---->milliSecond
		Date date=new Date();
		String time=df.format(date).toString();
		return time;
	}
	
	
	/*public static void main(String[] args) 
	{
		DateAndTime s=new DateAndTime();
		System.out.println(s.getDate());
		System.out.println(s.getTime());
	}
	*/
}
