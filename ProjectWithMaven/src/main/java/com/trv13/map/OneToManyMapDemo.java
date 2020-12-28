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
		question.setQuestion("What is Java?");
		question.setQuestionId(12);
		
		AnswerOTM answer = new AnswerOTM();
		answer.setAnswerId(123);
		answer.setAnswer("Java is a programming Language");
		
		AnswerOTM answer1 = new AnswerOTM();
		answer1.setAnswerId(123);
		answer1.setAnswer("Java has many Frameworks");
		
		AnswerOTM answer2 = new AnswerOTM();
		answer2.setAnswerId(123);
		answer2.setAnswer("Java helps to build application");
		
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
		
		session.save(answer);
		session.save(answer2);
		session.save(answer1);
			
		session.getTransaction().commit();
		session.close();
		factory.close();
	}
}
