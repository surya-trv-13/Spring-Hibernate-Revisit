package com.trv13.ProjectWithMaven.Student;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="student_details")
public class Student {
	@Id
	@GeneratedValue
	private int id;
	
	@Column(name="student_name")
	private String name;
	
	@Column(name="student_subject")
	private String subject;
	
	@Transient	// This will restrict in creating column for the given field
	private int x;
	
	public Student() {
		super();
	}
	
	public Student(int id, String name, String subject, int x) {
		super();
		this.id = id;
		this.name = name;
		this.subject = subject;
		this.x = x;
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", subject=" + subject + "]";
	}
}
