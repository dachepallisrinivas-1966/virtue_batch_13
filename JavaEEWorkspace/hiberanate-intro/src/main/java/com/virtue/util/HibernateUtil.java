package com.virtue.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.virtue.entity.Job;
import com.virtue.entity.Song;

public class HibernateUtil {
	private static SessionFactory sessionFactory = null;

	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			Configuration configuration = new Configuration();
			configuration.configure("hibernate.cfg.xml");
			configuration.addAnnotatedClass(Song.class);
			configuration.addAnnotatedClass(Job.class);

			sessionFactory = configuration.buildSessionFactory();
		}

		return sessionFactory;
	}

}
