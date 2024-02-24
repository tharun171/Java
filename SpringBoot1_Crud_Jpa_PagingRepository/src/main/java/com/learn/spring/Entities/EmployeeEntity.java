package com.learn.spring.Entities;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="EmployeeData1")
public class EmployeeEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator="entity_Seq")
	//no seperate name for sequence table
	//same name as generator name used to create another table for sequence
	@SequenceGenerator(name="entity_Seq",initialValue = 1001,allocationSize = 1)
	//creating a seperate tbale for sequence
	//@SequenceGenerator(name="entity_Seq",sequenceName ="employeedata1Seq",initialValue = 1001,allocationSize = 1)
	@Column(name="id")
	private Integer empId;
	@Column(name="name")
	private String empName;
	@Column(name="role")
	private String empRole;
	@Column(name="salary")
	private Float empSalary;
	@Column(name="joindate")
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	@JsonFormat(shape=JsonFormat.Shape.STRING,pattern = "dd-MM-yyyy")
	private Date empJoinDate;
	
	
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
		return "\nEmployeeEntity [empId=" + empId + ", empName=" + empName + ", empRole=" + empRole + ", empSalary="
				+ empSalary + ", empJoinDate=" + empJoinDate + "]";
	}
	
	
	
}
