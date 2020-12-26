package com.trv13.ProjectWithMaven.Embedded;

import java.util.Date;

public class Profession {
	private String type;
	private String EmployeeId;
	private Date joinDate;
	private boolean isWorking;
	public Profession() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Profession(String type, String employeeId, Date joinDate, boolean isWorking) {
		super();
		this.type = type;
		EmployeeId = employeeId;
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
		return EmployeeId;
	}
	public void setEmployeeId(String employeeId) {
		EmployeeId = employeeId;
	}
	public Date getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
	public boolean isWorking() {
		return isWorking;
	}
	public void setWorking(boolean isWorking) {
		this.isWorking = isWorking;
	}
	
	@Override
	public String toString() {
		return "Professsion [type=" + type + ", EmployeeId=" + EmployeeId + ", joinDate=" + joinDate + ", isWorking="
				+ isWorking + "]";
	}
}
