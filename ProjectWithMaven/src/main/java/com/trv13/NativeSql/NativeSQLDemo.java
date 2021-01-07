package com.trv13.NativeSql;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

public class NativeSQLDemo {
	public static void main(String[] args) {
		Configuration config = new Configuration();
		config.configure();
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		
		String query = "select * from emp where eid < 125";
		NativeQuery np = session.createSQLQuery(query);
		List<Object[]> list = np.getResultList();
		
		for(Object[] emp: list) {
			System.out.println(emp[0]+"|"+emp[1]+"|"+emp[2]);
		}
		session.close();
		factory.close();
	}
}
