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

@SpringBootApplication
public class SpringbootApplication implements CommandLineRunner{

	private Logger logger = LoggerFactory.getLogger(this.getClass());
			
	@Autowired
	PersonJdbcDAO personJdbcDao; 
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("All datas are = {}",personJdbcDao.findAll());
		logger.info("User is = {}",personJdbcDao.findById(10001));
		logger.info("User deleted is 10002 rows deleted = {}",personJdbcDao.deleteById(10002));
		logger.info("Inserting new row for ID 10004", personJdbcDao.insert(new Person(10004, "Shreya", 22 , new Date())) );
		logger.info("Updating existing row for ID 10003", personJdbcDao.update(new Person(10003, "Saptarshi", 41 , new Date())) );
	}
}
