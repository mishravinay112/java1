package test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class DateCompare 
{
	
		public static void main(String args[]) 
		 {  
			DateFormat f=new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
		  Date today=new Date();
		  String today1=f.format(today);
		  Scanner s=new Scanner(System.in);
		  int day,month,year;
		  System.out.println("day : "+(day=s.nextInt()));
		  System.out.println("month : "+(month=s.nextInt()));
		  System.out.println("year : "+(year=s.nextInt()));
		  Date myDate=new Date(year,month,day);
		  String other=f.format(myDate);
		  System.out.println("My Date is "+myDate);    
		  System.out.println("Today Date is "+today1);
		 }
		
}
