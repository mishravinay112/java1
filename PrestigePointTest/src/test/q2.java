package test;

public class q2 
{
	int a=10;
	public static void main(String[] args) {
		q2 q=new q2();
		q.dostuff(3);
		
	}
	private void dostuff(int i) {
		i+=1;
		System.out.println(++i);
		
	}
}
