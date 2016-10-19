package day;
import java.text.DecimalFormat;

public class TimeDifference 
{	
	private int hour;
	private int minute;
	private int second;
	
	public TimeDifference(String startDate,String startime,String stopDate,String stoptime) {
		
		/*DateFormat time=new SimpleDateFormat("hh:mm:ss");
		DateFormat date=new SimpleDateFormat("dd/mm/yyyy");
		*/
		DecimalFormat f=new DecimalFormat("00");
		//Scanner s=new Scanner(System.in);
		//System.out.print("ENTER TIME 1:(HH:MM:SS) ");
		//String startime=s.next();
		String time1[]=startime.split(":");
		int hour1=Integer.parseInt(time1[0]);
		int minute1=Integer.parseInt(time1[1]);
		int second1=00;//Integer.parseInt(time1[2]);
		long totalSecond1=(hour1*3600)+(minute1*60)+(second1);
		//System.out.println(totalSecond1);
		
		
		//System.out.println("ENTER DATE 1:DD/MM/YYYY");
		//String startDate=s.next();
		String date1[]=startDate.split("-");
		int year1=Integer.parseInt(date1[0]);
		int month1=Integer.parseInt(date1[1]);
		int day1=Integer.parseInt(date1[2]);
		
		//System.out.print("ENTER TIME 2:(HH:MM:SS) ");
		//String stoptime=s.next();
		
		String time2[]=stoptime.split(":");
		int hour2=Integer.parseInt(time2[0]);
		int minute2=Integer.parseInt(time2[1]);
		int second2=Integer.parseInt(time2[2]);
		long totalSecond2=(hour2*3600)+(minute2*60)+(second2);
		//System.out.println(totalSecond2);
		
		
		//System.out.println("ENTER DATE 2:DD/MM/YYYY");
		//String stopDate=s.next();
		
		String date2[]=stopDate.split("-");
		int year2=Integer.parseInt(date2[0]);
		int month2=Integer.parseInt(date2[1]);
		int day2=Integer.parseInt(date2[2]);
		
		
		
		//System.out.println(stop1);
		/*DateFormat df=new SimpleDateFormat("hh:mm:ss");
		String today=df.format(new Date(System.currentTimeMillis())).toString();
		System.out.println(today);*/
		if(year2==year1)
		{
			if(month2==month1)
			{
				if(day2==day1)
				{
					long totalSecond=totalSecond2-totalSecond1;
					//System.out.println(totalSecond);
					hour=(int) (totalSecond/3600);
					minute=(int)(totalSecond%3600)/60;
					second=(int) (totalSecond%3600)%60;
					System.out.println("difference : "+f.format(hour)+":"+f.format(minute)+":"+f.format(second));
				}
				else if(day2>day1)
				{
					long totalSecond=(totalSecond2+(day2-day1)*(24*3600))-totalSecond1;
					//System.out.println(totalSecond);
					hour=(int) (totalSecond/3600);
					minute=(int)(totalSecond%3600)/60;
					second=(int) (totalSecond%3600)%60;
					System.out.println("difference : "+f.format(hour)+":"+f.format(minute)+":"+f.format(second));
				}
				else if(day2<day1)
				{
					long totalSecond=(totalSecond2-(day1-day2)*(24*3600))-totalSecond1;
					//System.out.println(totalSecond);
					hour=(int) (totalSecond/3600);
					minute=(int)(totalSecond%3600)/60;
					second=(int) (totalSecond%3600)%60;
					System.out.println("difference : "+f.format(hour)+":"+f.format(-minute)+":"+f.format(-second));
				}
			}
			
			
			else if(month2>month1)
			{	
				int days1=dayInMonths(month1, year1);
				int day=days1-day1;
				for (int i=month1+1;i<month2;i++) 
				{
					int days2=dayInMonths(i, year2);
					day=day+days2;
				}
				day=day+day2;
				//System.out.println(f.format(day));
				long totalSecond=(totalSecond2+(day*(24*3600)))-totalSecond1;
				//System.out.println(totalSecond);
				hour=(int) (totalSecond/3600);
				minute=(int)(totalSecond%3600)/60;
				second=(int) (totalSecond%3600)%60;
				System.out.println("difference : "+f.format(hour)+":"+f.format(minute)+":"+f.format(second));
				
			}
			
			
			else if(month2<month1)
			{
				int days2=dayInMonths(month2, year1);
				int day=days2-day2;
				for (int i=month2+1;i<month1;i++) 
				{
					int days1=dayInMonths(i, year2);
					day=day+days1;
				}
				day=day+day1;
				long totalSecond=(totalSecond2-(day*(24*3600)))-totalSecond1;
				//System.out.println(totalSecond);
				hour=(int) (totalSecond/3600);
				minute=(int)(totalSecond%3600)/60;
				second=(int) (totalSecond%3600)%60;
				System.out.println("difference : "+f.format(hour)+":"+f.format(-minute)+":"+f.format(-second));
			}
		}
		
		else if(year2>year1)
		{
			int years=year2-year1;
			int months=((years*12)+month2)-month1;
			int days1=dayInMonths(month1, year1);
			int day=days1-day1;
			for (int i=month1+1;i<months;i++) 
			{
				int days2=dayInMonths(i, year2);
				day=day+days2;
			}
			day=day+day2;
			//System.out.println(f.format(day));
			long totalSecond=(totalSecond2+(day*(24*3600)))-totalSecond1;
			//System.out.println(totalSecond);
			hour=(int) (totalSecond/3600);
			minute=(int)(totalSecond%3600)/60;
			second=(int) (totalSecond%3600)%60;
			System.out.println("difference : "+f.format(hour)+":"+f.format(minute)+":"+f.format(second));
			
			
		}
		
		else if(year2<year1)
		{
			int years=year2-year1;
			int months=((years*12)+month2)-month1;
			int days2=dayInMonths(month2, year1);
			int day=days2-day2;
			for (int i=month2+1;i<months;i++) 
			{
				int days1=dayInMonths(i, year2);
				day=day+days1;
			}
			day=day+day1;
			long totalSecond=(totalSecond2-(day*(24*3600)))-totalSecond1;
			//System.out.println(totalSecond);
			hour=(int) (totalSecond/3600);
			minute=(int)(totalSecond%3600)/60;
			second=(int) (totalSecond%3600)%60;
			System.out.println("difference : "+f.format(hour)+":"+f.format(-minute)+":"+f.format(-second));
		}
	}
	

