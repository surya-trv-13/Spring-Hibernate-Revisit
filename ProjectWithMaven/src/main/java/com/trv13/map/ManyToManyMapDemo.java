package com.trv13.map;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ManyToManyMapDemo {
	public static void main(String[] args) {
		System.out.println("Project Started...");
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		factory.close();
	}
}
