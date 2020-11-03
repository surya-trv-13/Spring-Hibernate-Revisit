package com.example.trv13;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.trv13.entity.Person;
import com.example.trv13.jdbc.PersonJdbcDAO;
import com.example.trv13.jpa.PersonJpaRepository;

@SpringBootApplication
public class JpaDemoApplication implements CommandLineRunner{

	private Logger logger = LoggerFactory.getLogger(this.getClass());
			
	@Autowired
	PersonJpaRepository repository; 
	
	public static void main(String[] args) {
		SpringApplication.run(JpaDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("User is = {}",repository.findById(10001));
//		
		logger.info("All datas are = {}",repository.findAll());
//		
		repository.deleteById(10002); // Deleting row 10002
		logger.info("Inserting new row for ID 10004 {}", repository.insert(new Person("Shreya", 22 , new Date())) );
		logger.info("Updating existing row for ID 10003", repository.update(new Person(10003, "Suman", 41 , new Date())) );
	}
}
