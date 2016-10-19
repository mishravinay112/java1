package day;

import java.text.DecimalFormat;

public class Time 
{	
	int hour;
	int minute;
	int second;
	String date;
	String time;
	int d;
	
	DateAndTime today=new DateAndTime();
	DecimalFormat f=new DecimalFormat("00");
	
	/*public Time(String date,String time)
	{
		new Time(date,time,today.getDate(),today.getTime());
	}*/
	
	public Time(String date,String time)
	{
		
				this.date=date;
				this.time=time;
				
				String part[]=date.split("-");
				
				int day1=Integer.parseInt(part[2]);
				int month1=Integer.parseInt(part[1]);
				int year1=Integer.parseInt(part[0]);
				
				String time1[]=time.split(":");
				int hour1=Integer.parseInt(time1[0]);
				int minute1=Integer.parseInt(time1[1]);
				int second1;
				try
				{
					second1=Integer.parseInt(time1[2]);
				}
				catch(Exception e)
				{
					second1=00;
				}
				
				long totalSecond1=(hour1*3600)+(minute1*60)+(second1);
				
				String part2[]=today.getDate().split("-");
				int day2=Integer.parseInt(part2[0]);
				int month2=Integer.parseInt(part2[1]);
				int year2=Integer.parseInt(part2[2]);

				String time2[]=today.getTime().split(":");
				int hour2=Integer.parseInt(time2[0]);
				int minute2=Integer.parseInt(time2[1]);
				int second2=Integer.parseInt(time2[2]);
				long totalSecond2=(hour2*3600)+(minute2*60)+(second2);
				
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
							long totalSecond=(totalSecond2+((day2-day1)*(24*3600)))-totalSecond1;
							//System.out.println(totalSecond);
							hour=(int) (totalSecond/3600);
							minute=(int)(totalSecond%3600)/60;
							second=(int) (totalSecond%3600)%60;
							System.out.println("difference : "+f.format(hour)+":"+f.format(minute)+":"+f.format(second));
						}
						
						else if(day2<day1)
						{
							long totalSecond=(totalSecond2-((day1-day2)*(24*3600)))-totalSecond1;
							//System.out.println(totalSecond);
							hour=(int) (totalSecond/3600);
							minute=(int)(totalSecond%3600)/60;
							second=(int) (totalSecond%3600)%60;
							System.out.println("difference : "+f.format(hour)+":"+f.format(-minute)+":"+f.format(-second));
						}
					}
					
					
					else if(month2>month1)
					{	
						
						int days=dayInMonths(month1, year1);
						int day=days-day1;
						for (int i = month1+1; i < month2; i++)
						{
							days=dayInMonths(i, year1);
							day+=days;
						}
						day+=day2;
						System.out.println(f.format(day));
						long totalSecond=(totalSecond2+(day*(24*3600)))-totalSecond1;
						//System.out.println(totalSecond);
						hour=(int) (totalSecond/3600);
						minute=(int)(totalSecond%3600)/60;
						second=(int) (totalSecond%3600)%60;
						System.out.println("difference : "+f.format(hour)+":"+f.format(minute)+":"+f.format(second));
						
					}
					
					
					else if(month2<month1)
					{
						
						int month=month1-month2;
						int days=dayInMonths(month2, year1);
						int day=days-day2;
						for(int i=month2+1;i<month;i++)
						{
							days=dayInMonths(i, year1);
							day+=days;
							
						}
						day=day+day1;
						System.out.println(day);
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
					
					int days1=dayInMonths(month1, year1);
					int day=days1-day1;
				
					for(int m=month1+1;m<=12;m++)
					{
						int days=dayInMonths(m, year1);
						day+=days;
					}
					
					for(int y=year1+1;y<year2;y++)
					{
						for (int i=1;i<=12;i++) 
						{
							int days=dayInMonths(i, y);
							day+=days;
						
						}
					}

					for(int m=1;m<month2;m++)
					{
						int days=dayInMonths(m, year2);
						day+=days;
					}
					
					day=day+day2;
					System.out.println(f.format(day));
					long totalSecond=(totalSecond2+(day*(24*3600)))-totalSecond1;
					//System.out.println(totalSecond);
					hour=(int) (totalSecond/3600);
					minute=(int)(totalSecond%3600)/60;
					second=(int) (totalSecond%3600)%60;
					System.out.println("difference : "+f.format(hour)+":"+f.format(minute)+":"+f.format(second));
					
					
				}
				
				else if(year2<year1)
				{
					int day=dayInMonths(month2, year2)-day2;
					
					for(int m=month2+1;m<=12;m++)
					{
						int days=dayInMonths(m, year2);
						day+=days;
					}
					
					for (int i = year2+1; i < year1; i++) 
					{
						for (int j = 1; j <=12; j++) 
						{
							int days=dayInMonths(j, i);
							day+=days;
						}
					}
					
					for (int i = 1; i < month1; i++)
					{
						int days=dayInMonths(i, year1);
						day+=days;
					}
					
					day+=day1;
					System.out.println(day);
					
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
	
	public int days()
	{	
		
		return (hour/24);
	}
	
	public String time()
	{
		return (f.format(hour)+":"+f.format(minute)+":"+f.format(second));
	}
	
	public int totalhours()
	{
		return hour;
	}
	
	public long totalminutes()
	{
		return ((hour*60)+minute);
	}
	
	public long totalseconds()
	{
		return ((hour*3600)+(minute*60)+second);
	}
	
	
	
	
	
	
	/*public static void main(String[] args)
	{
		
		Scanner s=new Scanner(System.in);
		System.out.println("date : (dd-mm-yyyy)");
		String date=s.next();
		System.out.println("time : (hh:mm:ss)");
		String time=s.next();
		
		Time t=new Time(date, time);
		
		
	}
	*/
	
}
