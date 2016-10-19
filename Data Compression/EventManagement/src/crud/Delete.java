package crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import events.EventDto;

public class Delete {

	public static void main(String[] args) {
		
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.configure("resource/com_event.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		Transaction tx = session.beginTransaction();

		
		Object o = session.get(EventDto.class, new Integer(6));
		EventDto c = (EventDto)o;		
 
		    
		   session.delete(c);
		    tx.commit();
 
		    session.close();
		    System.out.println("many to one delete done..!!");

	}

}
