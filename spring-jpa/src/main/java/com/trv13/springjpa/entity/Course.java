package com.trv13.springjpa.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Course {
	@Id
	@GeneratedValue
	Long id;
	
	String name;
	
	protected Course() {
	}
	
	public Course(String name) {
		this.name = name;
	}

	public Course(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + "]";
	}
}