	private int  dayInMonths(int month,int year)
	{
		if(month==1)
		{
			return 31;
		}
		
		
		else if(month==3)
		{
			return 31;
		}
		else if(month==4)
		{
			return 30;
		}
		else if(month==5)
		{
			return 31;
		}
		else if(month==6)
		{
			return 30;
		}
		else if(month==7)
		{
			return 31;
		}
		else if(month==8)
		{
			return 31;
		}
		else if(month==9)
		{
			return 30;
		}
		else if(month==10)
		{
			return 31;
		}
		else if(month==11)
		{
			return 30;
		}
		else if(month==12)
		{
			return 31;
		}
		
		else 
		{	
			if(year%4==0)
			{return 29;}
			return 28;
		}
	}
	
	
	public String difference()
	{	
		return (hour+":"+minute+":"+second);
	}
	
	public int days()
	{
		return (hour/24);
	}
	
	public int getHours()
	{
		return hour;
	}
	public int minute()
	{
		return minute;
	}
	public int second()
	{
		return second;
	}
	
	public long totalSeconds()
	{
		return (Long.valueOf(hour)*3600)+(Long.valueOf(minute)*60)+(Long.valueOf(second));
	}
	
	public long getTotalSeconds(String time)
	{
		
		String part[]=time.split(":");
		long total=(Long.valueOf(part[0])*3600)+(Long.valueOf(part[1])*60)+(Long.valueOf(part[2]));
		return total;
	}
	
	public String secondToTime(long Seconds)
	{
		int hours=(int) (Seconds/3600);
		int minute=(int) ((Seconds%3600)/60);
		int second=(int) ((Seconds%3600)%60);
		
		return (hours+":"+minute+":"+second);
	}
	
	public String nextDate(String previousDate)
	{
		String part[]=previousDate.split("-");
		int year=Integer.parseInt(part[0]);
		int month=Integer.parseInt(part[1]);
		int day=Integer.parseInt(part[2]);
		
		int totalDays=dayInMonths(month, year);
		if(day==totalDays)
		{
			if(month!=12)
			{	
				day=1;
				month++;
				return (year+"-"+month+"-"+day);
			}
			else
			{	
				day=1;
				month=1;
				year++;
				return (year+"-"+month+"-"+day);
			}
		}
		else 
		{
			
				day++;
				return (year+"-"+month+"-"+day);
			
		}
	}
	
	
	
	/*public int  months()
	{
		//here code will be based of starting months
	}*/
}