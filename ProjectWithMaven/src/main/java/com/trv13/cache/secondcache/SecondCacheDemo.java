/*
 * Need to discuss on this for Second level cache 
 */
package com.trv13.cache.secondcache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.trv13.map.ManyToMany.Employee;

public class SecondCacheDemo {
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure();
		SessionFactory factory = configuration.buildSessionFactory();

		Session session1 = factory.openSession();
		// First Session
		Employee employee = (Employee)session1.load(Employee.class, 121);
		System.out.println(employee);
		
		session1.close();
		
		Session session2 = factory.openSession();
		// Second Session
		Employee employee2 = (Employee)session2.load(Employee.class, 121);
		System.out.println(employee2);
		
		session2.close();
		
		factory.close();
	}
}
