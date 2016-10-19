package crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import attendies.AttendiesDto;




public class Update {

	public static void main(String[] args) {
		
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.configure("resource/com_event.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		Transaction tx = session.beginTransaction();

	AttendiesDto c2 = (AttendiesDto) session.get(AttendiesDto.class, 501);
		 c2.setAttendies_name("naveen sir");
		 session.update(c2);
		 tx.commit();
		 System.out.println("Object Updated successfully.....!!");
		session.close();
		factory.close(); 


	}

}
