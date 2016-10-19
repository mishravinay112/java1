

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import attendies.AttendiesDto;
import company.CompanyDto;
import events.EventDto;
import location.LocationDto;
import manager.ManagerDto;
import speaker.SpeakerDto;

public class Create_insert {

	public static void main(String[] args) {

		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.configure("eventManagement.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		Transaction tx = session.beginTransaction();

		CompanyDto c = new CompanyDto();

		c.setCompany_id(203);
		c.setCompany_name("IBM");
		
		LocationDto l=new LocationDto();
		l.setLocation_id(52);
		l.setLocation_name("SVITS");
		
		ManagerDto m=new ManagerDto();
		m.setManager_id(13);
		m.setManager_name("Vinay");
		
		AttendiesDto at1=new AttendiesDto();
		at1.setAttendies_id(505);
		at1.setAttendies_name("Rahul");
		
		AttendiesDto at2=new AttendiesDto();
		at2.setAttendies_id(506);
		at2.setAttendies_name("Aarti");
		
		SpeakerDto sp1=new SpeakerDto();
		sp1.setSpeaker_id(15);
		sp1.setSpeaker_name("Sapna");
		
		
		SpeakerDto sp2=new SpeakerDto();
		sp2.setSpeaker_id(16);
		sp2.setSpeaker_name("Arjun");
		
		
		EventDto e1 = new EventDto();

		e1.setEvent_id(5);
		e1.setEvent_name("hibernate");
		e1.setL(l);
		e1.setM(m);


		EventDto e2 = new EventDto();

		e2.setEvent_id(6);
		e2.setEvent_name("spring");
		e2.setL(l);
		e2.setM(m);
	
		Set<EventDto> s = new HashSet<EventDto>();

		s.add(e1);
		s.add(e2);
		c.setEvent(s);
		
		
		at1.setEvt(s);
		at2.setEvt(s);
		
		sp1.setEvent(s);
		sp2.setEvent(s);
		
		
		session.save(c);
		session.save(at1);
		session.save(at2);
		session.save(sp1);
		session.save(sp2);
		tx.commit();
		session.close();
		System.out.println("One To Many Bi-Directional is Done..!!");
		factory.close();

	}

}
