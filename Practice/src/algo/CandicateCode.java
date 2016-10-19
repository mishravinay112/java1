package algo;
import java.util.Scanner;
public class CandicateCode 
{
	public static void main(String args[])
	{	
		
		int ans;
		int finalAnswer;
		Scanner s=new Scanner(System.in);
		System.out.println("how many levels : ");
		int input=s.nextInt();
		if(true)
		{
			ans=(input-1)*(input)/2;
			finalAnswer=ans;
		}  
		if(input%2!=0)
		{
			
			 ans=ConvertingTheCandiesShape(input);
			
		}
		 if(ans<finalAnswer)
				System.out.println(ans);
				 else
					 System.out.println(finalAnswer);
		
	}

	public static int ConvertingTheCandiesShape(int input1) 
	{
		int p=-1;
		for(int i=1;i<=input1;i=i+2)
		{
			p++;
		}
		
		int ans=p*p+p;
		return ans;
	}
	
}
