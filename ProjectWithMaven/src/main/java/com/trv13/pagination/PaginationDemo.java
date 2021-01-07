package com.trv13.pagination;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.trv13.map.ManyToMany.Employee;

public class PaginationDemo {
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure();
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		
		Query<Employee> query = session.createQuery("from Employee");
		
		query.setFirstResult(2); // This will set the starting index of the print
		query.setMaxResults(5); // This will set the no. of data to fetch after starting index.
		
		List<Employee> list = query.getResultList();
		for(Employee emp: list) {
			System.out.println(emp.getEmployeeId()+" : "+emp.getEmployeeName()+" : "+emp.getDepartment());
		}
		
		session.close();
		factory.close();
	}
}
