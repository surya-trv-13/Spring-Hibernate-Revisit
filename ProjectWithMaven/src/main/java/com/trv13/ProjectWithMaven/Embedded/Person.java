package com.trv13.ProjectWithMaven.Embedded;

public class Person {
	private int personId;
	private String name;
	private String phone;
	private boolean isAlive;
	private Profession profession;
	public Person() {
		super();
	}
	public Person(int personId, String name, String phone, boolean isAlive, Profession profession) {
		super();
		this.personId = personId;
		this.name = name;
		this.phone = phone;
		this.isAlive = isAlive;
		this.profession = profession;
	}
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public boolean getIsAlive() {
		return isAlive;
	}
	public void setIsAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}
	public Profession getProfession() {
		return profession;
	}
	public void setProfession(Profession profession) {
		this.profession = profession;
	}
}
