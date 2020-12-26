package com.trv13.ProjectWithMaven;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.trv13.ProjectWithMaven.Address.Address;
import com.trv13.ProjectWithMaven.Student.Student;

public class FetchData {
	public static void main(String[] args) {
		System.out.println("Project Started...");
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml"); 
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();
		
		Student student = (Student)session.get(Student.class, 50); // using get method
		System.out.println("Before printing data");
		System.out.println(student);
		System.out.println("After printing data");
		
		System.out.println("-------------------");
		
		Address address = (Address)session.load(Address.class, 3); // using load method
		System.out.println("Before printing data");
		System.out.println(address);	// Lazy Initialization
		System.out.println("After printing data");
		
		session.getTransaction().commit();
		session.close();
		factory.close();
	}
}
