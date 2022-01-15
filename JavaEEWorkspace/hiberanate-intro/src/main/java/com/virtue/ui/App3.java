package com.virtue.ui;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.virtue.entity.Song;
import com.virtue.util.HibernateUtil;

public class App3 {

	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		Song song = session.get(Song.class, 102);
		if (song == null) {
			System.out.println("song with id 102 is not available");
		} else {
			Transaction txn = session.beginTransaction();
			session.delete(song);
			txn.commit();
		}
				
		sessionFactory.close();
	}

}
