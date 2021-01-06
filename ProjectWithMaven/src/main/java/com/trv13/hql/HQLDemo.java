package com.trv13.hql;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.trv13.map.OneToOne.Question;

public class HQLDemo {
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory factory = configuration.buildSessionFactory();

		Session session = factory.openSession();
		// HQL
		String query = "from Question"; // Select to get all the datas
		String query1 = "from Question where id=344"; // Where clause
		String query2 = "from Question where id=:x"; // Dynamic parameter in HQL

		Query q = session.createQuery(query2);
		q.setParameter("x", 123);
		
		List<Question> list = q.list();
		for (Question question : list) {
			System.out.println(
					question.getId() + " : " + question.getQuestion() + " : " + question.getAnswer().getAnswer());
		}
		
		// q.uniqueResult() :- This is the unique result from the relation 
		
		Transaction transaction = session.beginTransaction();
		
		// Delete HQL
		Query q2 = session.createQuery("delete from Question where id=:id");
		q2.setParameter("id", 344);
		int rows = q2.executeUpdate();
		System.out.println("Deleted :"+ rows);
		
		transaction.commit();
		session.close();
		factory.close();
	}
}
