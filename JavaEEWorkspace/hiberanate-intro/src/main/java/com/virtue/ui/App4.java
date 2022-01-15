package com.virtue.ui;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.virtue.entity.Job;
import com.virtue.util.HibernateUtil;

public class App4 {

	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		// method-1:
    	 Query<Job> query = session.createQuery("SELECT j FROM Job j", Job.class);
    	 List<Job> list = query.list();
    	
    	 for(Job job : list) {
    		System.out.println(job);
    	 }
    	 
    	 System.out.println("-----------------------------------------------------------------");
    	 
    	// method-2:
    	 TypedQuery<Job> query2 = session.createQuery("SELECT j FROM Job j", Job.class);
    	 List<Job> list2 = query.getResultList();
    	
    	 for(Job job : list2) {
    		System.out.println(job);
    	 }
				
		sessionFactory.close();
	}

}
