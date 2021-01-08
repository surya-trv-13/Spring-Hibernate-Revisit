package com.trv13.cache.firstcache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.trv13.map.ManyToMany.Employee;

public class FirstCacheDemo {
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory factory = configuration.buildSessionFactory(); // Session Factory (Thread safe) 
		Session session = factory.openSession();
		// By Default configured - First level cache
		
		
		Employee employee = session.load(Employee.class, 121);
		System.out.println(employee);
		
		System.out.println("Work done so much...");
		
		Employee employee2 = session.load(Employee.class, 121);
		System.out.println(employee2);
		
		
		session.close();
		factory.close();
	}
}
