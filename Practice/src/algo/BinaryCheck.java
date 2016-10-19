package algo;

import java.util.Scanner;



public class BinaryCheck 
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String input1=s.next();
		int input2=s.nextInt();
		int input3=s.nextInt();
		System.out.println(input1.charAt(1));
		System.out.println(solution(input2,input1,input3));
		
	}
	
	static String solution(int position,String input1,int stop)
	{	
		String newString="";
		for (int i = position-1; i < input1.length(); i=i*2) 
		{	
			//newString="";
			int current=input1.charAt(i)-'0';
			if(current==0)
			{
				current=1;
			}
			else
			{
				current=0;
			}
			for (int j = 0; j < input1.length(); j++) 
			{
				if(j==i)
				{
					newString+=current;
				}
				else
				{
					newString+=input1.charAt(j);
				}
			}
			System.out.println(newString);
			//solution();
			
		}
		return newString;
	}
	
}
