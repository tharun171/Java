package com.learn.spring.BusinessBeans;

import java.util.Date;

public class EmployeeBean {

	private Integer empId;
	private String empName;
	private String empRole;
	private Float empSalary;
	private Date empJoinDate;
	
	public EmployeeBean() {
		super();
		System.out.println("EmployeeBean initiated");
	}
	
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpRole() {
		return empRole;
	}
	public void setEmpRole(String empRole) {
		this.empRole = empRole;
	}
	public Float getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(Float empSalary) {
		this.empSalary = empSalary;
	}
	public Date getEmpJoinDate() {
		return empJoinDate;
	}
	public void setEmpJoinDate(Date empJoinDate) {
		this.empJoinDate = empJoinDate;
	}
	
	@Override
	public String toString() {
		return "EmployeeBean [empId=" + empId + ", empName=" + empName + ", empRole=" + empRole + ", empSalary="
				+ empSalary + ", empJoinDate=" + empJoinDate + "]";
	}
	
	
	
}
