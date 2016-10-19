package day;

//import java.util.Scanner;

public class DoWork 
{
	String date;
	String time;
	Time t;
	
	DateAndTime today=new DateAndTime();
	
	public DoWork(String date, String time) 
	{
		this.date=date;
		this.time=time;
		t=new Time(date,time);
	}
	
	public int days()
	{
		return t.days();
	}
	
	public String time()
	{
		return t.time();
	}
	

	public int totalhours()
	{
		return t.totalhours();
	}
	
	public long totalminutes()
	{
		return t.totalminutes();
	}
	
	public long totalseconds()
	{
		return (t.totalseconds());
	}
	
	
	public String day()
	{
		String part[]=date.split("-");
		int dd=Integer.parseInt(part[2]);
		int mm=Integer.parseInt(part[1]);
		int yy=Integer.parseInt(part[0]);
		
		int j=calculate(dd,mm,yy);
		switch(j)
		{
		case 1:return "Sunday";
		case 2:return "Monday";
		case 3:return "Tuesday";
		case 4:return "Wednesday";
		case 5:return "Thusday";
		case 6:return "Friday";
		case 0:return "Saturday";
		}
		return "loading...";
	}
	
	
	private int calculate(int d,int m,int y) 
	{	
		int s=0;
		
		for(int i=1;i<=9999;i++)
		{
			for(int j=1;j<=12;j++)
			{	
				int n;
				switch(j)
				{
					case 1:  n=31;
							for(int k=1;k<=n;k++)
							{	
								s++;
								if(s==7){s=0;}
								if(k==d&&j==m&&i==y)
								{
									return s;
								}
								
								
							}
						break;
				case 2:
					 	if(i%4==0)
					 	{n=29;}
					 	else
					 	{n=28;}
						for(int k=1;k<=n;k++)
						{	
							s++;
							if(s==7){s=0;}
							if(k==d&&j==m&&i==y)
							{
								return s;
							}
							
							
						}
						break;
				case 3:
					 n=31;
						for(int k=1;k<=n;k++)
						{	
							s++;
							if(s==7){s=0;}
							if(k==d&&j==m&&i==y)
							{
								return s;
							}
							
							
						}
						break;
				case 4:
					 n=30;
						for(int k=1;k<=n;k++)
						{
							s++;
							if(s==7){s=0;}
							if(k==d&&j==m&&i==y)
							{
								return s;
							}
							
							
						}
						break;
				case 5:
					 n=31;
						for(int k=1;k<=n;k++)
						{	
							s++;
							if(s==7){s=0;}
							if(k==d&&j==m&&i==y)
							{
								return s;
							}
							
							
						}
						break;
				case 6:
					 n=30;
						for(int k=1;k<=n;k++)
						{	
							s++;
							if(s==7){s=0;}
							if(k==d&&j==m&&i==y)
							{
								return s;
							}
							
							
						}
						break;
				case 7:
					 n=31;
						for(int k=1;k<=n;k++)
						{
							s++;
							if(s==7){s=0;}
							if(k==d&&j==m&&i==y)
							{
								return s;
								
							}
							
							
						}
						break;
				case 8:
					 n=31;
						for(int k=1;k<=n;k++)
						{
							s++;
							if(s==7){s=0;}
							if(k==d&&j==m&&i==y)
							{
								return s;
							}
							
							
						}
						break;
				case 9:
					 n=30;
						for(int k=1;k<=n;k++)
						{
							s++;
							if(s==7){s=0;}
							if(k==d&&j==m&&i==y)
							{
								return s;
							}
							
							
						}
						break;
				case 10:
					 n=31;
						for(int k=1;k<=n;k++)
						{	
							s++;
							if(s==7){s=0;}
							if(k==d&&j==m&&i==y)
							{
								return s;
							}
							
							
						}
						break;
				case 11:
					 n=30;
						for(int k=1;k<=n;k++)
						{
							s++;
							if(s==7){s=0;}
							if(k==d&&j==m&&i==y)
							{
								return s;
							}
							
							
						}
						break;
				case 12:
					 n=31;
						for(int k=1;k<=n;k++)
						{	
							s++;
							if(s==7){s=0;}
							if(k==d&&j==m&&i==y)
							{
								return s;
							}
						
							
						}
						break;
				}
			}
			
		}
		return s;
	}

	/*public static void main(String[] args)
	{
		
		Scanner s=new Scanner(System.in);
		System.out.println("date : (dd-mm-yyyy)");
		String date=s.next();
		System.out.println("time : (hh:mm:ss)");
		String time=s.next();
		
		DoWork d=new DoWork(date, time);
		System.out.println(d.day());
		
		
	}*/
}
	

