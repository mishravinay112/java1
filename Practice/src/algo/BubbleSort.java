package algo;

public class BubbleSort 
{
	public static void main(String[] args) 
	{
		int a[]={15,1,22,2,1,5,11};
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i+1; j < a.length; j++)
			{	
				System.out.println(a[i]);
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		for (int i = 0; i < a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
		
	}
}
