package com.trv13.map;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.trv13.map.ManyToOne.AnswerOTM;
import com.trv13.map.ManyToOne.QuestionOTM;

public class OneToManyMapDemo {
	public static void main(String[] args) {
		System.out.println("Project Started...");
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		QuestionOTM question = new QuestionOTM();
		question.setQuestion("What is Hibernate?");
		question.setQuestionId(1223);
		
		AnswerOTM answer = new AnswerOTM();
		answer.setAnswerId(125);
		answer.setAnswer("Hibernate is a Framework of Java");
		
		AnswerOTM answer1 = new AnswerOTM();
		answer1.setAnswerId(1298);
		answer1.setAnswer("Save data in Database");
		
		AnswerOTM answer2 = new AnswerOTM();
		answer2.setAnswerId(1234);
		answer2.setAnswer("Persistence in nature.");
		
		//For bi-directional
		answer.setQuestion(question);
		answer1.setQuestion(question);
		answer2.setQuestion(question);
		
		List<AnswerOTM> list = new ArrayList<AnswerOTM>();
		list.add(answer);
		list.add(answer1);
		list.add(answer2);
		
		question.setAnswers(list);
		
		Session session = factory.openSession();
		session.beginTransaction();
		
		session.save(question);
		
//		session.save(answer);
//		session.save(answer2);
//		session.save(answer1);
//		
		//Get Value
//		QuestionOTM q = (QuestionOTM)session.get(QuestionOTM.class, 1);
//		System.out.println(q.getQuestion());
//		
//		for(AnswerOTM a :q.getAnswers()) {
//			System.out.println(a.getAnswer());
//		}

		session.getTransaction().commit();
		session.close();
		factory.close();
	}
}
