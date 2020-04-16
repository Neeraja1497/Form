package com.nttdata.oneToMany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration config=new Configuration();
		config.configure("HibernateConfig.xml");
		
		SessionFactory sf=config.buildSessionFactory();
		Session sess=sf.openSession();
		
		Category categ=new Category();
		categ.setCategId(2);
		categ.setCategName("bbb");
		
		Transaction tx=sess.beginTransaction();
		sess.save(categ);
		tx.commit();
		sess.close();
		System.out.println("Many to One mapping done..");
		sf.close();

	}

}
