package algo;

import java.util.Date;

public class TimeDifference 
{
	public static void main(String[] args) throws InterruptedException 
	{
		long time1=System.currentTimeMillis();
		System.out.println(time1);
		Thread.sleep(5000);
		long time2=System.currentTimeMillis();
		System.out.println(time2);
		long work=(time2-time1)/1000;
		System.out.println(work);
		int hours=(int) (work/3600);
		int minute=(int) ((work%3600)/60);
		int second=(int) ((work%3600)%60);
		System.out.println("hour : "+hours);
		System.out.println("minutes : "+minute);
		System.out.println("seconds :"+second);
		
		
	}
}
