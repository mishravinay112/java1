package algo;

public class Deamon 
{
	public static void main(String[] args)
	{
		A a=new A();
		B b=new B();
		
		a.setDaemon(true);
		b.setDaemon(true);
		a.start();
		b.start();
		
		for(int i=0;i<100;i++) {
			System.out.println("inside main");
			//Thread.currentThread().setDaemon(true);
			//System.out.println("now main is deamon");
		}
	}
}

class A extends Thread
{
	
	int i;
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("a :"+i++);
			//Thread.currentThread().setDaemon(true);
		}
	}
}

class B extends Thread
{
	
	int i;
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("b : "+i++);
			//Thread.currentThread().setDaemon(true);
		}
	}
}