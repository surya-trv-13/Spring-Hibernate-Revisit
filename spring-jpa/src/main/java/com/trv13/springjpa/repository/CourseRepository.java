package com.trv13.springjpa.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.trv13.springjpa.entity.Course;

@Repository
@Transactional
public class CourseRepository {
	
	@PersistenceContext
	EntityManager em;
		
	public Course findById(Long id) {
		return em.find(Course.class, id);
	}
	
	public void deleteById(Long id) {
		Course course = findById(id);
		em.remove(course);
	}
	
	public Course save(Course course) {
		if(course.getId() == null) {
			em.persist(course); // Insert in table
		}else {
			em.merge(course); //Update in table
		}
		return course;
	}
	
	public void playWithEntityManager() {
		Course course = new Course("Java by Rasmi das");
		em.persist(course);
		
		course.setName("Java in 100 steps");
	}
}
