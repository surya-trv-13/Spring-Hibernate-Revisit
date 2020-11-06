package com.trv13.springjpa.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.trv13.springjpa.entity.Course;

@Repository
public class CourseRepository {
	
	@PersistenceContext
	EntityManager em;
		
	public Course findById(int id) {
		return em.find(Course.class, id);
	}
}
