package test;

import java.util.ArrayList;
import java.util.Scanner;

class Main
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in); 
		/*for(;;)
		{int year=s.nextInt();
		if(year%4==0)
		{
			System.out.println(year+" is leap year");
		}
		else
		{
			System.out.println(year+" is not leap");
		}
		}*/
		String check="    {    vinay   {    {";
		System.out.println(check);
		if(check.contains("{"))
		{
			check=check.replaceFirst("\\{", "");
		}
		System.out.println(check);
		ArrayList<Integer> a=new ArrayList<Integer>();
		
		a.add(10);
		int value=a.remove(a.size()-1);
		System.out.println(value);
	}
}