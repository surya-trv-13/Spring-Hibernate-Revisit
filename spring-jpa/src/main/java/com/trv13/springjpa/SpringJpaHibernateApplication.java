package com.trv13.springjpa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.trv13.springjpa.entity.Course;
import com.trv13.springjpa.repository.CourseRepository;

@SpringBootApplication
public class SpringJpaHibernateApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	CourseRepository repository;
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringJpaHibernateApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		logger.info("Object at 1001 is {}", repository.findById(1001l));
		
		repository.deleteById(1002l); // Delete the row with primary key as 1002
		
		repository.save(new Course(1001L, "Java by Herbert Scildt"));
		
		repository.playWithEntityManager();
	}

}
