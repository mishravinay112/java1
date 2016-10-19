package algo;
import java.util.ArrayList;
import java.util.Scanner;
public class HardProblem 
{	
	static ArrayList<Integer> empty=new ArrayList<Integer>();
	int ans=-1;
	
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int city[]=new int[2];
		city[0]=s.nextInt();
		city[1]=s.nextInt();
		String cityMap[]=new String[city[1]];
		
		for (int i = 0; i < city[1]; i++)
		{
			cityMap[i]=s.next();
		}
		
		s.close();
		
		for (int i = 0; i < city[1]; i++)
		{
			String parts[]=cityMap[i].split("#");
			checkEmpty(parts);
		}
		
		String availableSpace="";
		for (int i = 0; i <empty.size(); i++) 
		{
			System.out.print(empty.get(i));
			availableSpace+=empty.get(i);
		}
		System.out.println();
		
	/*	for (int i = 0; i < empty.size(); i++)
		{
			String part=availableSpace.substring(0, i+1);
			//System.out.println(part);
			int length=part.length();
			if(availableSpace.length()%length==0)
			{
				for (int j=length; j < empty.size(); j+=length)
				{
					if(part.equals(availableSpace.substring(j,j+length)))
					{
						System.out.println(availableSpace.substring(j,j+length));
					}
				}
			}*/
		//}
		
		
		
		
	}

	private static void checkEmpty(String[] place)
	{
		for (int i = 0; i < place.length; i++)
		{
			if(place[i].equals("o"))
			{
				empty.add(i);
			}
			
		}
	}
}
/*x#o#o#o#x#o
x#o#o#o#x#x
x#o#o#o#x#x
x#o#x#o#o#x
x#o#x#o#o#x*/