package com.trv13.map.ManyToMany;

import java.util.List;

public class Project {
	private int projectId;
	private String projectName;
	private int estimateDays;
	private List<Employee> employee;
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Project(int projectId, String projectName, int estimateDays, List<Employee> employee) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
		this.estimateDays = estimateDays;
		this.employee= employee;
	}
	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public int getEstimateDays() {
		return estimateDays;
	}
	public void setEstimateDays(int estimateDays) {
		this.estimateDays = estimateDays;
	}
	public List<Employee> getEmployee() {
		return employee;
	}
	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}
}
