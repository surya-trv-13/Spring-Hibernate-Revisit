package com.trv13.ProjectWithMaven.Embedded;

import java.util.Date;

public class Profession {
	private String type;
	private String employeeId;
	private Date joinDate;
	private boolean isWorking;
	public Profession() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Profession(String type, String employeeId, Date joinDate, boolean isWorking) {
		super();
		this.type = type;
		this.employeeId = employeeId;
		this.joinDate = joinDate;
		this.isWorking = isWorking;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public Date getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
	public boolean getIsWorking() {
		return isWorking;
	}
	public void setIsWorking(boolean isWorking) {
		this.isWorking = isWorking;
	}
	
	@Override
	public String toString() {
		return "Professsion [type=" + type + ", EmployeeId=" + employeeId + ", joinDate=" + joinDate + ", isWorking="
				+ isWorking + "]";
	}
}
