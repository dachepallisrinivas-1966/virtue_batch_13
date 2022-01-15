package com.virtue.ui;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.virtue.entity.Song;
import com.virtue.util.HibernateUtil;

public class App1 {

	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		Song s1 = new Song();

		s1.setSongName("cde");
		s1.setArtist("333");
		
		Session session = sessionFactory.openSession();
		
		Transaction txn = session.getTransaction();
		
		txn.begin();
		
		session.save(s1);
		
		txn.commit();
				
		sessionFactory.close();
	}

}
