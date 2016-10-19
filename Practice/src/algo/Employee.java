package algo;
import java.util.Arrays;
import java.util.Scanner;
 class Employeeji implements Comparable<Employeeji>
{
	int id;
	String name;
	String add;
	int salary;
	int base;
	public Employeeji(int base) 
	{
		this.base=base;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	public int compareTo(Employeeji e)
	{	
		switch (base) 
		{
		case 1 :return -(e.id-this.id);
				
		case 2: return -(e.name.hashCode()-this.name.hashCode());
		
		case 3: return -(e.salary-this.salary);

		
		}
		return 0 ;
	}
	
}
public class Employee
{
	public static void main(String[] args)
	{	
		Employeeji[] e=new Employeeji[2];
		System.out.println("which base you want to sort-\n1.id\n2.name\n3.salary");
		int base=new Scanner(System.in).nextInt();
		e[0]=new Employeeji(base);
		e[0].setId(007);
		e[0].setName("James");
		e[0].setAdd("10 down street");
		e[0].setSalary(1000000);
		
		
		 e[1]=new Employeeji(base);
		e[1].setId(420);
		e[1].setName("Ethan");
		e[1].setAdd("MI-7");
		e[1].setSalary(500000);
		
		Arrays.sort(e);
		for (Employeeji e1 : e) 
		{
			System.out.println(e1.id+" "+e1.name+" "+e1.salary+" "+e1.add);
		}
		
		
	}
}

