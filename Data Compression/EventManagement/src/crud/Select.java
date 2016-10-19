package crud;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import company.CompanyDto;
import events.EventDto;
import location.LocationDto;
import manager.ManagerDto;

public class Select {

	public static void main(String[] args) {
		
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.configure("resource/com_event.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		Transaction tx = session.beginTransaction();		

		//only for one parant object get only one child
		
		Object o = session.get(EventDto.class, new Integer(1));
		EventDto e = (EventDto)o;

		System.out.println(e.getEvent_name());
		
		LocationDto l=e.getL();
		System.out.println(l.getLocation_name());
		
		
		
		//for all child object
		
		 Query qry=session.createQuery("from EventDto c");
		 
		    List l1=qry.list();
		    Iterator it = l1.iterator();
		    while(it.hasNext())
		    {
		    	Object o1 = it.next();
		    	EventDto c = (EventDto)o1;
		    	System.out.println(c.getEvent_name());
		    	/*LocationDto v=c.getL();
		    	System.out.println(v.getLocation_name());*/
		    	
		    	CompanyDto c1=c.getC();
		    	
		    	System.out.println(c1.getCompany_name());
		    }
		tx.commit();
	    session.close();
	    System.out.println("many to one select is done..!!");
	    factory.close();       


	}

}
