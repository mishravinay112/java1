package algo;

public class InsertionSort {
	
	
	public static void main(String[] args) 
	{
		
		int a[]={2,4,8,1,3,0};
		for (int i = 0; i < a.length; i++) 
		{
			int compare=a[i];
			for (int j = i-1; j >=0 && compare<a[j]; j--) 
			{
				a[j+1]=a[j];
				a[j]=compare;
			}
			
		}
		
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}

	
}


