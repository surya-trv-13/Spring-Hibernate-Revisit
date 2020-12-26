package com.trv13.ProjectWithMaven;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.trv13.ProjectWithMaven.Embedded.Person;
import com.trv13.ProjectWithMaven.Embedded.Profession;

public class EmbedDemo {
	public static void main(String[] args) {
		System.out.println("Project Started...");
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml"); 
		SessionFactory factory = cfg.buildSessionFactory();
		Person person = new Person();
		person.setIsAlive(true);
		person.setName("Suryanarayan Rath");
		person.setPersonId(1);
		person.setPhone("8895591782");
		
		Profession profession = new Profession();
		profession.setEmployeeId("11296");
		profession.setJoinDate(new Date());
		profession.setType("Desk Job");
		profession.setIsWorking(true);
		person.setProfession(profession);
		
		Session session = factory.openSession();
		session.beginTransaction();
		
		session.save(person);
		
		session.close();
		factory.close();
	}
}
