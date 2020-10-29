package com.example.trv13.entity;

import java.util.Date;

public class Person {
	private int id;
	private String name;
	private int age;
	private Date dob;
	
	public Person() {
		
	}
	
	public Person(int id, String name, int age, Date date) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.dob = date;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "\nPerson [id=" + id + ", name=" + name + ", age=" + age + ", dob=" + dob + "]";
	}
	
}
