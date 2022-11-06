package model;


import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;



public class Userdao {
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
 
 
 public String insertDetail(User u ){
	 
 	getConnect();
 	session.save(u);
 	tx.commit();
 	System.out.println("data inserted");
 	endConnect();
		return "registred Sucessfully";
 	
 }
 
 public boolean check(String name, String upass){
	            getConnect();
	            
	            Query q = session.createQuery("from User u where u.name=:q and u.upass=:p");
	            q.setParameter("q", name);
	            q.setParameter("p", upass);
	           
	          List<User> ls= q.list();
	          for(User u:ls)
	          {
	        	  if(name.equals(u.getName())&& upass.equals(u.getUpass()))
	        	  {
	        		  return true;
	        	  }
	          }
	           endConnect();
	           return false;
	          
	           
	           
	  
 }
	
 public  List<User> retrivedata()
 {
	 getConnect();
	 Query q=session.createQuery("from User");
	 List<User>ls =q.list(); 
		endConnect();
		return ls;
	
	 
 }
 private void endConnect()
		{
			session.close();
			factory.close();
		}
}
