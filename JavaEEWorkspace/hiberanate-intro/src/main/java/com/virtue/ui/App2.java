package com.virtue.ui;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.virtue.entity.Song;
import com.virtue.util.HibernateUtil;

public class App2 {

	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		Song song = session.get(Song.class, 1022);
		// Song song = session.load(Song.class, 1022);
		if (song == null) {
			System.out.println("song with id 1022 is not available");
		} else {
			System.out.println(song);
		}
				
		sessionFactory.close();
	}

}
