package model;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Quotationdao {
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


public String insertDetail(Quotation q){
	 
	getConnect();
	session.save(q);
	tx.commit();
	System.out.println("data inserted");
	endConnect();
		return "registred Sucessfully";
	
}
public  List<Quotation> retrivedata()
{
	 getConnect();
	 Query q=session.createQuery("from Quotation");
	 List<Quotation>ls =q.list(); 
		endConnect();
		return ls;
	
	 
}
private void endConnect()
		{
			session.close();
			factory.close();
		}
}


