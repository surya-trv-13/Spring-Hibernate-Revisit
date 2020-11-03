package com.example.trv13.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
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
	
	
	// Next two methods are equal
	public Person update(Person person) {
		return entityManager.merge(person);
	}
	
	public Person insert(Person person) {
		return entityManager.merge(person);
	}
	
	// Delete /id
	public void deleteById(int id) {
		Person person = findById(id);
		entityManager.remove(person);
	}
	
	public List<Person> findAll(){
		TypedQuery<Person> namedQuery = entityManager.createNamedQuery("find_all_person", Person.class);
		return namedQuery.getResultList();
	}
}
