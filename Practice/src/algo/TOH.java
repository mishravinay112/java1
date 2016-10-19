package algo;
import java.util.Scanner;
public class TOH
{	
	static int moves=0;
	public static void toh(int m,char a,char b,char c )
	{
		if(m>0)
		{
			toh(m-1,a,c,b);
			System.out.println("Disk move from "+a+" to "+b);
			++moves;
			toh(m-1,b,a,c);
		}
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		System.out.print("enter the total disks: ");
		int m=s.nextInt();
		toh(m,'A','B','C');
		System.out.println(moves);
	}
}
