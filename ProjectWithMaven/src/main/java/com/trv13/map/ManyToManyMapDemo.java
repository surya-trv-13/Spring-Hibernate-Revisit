package com.trv13.map;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.trv13.map.ManyToMany.Employee;
import com.trv13.map.ManyToMany.Project;

public class ManyToManyMapDemo {
	public static void main(String[] args) {
		System.out.println("Project Started...");
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		
		e1.setEmployeeId(121);
		e1.setEmployeeName("Surya");
		e1.setDepartment("Autonomous");
		
		e2.setEmployeeId(122);
		e2.setEmployeeName("Saptarshi");
		e2.setDepartment("Analytics");
		
		Project p1 = new Project();
		Project p2 = new Project();
		
		p1.setProjectId(123);
		p1.setProjectName("Autonomous Cloud");
		p1.setEstimateDays(100);
		
		p2.setProjectId(124);
		p2.setProjectName("Analytics Cloud");
		p2.setEstimateDays(150);
		
		List<Project> pList = new ArrayList<Project>();
		List<Employee> eList = new ArrayList<Employee>();
		
		pList.add(p1);
		pList.add(p2);
		
		eList.add(e1);
		eList.add(e2);
		
		p1.setEmployee(eList);
		p2.setEmployee(eList);
		
		e1.setProject(pList);
		e2.setProject(pList);
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction(); 
		
		session.save(e1);
		session.save(e2);
		
//		session.save(p1);
//		session.save(p2);
//		
		tx.commit();
		session.close();
		factory.close();
	}
}
