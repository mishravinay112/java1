package hibrnate;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class FirstDTOmain
{
	public static void main(String[] args) 
	{
		
		    //creating configuration object  
		    Configuration cfg=new Configuration();  
		    cfg.configure("FirstDTO.cfg.xml");//populates the data of the configuration file  
		      
		    //creating seession factory object  
		    SessionFactory factory=cfg.buildSessionFactory();  
		      
		    //creating session object  
		    Session session=factory.openSession();
		    
		    Criteria c=session.createCriteria(FirstDTO.class);
		    c.add(Restrictions.gt("balance","50000"));
		    c.add(Restrictions.gt("id",119));
		    //Query q=session.createQuery("select balance,count(*) as total from FirstDTO group by(balance)");
		    List<FirstDTO> l=c.list();
		    
		    for(FirstDTO o:l)
		    {
		    	/*Object[] o1=(Object[])o;
		    	System.out.println(o1[0]+" "+o1[1]);*/
		    	System.out.println(o.getBalance()+" "+o.getId());
		    }
		  /* System.out.println((Long)l.get(0));*/
		    //creating transaction object  
		  /*  Transaction t=session.beginTransaction();  
		          
		    FirstDTO e1=new  FirstDTO();  
		    e1.setId(131);  
		    e1.setName("sonoo");  
		    e1.setBalance("50000");  
		   
		      
		    session.persist(e1);//persisting the object  
		    
		    t.commit();//transaction is commited  
*/		    session.close();  
		      
		    System.out.println("successfully saved");  
		      
		}  
		
	}

