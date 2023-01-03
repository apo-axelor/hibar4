package com.axelor.apps.main;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
	import org.hibernate.boot.Metadata;
	import org.hibernate.boot.MetadataSources;
	import org.hibernate.boot.registry.StandardServiceRegistry;
	import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
	import org.hibernate.query.Query;

	import com.axelor.apps.Song;

	public class App {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
	        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
	        
	        SessionFactory factory = meta.getSessionFactoryBuilder().build();  
	        Session session = factory.openSession(); 
	        Transaction t = session.beginTransaction(); 
	                 
		        
//		        Song s1 = new Song();
//		        s1.setName("test");
//		        s1.setId(4);
//			   session.save(s1);  
//			    t.commit();  
//			    System.out.println("successfully saved");    
//			    factory.close();  
//			    session.close();
	      //int id = 33;
	    	//Song s1 = session.get(Song.class, new Integer(id));
	    		//session.delete(s1);
	    		//session.getTransaction().commit();
	    		//System.out.println("record deleted.....");
	    		int id =33;
	    	//Song s1 = session.get(Song.class,new Integer(id));
	    		//s1.setName("aneri");	
	    		//session.saveOrUpdate(s1);
	    //session.getTransaction().commit();
	    	//	System.out.println("Record updated succesfully..."); 
	    	  
	                 
			Query query = session.createQuery("FROM Song");
			List<Song> e1 = query.list();
			System.out.println("-------------Records are -------------");
			for(Song empObj : e1)
			{
				System.out.print("\n Song Id  " + empObj.getId() + " \n Song Name : " + empObj.getName() + "\n");
			}
			System.out.print("");
			    
			    
			    
	         

		}

	}
	


