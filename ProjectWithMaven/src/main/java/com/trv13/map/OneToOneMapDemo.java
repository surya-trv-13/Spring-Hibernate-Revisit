package com.trv13.map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.trv13.map.OneToOne.Answer;
import com.trv13.map.OneToOne.Question;

public class OneToOneMapDemo {
	public static void main(String[] args) {
		System.out.println("Project Started...");
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		// Creating Question Object
		Question question = new Question();
		question.setId(344);
		question.setQuestion("What is Java?");

		Answer answer = new Answer();
		answer.setAnswer("Java is a programming Language");
		answer.setQuestion(question);

		// Creating Question Object
		Question question1 = new Question();
		question1.setId(123);
		question1.setQuestion("What is C++?");

		Answer answer1 = new Answer();
		answer1.setAnswer("C++ is a programming Language");
		answer1.setQuestion(question1);

		Session session = factory.openSession();
		session.beginTransaction();
		
		session.save(question);
		session.save(answer);
		session.save(question1);
		session.save(answer1);
		
//		Question q = (Question)session.load(Question.class, 12);
//		System.out.println("Q:"+q.getQuestion());
//		System.out.println("A:"+q.getAnswer().getAnswer());
//			
		session.getTransaction().commit();
		session.close();
		factory.close();
	}
}
