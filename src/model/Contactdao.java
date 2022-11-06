package model;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Contactdao {
	 Configuration cfg;
	   SessionFactory factory;
	   Session session;
	   Transaction tx;
	   
private void getConnect(){
	 cfg = new Configuration();
	  cfg.configure("hibernate.cfg.xml");
	  factory = cfg.buildSessionFactory();
	  session=factory.openSession();
	  tx= session.beginTransaction();
	  	  
}
public String insertDetail(Contact c){
	 
 	getConnect();
 	session.save(c);
 	tx.commit();
 	System.out.println("data inserted");
 	endConnect();
		return "registred Sucessfully";
 	
 }

public  List<Contact> retrivedata()
{
	 getConnect();
	 Query q=session.createQuery("from Contact");
	 List<Contact>li =q.list(); 
		endConnect();
		return li;
	
	 
}
private void endConnect()
{
	session.close();
	factory.close();
}
}


