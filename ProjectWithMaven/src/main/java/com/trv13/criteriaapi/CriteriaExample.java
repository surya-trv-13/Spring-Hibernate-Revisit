package com.trv13.criteriaapi;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.trv13.map.ManyToMany.Employee;

public class CriteriaExample {
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession(); 
		
		Criteria criteria = session.createCriteria(Employee.class);
//		criteria.add(Restrictions.eq("id", 121)); // Only with data with id = 121
		criteria.add(Restrictions.eq("project.projectName", "Autonomous Cloud"));
		List<Employee> list = criteria.list();
		
		for(Employee e : list) {
			System.out.println(e);
		}
		
		session.close();
		factory.close();
	}
}
