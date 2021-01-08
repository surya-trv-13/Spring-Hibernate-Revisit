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
		Query query1 = session1.createQuery("FROM Employee where employeeId=121");
		query1.setCacheable(true);
		query1.setCacheRegion("emp");
		Employee employee = (Employee)query1.uniqueResult();
		System.out.println(employee);
		
		session1.close();
		
		Session session2 = factory.openSession();
		// Second Session
		Query query2 = session2.createQuery("FROM Employee where employeeId=121");
		query2.setCacheable(true);
		query2.setCacheRegion("emp");
		employee = (Employee)query2.uniqueResult();
		System.out.println(employee);
		
		session2.close();
		
		factory.close();
	}
}
