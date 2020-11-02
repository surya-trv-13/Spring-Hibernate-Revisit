package com.example.trv13.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.trv13.entity.Person;


@Repository
@Transactional
public class PersonJpaRepository {
	
	//Connection to Database
	@PersistenceContext
	EntityManager entityManager;
	
	// FIND /id
	public Person findById(int id){
		return entityManager.find(Person.class, id);
	}
}
