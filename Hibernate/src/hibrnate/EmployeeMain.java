package hibrnate;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class EmployeeMain 
{
	public static void main(String[] args)
	{
		Configuration con=new Configuration();
		con.configure("EmployeeDTO.cfg.xml");
		
		SessionFactory factory=con.buildSessionFactory(); 
		Session session=factory.openSession();
		
		Scanner s=new Scanner(System.in);
		List<EmployeeDTO> list=new ArrayList<EmployeeDTO>();
		for (int i = 0; i < 25; i++) 
		{
			EmployeeDTO e=new EmployeeDTO();
			System.out.print("id "+(i+1)+" : ");
			e.setId(s.nextInt());
			System.out.print("name "+(i+1)+" : ");
			e.setName(s.next());
			System.out.print("salary "+(i+1)+" : ");
			e.setSalary(s.nextInt());
			System.out.print("dept_id "+(i+1)+" : ");
			e.setDept_id(s.nextInt());
			System.out.print("loc_id "+(i+1)+" : ");
			e.setLoc_id(s.nextInt());
			list.add(e);
		}
		
		session.save(list);
		Transaction tx=session.beginTransaction();
		tx.commit();
		
		
	}
}
