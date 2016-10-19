package algo;




public class ArrayIteration 
{
	public static void main(String[] args) 
	{
		Object a[]=new Object[5];
		a[1]=1;
		a[2]="hello";
		a[3]="vinay";
		a[0]=0;
		a[4]=new ArrayIteration();
		System.out.print("[");
		for (int i = 0; i < a.length; i++)
		{
			System.out.print(a[i]+",");
		}
		System.out.print("]");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "nitin ";
	}
}
